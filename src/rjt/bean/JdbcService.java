package rjt.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcService {
	JdbcDao dao;
	public JdbcService() {
		// TODO Auto-generated constructor stub
		try {
			dao = new JdbcDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean saveUser(String fname,String lname,String password, String gender, String skill, String city){
		String query = "insert into lab_user values('"+fname+"','"+lname+"','"+password+"','"
				+gender+"','"+skill+"','"+city+"')";
		try {
			dao.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean saveBill(int consumerNumber,int currentNumber,int unitConsumed,double newAmount){
		String query = "insert into Billdetails values(SEQ_BILL_NUM.nextval,'"+consumerNumber+"','"+currentNumber+"',"
				+ "'"+unitConsumed+"','"+newAmount+"',sysdate)";
		try {
			dao.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
