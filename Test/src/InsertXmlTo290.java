import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InsertXmlTo290 {

	public static void main(String args[]) {

		//Try in test server first....SPRSFSUDB //ESCSFSUDB
		String sURL = "jdbc:db2://brksvp845:50000/VEB2DB";
		//String path = "\\\\brkdfs01\\common\\Brookfield\\VEI_FILES1\\Production\\veifiles\\Manufacturing\\";
		String path = "C:\\XML\\";
		
		 
		// System.out.println(dateTime.format(formatter).toString());
		
		System.out.println("Load XML data from " + path);
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// Connect to the database
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			// GET CONNECTION
			con = DriverManager.getConnection(sURL, "sprveps", "lalala3");
			System.out.println("Connected to DB...");			
			
			//File folder = new File(path);
			//File[] listOfFiles = folder.listFiles();
			String fileName = null;
			String jobNo =  null;
			String sqlMissingXml = "select A.JOB_NO, A.ATA_SYS_CD_2, A.VCP_NME from yzdbdat.VETP100_JOB_CMPNT a left join  yzdbdat.VETP290_ESC_DATA b on a.job_no = b.job_no " +
					   " where A.VCP_NME IN ('NAVVCM01','NAVESC01') AND A.JOB_NO IN (?) ";
			//AND b.job_no is null
			String sql = "insert into yzdbdat.VETP290_ESC_DATA values (?,?,?,?,?)";
			
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			//for (int i = 0; i < listOfFiles.length; i++) {
			  //if (listOfFiles[i].isFile()) {
				 //fileName = listOfFiles[i].getName();
				 //jobNo = fileName.substring(2, 8);
			
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\XML\\Job1.txt"))); 
			
			ZonedDateTime dateTime = ZonedDateTime.now();
			 
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			 
			// System.out.println(dateTime.format(formatter).toString());
			  
      	    while ((jobNo = br.readLine()) != null) {
      	    	if (jobNo != null) {
      	    		fileName = "PF" + jobNo + ".xml";
      	    		//System.out.println(fileName);  
      	    		
      	    		try {
			    	
				    	//Find missing ATA Code and VCP Name
				    	stmt = con.prepareStatement(sqlMissingXml);
				    	stmt.setString(1, jobNo);
						rs = stmt.executeQuery();
						
						while (rs.next()) {
							File file = new File(path + fileName);
							System.out.println(path + fileName);
							int filelength = (int) file.length();
							InputStream fin = new FileInputStream(file);
							
							System.out.println("Loading File: " + fileName + "    || Job No: " + jobNo);
							pstmt = con.prepareStatement(sql);
	
							pstmt.setString(1, rs.getString(1));
							pstmt.setString(2, rs.getString(2));
							pstmt.setString(3, rs.getString(3));
							pstmt.setString(4,"2020-01-29 00:00:00" );
						//	pstmt.setString(4, new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date() )); 
								 

							pstmt.setBinaryStream(5, fin, filelength);
	
							pstmt.execute();
							System.out.println("XML loaded for Job : " + jobNo);
						}
					} catch (java.io.FileNotFoundException e) {
						System.err.print("ClassNotFoundException: ");
						System.err.println(e.getMessage());
					} catch (SQLException ex) {
						System.err.print("SQLException: ");
						System.err.println(ex.getMessage());
					}
				    finally {
				    	if (stmt != null)
				    		stmt.close();
						if (rs != null)
							rs.close();
				    }
      	    	} 
			}
			
			if (pstmt == null)
				System.out.println("Did not find any missing XMLs....");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
