package kr.co.easydog;

public class UserVO {
	private int user_num;
	private String user_id;
	private String pw;
	private String name;
	private String email;
	private String admin;
	public UserVO(int user_num, String user_id, String pw, String name, String email, String admin) {
		super();
		this.user_num = user_num;
		this.user_id = user_id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.admin = admin;
	}
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "UserVO [user_num=" + user_num + ", user_id=" + user_id + ", pw=" + pw + ", name=" + name + ", email="
				+ email + ", admin=" + admin + "]";
	}
	
	
	
	
}