package com.nelecture.web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@oracle.newlecture.com:1521/xepdb1";
		Connection con = DriverManager.getConnection(url, "NEWLEC", "rland");
		
		System.out.println(con.isClosed()); // 연결 안 되면 ture출력
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from member");
		
		{	
			rs.next();
			String nicName = rs.getString("nicname");
			System.out.println(nicName);
		}
		
		{	
			rs.next();
			String nicName = rs.getString("nicname");
			System.out.println(nicName);
		}
		
		{	
			rs.next();
			String nicName = rs.getString("nicname");
			System.out.println(nicName);
		}
		
		con.close(); // 반드시 닫아줘야한다. 늦게 닫으면 서버의 메모리 낭비가 많이 된다.
		
		
		
		
		
//		DriverManager
//		Connection
//		Statement
//		Resultset
		
	}

}
