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

public class ContestDAO {

	private DataSource ds = null;
	
	private static ContestDAO dao = new ContestDAO();
	private ContestDAO() {
		try {
			Context ct = new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static ContestDAO getInstance() {
		if(dao==null) {
			dao=new ContestDAO();
		}
		return dao;
	}
	
	public List<ContestVO> getAllContestList(){
		Connection con = null;
		PreparedStatement psmt =null;
		ResultSet rs=null;
		List<ContestVO> contestList=new ArrayList<>();
		try {
			con=ds.getConnection();
			String sql="select*from pet_contest order by cont_num desc";
			psmt=con.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) {
				int cnum=rs.getInt("cont_num");
				String uid=rs.getString("user_id");
				String ctitle=rs.getString("cont_title");
				String ccontent=rs.getString("cont_content");
				int pnum=rs.getInt("pet_num");
				int chit=rs.getInt("cont_hit");
				int cvotes=rs.getInt("cont_votes");
				ContestVO contestData = new ContestVO(cnum, uid,ctitle,ccontent, pnum, chit, cvotes);
				contestList.add(contestData);
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
		return contestList;
	}
	public ContestVO getDetail(int cnum) {
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs= null;
		ContestVO contest=null;
		try {
			con=ds.getConnection();
			String sql="select*from pet_contest where cont_num=?";
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, cnum);
			rs=psmt.executeQuery();
			if(rs.next()) {
				int cNum=rs.getInt("cont_num");
				String uid=rs.getString("user_id");
				String ctitle=rs.getString("cont_title");
				String ccontent=rs.getString("cont_content");
				int pnum=rs.getInt("pet_num");
				int chit=rs.getInt("cont_hit");
				int cvotes=rs.getInt("cont_votes");
				contest=new ContestVO(cNum, uid,ctitle,ccontent, pnum, chit, cvotes);
				
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
		
		return contest;
	}
	
	public void ContestDelete(int cnum) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
			con=ds.getConnection();
			String sql="delete from pet_contest where cont_num=?";
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, cnum);
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
	
	public void ContestInsert(String uid,String title,String content, int pnum, int pvotes) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
		
			con=ds.getConnection();
			String sql = "insert into pet_contest(user_id, cont_title, cont_content, pet_num, cont_votes) values(?,?,?,?,?)";
			psmt=con.prepareStatement(sql);
			psmt.setString(1, uid);
			psmt.setString(2, title);
			psmt.setString(3, content);
			psmt.setInt(4, pnum);
			psmt.setInt(5, pvotes);
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
	

	public void ContestUpdate(String title,String content,int cnum) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
			con=ds.getConnection();
			String sql = "update pet_contest set cont_title=?, cont_content=? where cont_num=?";
			psmt=con.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, content);
			psmt.setInt(3, cnum);
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
	
	public void upHit(int cnum) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
			con=ds.getConnection();
			String sql="update pet_contest set cont_hit=(cont_hit+1) where cont_num=?";
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, cnum);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
