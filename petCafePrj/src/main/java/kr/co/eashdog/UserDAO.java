package kr.co.eashdog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {
	
	private DataSource ds=null;
	
	private static UserDAO dao=new UserDAO();
	
	private UserDAO() {
		try {
			Context ct = new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static UserDAO getInstance() {
		if(dao==null) {
			dao=new UserDAO();
		}
		return dao;
	}
	
	public List<UserVO> getAllUserList(){
		Connection con =null;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		List<UserVO> userList=new ArrayList<>();
		try {
			con=ds.getConnection();
			String sql="select*from userinfo";
			pmt=con.prepareStatement(sql);
			rs=pmt.executeQuery();
			while(rs.next()) {
				int unum=rs.getInt("user_num");
				String uid=rs.getString("user_id");
				String upw=rs.getString("pw");
				String uname=rs.getString("name");
				String uemail=rs.getString("email");
				String uadmin=rs.getString("admin");
				
				UserVO UserDate = new UserVO(unum,uid,upw,uname,uemail,uadmin);
				userList.add(UserDate);
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
		return userList;
	}
	
	public void deleteUser(String fnum) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="delete from userinfo where user_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setString(1, fnum);
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
	
	public void insertUser(int fnum,String fid,String fpw,String fname,String femail,String fadmin) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="insert into userinfo value(?,?,?,?,?,?)";
			pmt=con.prepareStatement(sql);
			pmt.setInt(1, fnum);
			pmt.setString(2, fid);
			pmt.setString(3, fpw);
			pmt.setString(4, fname);
			pmt.setString(5, femail);
			pmt.setString(6, fadmin);
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
	
	
	public UserVO getUserData(int fnum) {
		Connection con=null;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		UserVO user=null;
		try {
			con=ds.getConnection();
			String sql="select*from userinfo where user_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setInt(1, fnum);
			rs=pmt.executeQuery();
			if(rs.next()) {
				int unum=rs.getInt("user_num");
				String uid=rs.getString("user_id");
				String upw=rs.getString("pw");
				String uname=rs.getString("name");
				String uemail=rs.getString("email");
				String uadmin=rs.getString("uadmin");
				
				user=new UserVO(unum,uid,upw,uname,uemail,uadmin);
				
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
		return user;
	}
	
	public void userUpdate(int unum,String uid,String upw,String uname,String uemail,String uadmin) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="update userinfo set user_id=?,pw=?,name=?,email=? where user_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setString(1, uid);
			pmt.setString(2, upw);
			pmt.setString(3, uname);
			pmt.setString(4, uemail);
			pmt.setString(5, uemail);
			pmt.setInt(6, unum);
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
