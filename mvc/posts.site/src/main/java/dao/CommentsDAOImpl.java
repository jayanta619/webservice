package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Comments;

public class CommentsDAOImpl implements CommentsDAO {

	private static Connection con;

	static {
		try {

			con = ConnectorUtility.getCon();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insertComment(Comments comments) {

		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into Comments(cbody) values(?)");
			pst.setString(1, comments.getCbody());
			res = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	
	public int updateComment(Comments comments) {
	
			int res = -1;
			try {
				PreparedStatement pst = con.prepareStatement("update Comments set  cbody = ? where cid = ?");
				
				pst.setString(1, comments.getCbody());
				pst.setInt(2, comments.getPid());
				res = pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return res;
		}


	@Override
	public int delete(int cid) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from Comments where cid = ?");
			pst.setInt(1, cid);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	@Override
	public List<Comments> view() throws SQLException {

		ArrayList<Comments> list = new ArrayList<Comments>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Comments");
		while (rs.next()) {
			list.add(new Comments(rs.getInt(1), rs.getInt(2), rs.getInt(3),rs.getString(4)));
		}

		return list;
	}


	

	/*@Override
	public Comments view(int cid) {
		Comments comments = new Comments();
		try {
			PreparedStatement pst = con.prepareStatement("select * from Comments where id = ?");
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				comments = new Comments(rs.getInt(1), rs.getInt(3), rs.getInt(4), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comments;
	}
	*/
}
