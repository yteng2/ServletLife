package rjt.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDao {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String username = "system";
	String password = "66894050aA";
	public JdbcDao() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	public void execute(String query) throws SQLException {
		Connection con = DriverManager.getConnection(url,username,this.password);
		Statement stmt= con.createStatement();
		stmt.executeQuery(query);
		stmt.close();
		con.close();
	}

}
