package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Post;
import model.User;

public class UserDAOImpl 
{
	private static Connection con;

	static {
		try {

			con = ConnectorUtility.getCon();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean signIn(User user) {

		try {
			PreparedStatement pst = con.prepareStatement("select * from user where email= ? and password = ?");
			pst.setString(1, user.getEmail());
			pst.setString(2, user.getPassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean signUp(User user) {
		boolean res = false;
		try {
			PreparedStatement pst = con.prepareStatement("insert into user (first_name,last_name,email,password) values (?,?,?,?)");
			pst.setString(1, user.getFname());
			pst.setString(2, user.getLname());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getPassword());
			
			
			
			res = (pst.executeUpdate() == 1) ? true : false ;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
