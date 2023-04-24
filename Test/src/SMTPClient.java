
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 * Negotiates connection and conversation with SMTP port in order to send
 * an email message
 */
public class SMTPClient {

    static final int SMTP_PORT = 25;  // default SMTP port
    private static final boolean AUTOFLUSH = true;
    protected BufferedReader in = null;
    protected PrintStream out = null;
    protected Socket smtpSocket = null;

    /**
     *   Create a SMTPClient object to the specified host
     *   @param host the host to connect to
     *   @throws java.net.UnknownHostException
     *   @throws java.io.IOException
     **/
    public SMTPClient (String host) throws UnknownHostException, IOException {
        this(host, SMTP_PORT);
    } // SMTPClient

    public SMTPClient(String host, int port) throws UnknownHostException, IOException {
        smtpSocket = new Socket(host, port);
        in = new BufferedReader(new InputStreamReader(smtpSocket.getInputStream()));
        out = new PrintStream(smtpSocket.getOutputStream(), AUTOFLUSH);
        String echo = in.readLine();
        if (!echo.startsWith("220")) {
            throw new ProtocolException(echo);
        }
    } // SMTPClient

    public SMTPClient(InetAddress address) throws IOException {
        this(address, SMTP_PORT);
    }// SMTPClient

    public SMTPClient(InetAddress address, int port) throws IOException {
        smtpSocket = new Socket(address, port);
        in = new BufferedReader(new InputStreamReader(smtpSocket.getInputStream()));
        // use a PrintWriter so that we can autoflush the stream
        out = new PrintStream(smtpSocket.getOutputStream(), AUTOFLUSH);
        String echo = in.readLine();
        if (!echo.startsWith("220")) {
            throw new ProtocolException(echo);
        }
    }// SMTPClient

    /**
     * Send Email message with the specified parameter information
     * @param fromAddress mail address from which this message is sent
     * @param toAddress recipient addresses delimited by ";"
     * @param subject the subject of this message
     * @param message the body of the this email to be sent
     * @throws java.io.IOException
     * @throws java.net.ProtocolException
     */
    public void sendMail(String fromAddress, String toAddress, String subject,
                            String message) throws IOException, ProtocolException {
        String echo;
        InetAddress localHost;
        localHost = InetAddress.getLocalHost();
        String hostName = localHost.getHostName();

        out.println("HELO " + hostName);
        echo = in.readLine();
        if (!echo.startsWith("250")) {
            throw new ProtocolException(echo);
        }

        out.println("MAIL FROM: " + fromAddress);
        echo = in.readLine();
        if (!echo.startsWith("250")) {
            throw new ProtocolException(echo);
        }

        // send to all recipients
        StringTokenizer st = new StringTokenizer(toAddress, ";");
        while (st.hasMoreTokens()) {
            out.println("RCPT TO: " + st.nextToken());
            echo = in.readLine();
            if (!echo.startsWith("250")) {
                throw new ProtocolException(echo);
            }
        }

        out.println("DATA");
        echo = in.readLine();
        if (!echo.startsWith("354")) {
            throw new ProtocolException(echo);
        }
        out.println("From: " + fromAddress);
        out.println("To: " + toAddress);
        out.println("Subject: " + subject);
        GregorianCalendar date = new GregorianCalendar();
        out.println("Date: " + date.getTime());

        // end header with a newline
        out.println();

        // send body
        out.println(message);

        // end of DATA
        out.println(".");

        echo = in.readLine();
        if (!echo.startsWith("250")) {
            throw new ProtocolException(echo);
        }
    } // sendMail

    /**
     * Send "QUIT" commancd to SMTP reciever and close the socket
     */
    public void close() {
        try {
            out.println("QUIT");
            smtpSocket.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    } // close

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }

} // SMTPClient