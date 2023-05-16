package sqlOps;

import java.sql.Connection;
import java.sql.Date;
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

	public static boolean insertPersonalDB(String name, String email, String gender, Date date, String nationality,
			String add, String prof) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into personal_info(fname,email,gender,DOB,nationality,address,profession) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, gender);
			pstmt.setDate(4, date);
			pstmt.setString(5, nationality);
			pstmt.setString(6, add);
			pstmt.setString(7, prof);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean insertAcademicsDB(String scl, int sclG, String jrc, int jrcG, String colg, int cgpa) {
		boolean f = false;
		try {
			Connection con = CP.createC();

			String q = "insert into academics(school_name,10th_percentage,jrc_name,12th_percentage,uni_name,cgpa) values(?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, scl);
			pstmt.setInt(2, sclG);
			pstmt.setString(3, jrc);
			pstmt.setInt(4, jrcG);
			pstmt.setString(5, colg);
			pstmt.setInt(6, cgpa);
			pstmt.executeUpdate();
			con.close();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
