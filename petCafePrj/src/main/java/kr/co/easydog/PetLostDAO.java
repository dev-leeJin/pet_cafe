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

	public List<PetLostVO> getAllPetLostList(){
		// try블럭 진입 전 Connection, PreparedStatement, ResultSet 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// try블럭 진입 전에 ArrayList 선언
		List<PetLostVO> petlostList = new ArrayList<>();
		try {
			// Connection, PreparedStatement, ResultSet을 선언합니다.
			con = ds.getConnection();
			
			// SELECT * FROM userinfo 실행 및 ResultSet에 저장
			String sql = "SELECT * FROM pet_lost";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();


			while(rs.next()) {
		
				int lostNum = rs.getInt("lost_num");
				String lostName = rs.getString("lost_name");
				String uId = rs.getString("user_id");
				String lostZone = rs.getString("lost_zone");
				int lostSize = rs.getInt("lost_size");
				int lostPhone = rs.getInt("lost_phone");
				
				PetLostVO petlostData = new PetLostVO(lostNum, lostName, uId, lostZone, lostSize, lostPhone);
				petlostList.add(petlostData);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
				rs.close();
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

	public void updatePetLost(String lostName, String lostZone, int lostSize, int lostPhone, int lostNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();	
			    
			 String sql = "UPDATE pet_lost SET lostName=?, lostZone=?, lostSize=?, lostPhone=? mdate=now() WHERE lost_num=?";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setString(1, lostName);
			 pstmt.setString(2, lostZone);
			 pstmt.setInt(3, lostSize);
			 pstmt.setInt(4, lostPhone);
			 pstmt.setInt(5, lostNum);
			 
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
				int lostSize = rs.getInt("lost_size");
				int lostPhone = rs.getInt("lost_phone");
				
				petlost = new PetLostVO(lostNum, lostName, uId, lostZone, lostSize, lostPhone);
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

    public void searchPetLost(Date sDate, Date fDate, String sd, String sgg) {
    	Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			try {
				con = ds.getConnection();	
				    
				 String sql = "SELECT * FROM pettbl WHERE (날짜컬럼 BETWEEN ? AND ?) AND (시도컬럼 = ?) AND (시군구컬럼 = ?)";
				 pstmt = con.prepareStatement(sql);
				 pstmt.setDate(1, sDate);
				 pstmt.setDate(2, fDate);
				 pstmt.setString(3, sd);
				 pstmt.setString(4, sgg);
								 
				 pstmt.executeQuery();
				 
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
    }