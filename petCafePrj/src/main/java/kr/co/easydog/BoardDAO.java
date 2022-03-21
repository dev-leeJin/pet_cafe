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

public class BoardDAO {
	private DataSource ds=null;
	private static BoardDAO dao = new BoardDAO();
	private BoardDAO() {
		try {
			Context ct = new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/jdbc/mysql");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static BoardDAO getInstance() {
		if(dao==null) {
			dao=new BoardDAO();
		}
		return dao;
	}
	
	public List<BoardVO> getAllBoardList(){
		Connection con = null;
		PreparedStatement pmt = null;
		ResultSet  rs = null;
		List<BoardVO> boardList = new ArrayList<>();
	try {
		con=ds.getConnection();
		String sql="select*from boardinfo order by board_num desc";
		pmt = con.prepareStatement(sql);
		rs = pmt.executeQuery();
		while(rs.next()) {
		int boardNum=rs.getInt("board_num");
		String title=rs.getString("title");
		String content=rs.getString("content");
		String writer=rs.getString("writer");
		Date bdate=rs.getDate("bdate");
		Date mdate=rs.getDate("mdate");
		int hit=rs.getInt("hit");
		
		BoardVO boardDate = new BoardVO(boardNum,title,content,writer,bdate,mdate,hit);
		boardList.add(boardDate);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
		con.close();
		pmt.close();
		rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return boardList;	
	}
	
	public void insertBoard(String title,String content,String writer) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql = "insert into boardinfo(title,content,writer) value(?,?,?)";
			pmt=con.prepareStatement(sql);
			pmt.setString(1, title);
			pmt.setString(2, content);
			pmt.setString(3, writer);
			pmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public BoardVO getBoardDetail(int board_num) {
		Connection con=null;
		PreparedStatement pmt=null;
		ResultSet rs= null;
		BoardVO board = null;
		try {
			con=ds.getConnection();
			String sql="select*from boardinfo where board_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setInt(1, board_num);
			rs=pmt.executeQuery();
			
			if(rs.next()) {
				int boardNum=rs.getInt("board_num");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				Date bdate=rs.getDate("bdate");
				Date mdate=rs.getDate("mdate");
				int hit = rs.getInt("hit");
				
				board=new BoardVO(boardNum,title,content,writer,bdate,mdate,hit);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}
	public void getBoardDelete(int boardnum) {
		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="delete from boardinfo where board_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setInt(1, boardnum);
			pmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void getBoardUpdate(String title,String content,int boardNum) {

		Connection con=null;
		PreparedStatement pmt=null;
		try {
			con=ds.getConnection();
			String sql="update boardinfo set title=?, content=?, mdate=now() where board_num=?";
			pmt=con.prepareStatement(sql);
			pmt.setString(1, title);
			pmt.setString(2, content);
			pmt.setInt(3, boardNum);
			pmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void upHit(int strBId) {
		
		Connection con =null;
		PreparedStatement psmt=null;
		try {
			con=ds.getConnection();
			String sql = "update boardinfo set hit =(hit+1) where board_num=?";
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, strBId);
			psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
