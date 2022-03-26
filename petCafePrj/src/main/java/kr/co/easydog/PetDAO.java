package kr.co.easydog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PetDAO {
	
private DataSource ds=null;
	
	private static PetDAO dao=new PetDAO();
	
	private PetDAO() {
		try {
			Context ct = new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static PetDAO getInstance() {
		if(dao==null) {
			dao=new PetDAO();
		}
		return dao;
	}
	
	public void insertPet(String uid, String pkind, String pname, int page, boolean pgender) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			
			String sql="insert into petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) value(?,?,?,?,?)";
			
			pmt=con.prepareStatement(sql);
			
			pmt.setString(1, uid);
			pmt.setString(2, pkind);
			pmt.setString(3, pname);
			pmt.setInt(4, page);
			pmt.setBoolean(5, pgender);
			pmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void deletePet(int pnum) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="delete from petTbl where pet_num=?";
			
			pmt=con.prepareStatement(sql);
			
			pmt.setInt(1, pnum);
			
			pmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			con.close();
			pmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

public List<PetVO> getPetsList(int pnum){

		
		Connection con =null;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		List<PetVO> pets=new ArrayList<>();
		try {
			con=ds.getConnection();
			
			String sql="select*from petTbl where user_id=?";
			
			pmt=con.prepareStatement(sql);
			
			pmt.setString(1, uId);
			
			rs=pmt.executeQuery();
			
			while(rs.next()) {
				int pNum=rs.getInt("pet_num");
				String uid=rs.getString("user_id");
				String pkind=rs.getString("pet_kind");
				String pname=rs.getString("pet_name");
				int page=rs.getInt("pet_age");
				Boolean pgender=rs.getBoolean("pet_gender");
				
				PetVO PetDate = new PetVO(pNum,uid,pkind,pname,page,pgender);
				pets.add(PetDate);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return pets;
	}
	
	
	public PetVO getOnePet(int pnum) {
		
		Connection con =null;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		PetVO petData = null;
		try {
			con=ds.getConnection();
			
			String sql="select*from petTbl where pet_num=?";
			
			pmt=con.prepareStatement(sql);
			
			pmt.setInt(1, pnum);
			
			rs=pmt.executeQuery();
			
			if(rs.next()) {
				int pNum=rs.getInt("pet_num");
				String uid=rs.getString("user_id");
				String pkind=rs.getString("pet_kind");
				String pname=rs.getString("pet_name");
				int page=rs.getInt("pet_age");
				Boolean pgender=rs.getBoolean("pet_gender");
				
				petData = new PetVO(pNum,uid,pkind,pname,page,pgender);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return petData;
	}

	public PetVO getOnePet2(String sId) {

		Connection con =null;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		PetVO petData2 = null;
		try {
			con=ds.getConnection();
			
			String sql="select*from petTbl where user_id=?";
			
			pmt=con.prepareStatement(sql);
			
			pmt.setString(1, sId);
			
			rs=pmt.executeQuery();
			
			if(rs.next()) {
				int pNum=rs.getInt("pet_num");
				String uid=rs.getString("user_id");
				String pkind=rs.getString("pet_kind");
				String pname=rs.getString("pet_name");
				int page=rs.getInt("pet_age");
				Boolean pgender=rs.getBoolean("pet_gender");
				
				petData2 = new PetVO(pNum,uid,pkind,pname,page,pgender);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return petData2;
	}
	
	
	public void petUpdate(int pet_num,String pkind,String pname,int page, boolean pgender) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="update petTbl set pet_kind=?,pet_name=?,pet_age=?,pet_gender=? where pet_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setString(1, pkind);
			pmt.setString(2, pname);
			pmt.setInt(3, page);
			pmt.setBoolean(4, pgender);
			pmt.setInt(5, pet_num);
			pmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
