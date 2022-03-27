package kr.co.easydog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AdoptDAO {

private DataSource ds = null;
	
	private static AdoptDAO dao = new AdoptDAO();
	
	private AdoptDAO() {
		try {
			Context ct = new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static AdoptDAO getInstance() {
		if(dao==null) {
			dao=new AdoptDAO();
		}
		return dao;
	}
	
	public List<AdoptVO> getAllAdoptList(int pageNum){
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		final int BOARD_COUNT = 10;
		List<AdoptVO> adoptList = new ArrayList<>();
		try {
			con=ds.getConnection();
			int limitNum = (pageNum - 1) * BOARD_COUNT;
			
			String sql="select*from adoptTbl order by adopt_num desc limit ?,?";
			
			psmt=con.prepareStatement(sql);
			
			psmt.setInt(1, limitNum);
			psmt.setInt(2, BOARD_COUNT);

			rs=psmt.executeQuery();
			while(rs.next()) {
				int anum = rs.getInt("adopt_num");
				String uid = rs.getString("user_id");
				String akind = rs.getString("adopt_kind");
				String aname = rs.getString("adopt_name");
				int aage = rs.getInt("adopt_age");
				boolean agender = rs.getBoolean("adopt_gender");
				String aprice = rs.getString("adopt_price");
				String aphone = rs.getString("adopt_phone");
				AdoptVO adoptData = new AdoptVO(anum, uid, akind, aname, aage, agender, aprice, aphone);
				adoptList.add(adoptData);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return adoptList;
	}
	
	public AdoptVO getDetail(int adopt_num) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		AdoptVO adoptData = null;
		try {
			con=ds.getConnection();
			
			String sql="select*from adoptTbl where adopt_num=?";
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, adopt_num);
			
			rs=psmt.executeQuery();
			
			if(rs.next()) {
				int anum = rs.getInt("adopt_num");
				String uid = rs.getString("user_id");
				String akind = rs.getString("adopt_kind");
				String aname = rs.getString("adopt_name");
				int aage = rs.getInt("adopt_age");
				boolean agender = rs.getBoolean("adopt_gender");
				String aprice = rs.getString("adopt_price");
				String aphone = rs.getString("adopt_phone");
				adoptData = new AdoptVO(anum, uid, akind, aname, aage, agender, aprice, aphone);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return adoptData;
	}
	
	public void deleteAdopt(int adopt_num) {
		Connection con=null;
		PreparedStatement psmt=null;
		
		try {
			con=ds.getConnection();
		
			String sql="delete from adoptTbl where adopt_num=?";
			
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, adopt_num);
			
			psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertAdopt(String uid, String kind, String name, int age, boolean gender, String price, String phone) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
		
			con=ds.getConnection();
			String sql = "insert into adoptTbl values(null,?,?,?,?,?,?,?)";
			psmt=con.prepareStatement(sql);
			psmt.setString(1, uid);
			psmt.setString(2, kind);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setBoolean(5, gender);
			psmt.setString(6, price);
			psmt.setString(7, phone);
			psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateAdopt(int anum, String kind, String name, int age, boolean gender, String price, String phone) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
			con=ds.getConnection();
			
			String sql = "update adoptTbl set adopt_kind=?, adopt_name=?, adopt_age=?, "
					+ "adopt_gender=?, adopt_price=?, adopt_phone=? where adopt_num=?";
			
			psmt=con.prepareStatement(sql);
			
			psmt.setString(1, kind);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			psmt.setBoolean(4, gender);
			psmt.setString(5, price);
			psmt.setString(6, phone);
			psmt.setInt(7, anum);
			
			psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				psmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

	public int getPageNum() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT COUNT(*) FROM adoptTbl";
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
