package sqlOps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class resumeDB {

	public static void insertLoginDB(String name, String password) {
		try {
			Connection con = CP.createC();

			String q = "insert into login_info(username,password) values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String pass;

	public static boolean getLoginDB(String name) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "select password from login_info where username=?";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				pass = rs.getString("password");
				f = true;
			} else {
				f = false;
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
