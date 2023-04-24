import java.io.IOException;
import java.util.Date;

public class GenerateMail {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	//	long startingCreateMessage = System.currentTimeMillis();
		
		Date now = new Date();
		
		long startingCreateMessage =  System.currentTimeMillis();
		try {
			Thread.sleep(7*60*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        long endingAftermessage =  System.currentTimeMillis();
        
     //   long MAX_DURATION = MILLISECONDS.convert(20, MINUTES);
		
		 if(endingAftermessage-startingCreateMessage >= 7*60*1000)
		 {
			 String esubject ="Problem in creating message((Environment - Development, Database - Dyno)";
				
				StringBuffer sb = new StringBuffer();
				sb.append("Message Creation takes more than 7 minutes of time for the Job --"+"Test");
				sb.append("Note: This is an automatic system generated email. Please do not reply to this email id.");	
			//	MessageAgent.sendMail(sb.toString(),esubject);
				
				SMTPClient mailClient =null ;
				try {
					mailClient = new SMTPClient("SMTPHUB.navistar.com");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					mailClient.sendMail("Spr_ABS_Dyno_QHProcessing@navistar.com", "sanjay.javvadi@navistar.com", esubject, sb.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
	    	//	mailClient.sendMail(fromAddress, toAddress, subject, message);
	    		//logger.debug("Mail sent successfully");
				
			/*	  String smtpHostServer = "SMTPHUB.navistar.com";
				    String emailID = "sanjay.javvadi@navistar.com";
				
				  Properties props = System.getProperties();

				    props.put("mail.smtp.host", smtpHostServer);

				    Session session = Session.getInstance(props, null);
				    
				 //   Email.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
				    
				    MimeMessage msg = new MimeMessage(session);
				      //set message headers
				      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
				      msg.addHeader("format", "flowed");
				      msg.addHeader("Content-Transfer-Encoding", "8bit");

				      msg.setFrom(new InternetAddress("no_reply@example.com", "NoReply-JD"));

				      msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));

				      msg.setSubject(esubject, "UTF-8");

				      msg.setText(sb.toString(), "UTF-8");

				  //    msg.setSentDate(new Date());

				      try {
						msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sanjay.javvadi@navistar.com", false));
					} catch (AddressException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				      System.out.println("Message is ready");
			    	  Transport.send(msg);  
			    	  
			    	  
			    	  */

		 }

	}

}
