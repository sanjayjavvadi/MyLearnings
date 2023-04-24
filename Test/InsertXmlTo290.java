package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Properties;

public class InsertXmlTo290 {

	public static void main(String args[]) {

		//Try in test server first.... SPRSFSUDB
		String sURL = "jdbc:db2://SPRSFSUDB:50000/VEB2";
		String path = "C:\\XML\\";
		
		System.out.println("Load XML data from " + path);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {

			// Connect to the database
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			// GET CONNECTION
			con = DriverManager.getConnection(sURL, "sprveps", "lalala3");
			System.out.println("Connected to DB...");			
			
			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();
			String fileName = null;
			String jobNo =  null;
			String sqlMissingXml = "select A.JOB_NO, A.ATA_SYS_CD_2, A.VCP_NME from yzdbdat.VETP100_JOB_CMPNT a left join  yzdbdat.VETP290_ESC_DATA b on a.job_no = b.job_no " +
					   " where A.VCP_NME IN ('NAVVCM01','NAVESC01') AND A.JOB_NO IN (?) AND b.job_no is null";
			String sql = "insert into yzdbdat.VETP290_ESC_DATA values (?,?,?,?,?)";
			
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			for (int i = 0; i < listOfFiles.length; i++) {
			  if (listOfFiles[i].isFile()) {
				 fileName = listOfFiles[i].getName();
				 jobNo = fileName.substring(2, 8);
			    
			    try {
			    	//Find missing ATA Code and VCP Name
			    	stmt = con.prepareStatement(sqlMissingXml);
			    	stmt.setString(1, jobNo);
					rs = stmt.executeQuery();
					
					while (rs.next()) {
						File file = new File(path + fileName);
						int filelength = (int) file.length();
						InputStream fin = new FileInputStream(file);
						
						System.out.println("Loading File: " + fileName + "    || Job No: " + jobNo);
						pstmt = con.prepareStatement(sql);

						pstmt.setString(1, rs.getString(1));
						pstmt.setString(2, rs.getString(2));
						pstmt.setString(3, rs.getString(3));
						pstmt.setString(4, "2019-04-09 07:34:00");
						pstmt.setBinaryStream(5, fin, filelength);

						pstmt.execute();
						System.out.println("XML inserted for Job : " + jobNo);
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
			    
			  } else if (listOfFiles[i].isDirectory()) {
			    System.out.println("Directory " + listOfFiles[i].getName());
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
