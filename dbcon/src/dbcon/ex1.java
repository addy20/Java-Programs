package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.Statement;

public class ex1 {

	public static void main(String[] args) {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    try {
    	Class.forName("com.mysql.jdbc.Driver");
    	System.out.println("Connecting to database...");
    	conn= DriverManager.getConnection("jdc:mysql://localhost/university","root","7008");
    	System.out.println("Creating Statement...");
    	stmt=(Statement) conn.createStatement();
    	String query="SELECT col_name from college where col_id=102";
    	rs=stmt.executeQuery(query);
    	DatabaseMetaData meta=(DatabaseMetaData) conn.getMetaData();
    	System.out.println("We are using "+meta.getDatabaseProductName());
    	System.out.println("Version is "+meta.getDatabaseProductVersion());
    	while(rs.next()) {
    		String col_name=rs.getString("col_name");
    		System.out.println(" "+col_name);
    	}
    }
    catch(SQLException se) {
    	System.out.println("SQLError : "+se.getMessage()+"code: "+se.getErrorCode());
    }
    catch(Exception e) {
    	System.out.println(e.getMessage());
    	e.printStackTrace();
    }
    finally {
    	try {
    		stmt.close();
    		rs.close();
    		conn.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
	}

}
