package kr.co.easydog;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PetLostDAO {
private DataSource ds = null;
	
	private static PetLostDAO dao = new PetLostDAO();
	
	private PetLostDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static PetLostDAO getInstance() {
		if(dao == null) {
			dao = new PetLostDAO();
		}
		return dao;
	}

	public void insertPetLost(String lostName, String lostZone, int lostSize, int lostPhone) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();

			String sql = "INSERT INTO pet_lost(lost_name, lost_zone, lost_size, lost_phone) VALUES(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, lostName);
			pstmt.setString(2, lostZone);
			pstmt.setInt(3, lostSize);
			pstmt.setInt(4, lostPhone);

			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
	

