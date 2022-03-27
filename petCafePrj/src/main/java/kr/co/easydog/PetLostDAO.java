
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

	public void insertPetLost(String lostName, String lostZone, String lostSize, int lostPhone, Date lostDate) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();

			String sql = "INSERT INTO pet_lost(lost_name, lost_zone, lost_size, lost_phone, lost_date) VALUES(?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, lostName);
			pstmt.setString(2, lostZone);
			pstmt.setString(3, lostSize);
			pstmt.setInt(4, lostPhone);
			pstmt.setDate(5, lostDate);

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

	public List<PetLostVO> getAllPetLostList(int pageNum){
		// try블럭 진입 전 Connection, PreparedStatement, ResultSet 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		final int BOARD_COUNT = 10;
		// try블럭 진입 전에 ArrayList 선언
		List<PetLostVO> petlostList = new ArrayList<>();
		try {
			// Connection, PreparedStatement, ResultSet을 선언합니다.
			con = ds.getConnection();
			int limitNum = (pageNum - 1) * BOARD_COUNT;
			
			// SELECT * FROM userinfo 실행 및 ResultSet에 저장
			String sql = "SELECT * FROM pet_lost order by lost_num desc limit ?,?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, limitNum);
			pstmt.setInt(2, BOARD_COUNT);
			
			rs = pstmt.executeQuery();


			while(rs.next()) {
		
				int lostNum = rs.getInt("lost_num");
				String lostName = rs.getString("lost_name");
				String uId = rs.getString("user_id");
				String lostZone = rs.getString("lost_zone");
				String lostSize = rs.getString("lost_size");
				int lostPhone = rs.getInt("lost_phone");
				Date lostDate = rs.getDate("lost_date");
				
				PetLostVO petlostData = new PetLostVO(lostNum, lostName, uId, lostZone, lostSize, lostPhone, lostDate);
				petlostList.add(petlostData);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
				
			} catch(SQLException se) {
				se.printStackTrace();
			}
		}	
		return petlostList;
  }
	
	
	

	public void deletePetLost(int lostNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();	
			    
			 String sql = "DELETE FROM pet_lost WHERE lost_num=?";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setInt(1, lostNum);
			 
			 pstmt.executeUpdate();
			 
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			    pstmt.close();
			    
				}catch(Exception e) {
					e.printStackTrace();
			}
		}
	}

	public void updatePetLost(String lostName, String lostZone, String lostSize, int lostPhone, Date lostDate, int lostNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();	
			    
			 String sql = "UPDATE pet_lost SET lostName=?, lostZone=?, lostSize=?, lostPhone=?, lostDate=?, mdate=now() WHERE lost_num=?";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setString(1, lostName);
			 pstmt.setString(2, lostZone);
			 pstmt.setString(3, lostSize);
			 pstmt.setInt(4, lostPhone);
			 pstmt.setDate(5, lostDate);
			 pstmt.setInt(6, lostNum);
			 
			 pstmt.executeUpdate();
			 
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
			    pstmt.close();
			    
				}catch(Exception e) {
					e.printStackTrace();
			}
		}
	}		

	public PetLostVO detailPetLost(int lost_num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		PetLostVO petlost = null;
		try {
            con = ds.getConnection();
			
			String sql = "SELECT * FROM pet_lost WHERE lost_num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, lost_num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int lostNum = rs.getInt("lost_num");
				String lostName = rs.getString("lost_name");
				String uId = rs.getString("user_id");
				String lostZone = rs.getString("lost_zone");
				String lostSize = rs.getString("lost_size");
				int lostPhone = rs.getInt("lost_phone");
				Date lostDate = rs.getDate("lost_date");
				
				petlost = new PetLostVO(lostNum, lostName, uId, lostZone, lostSize, lostPhone, lostDate);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
				rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return petlost;
    }
    public int getPageNum() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT COUNT(*) FROM pet_lost";
		int pageNum = 0;
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pageNum = rs.getInt(1);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
			} catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return pageNum;
	}
}

