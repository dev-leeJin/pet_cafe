package kr.co.easydog;

import java.sql.Date;

import javax.xml.crypto.Data;

public class PetLostVO {

	private int lost_num;
	private String lost_name;
	private String user_id;
	private String lost_zone;
	private int lost_size;
	private int lost_phone;
	private int lost_date;
	
	
	
	public PetLostVO(int lost_num, String lost_name, String user_id, String lost_zone, int lost_size,
			int lost_phone, int lost_date) {
		super();
		this.lost_num = lost_num;
		this.lost_name = lost_name;
		this.user_id = user_id;
		this.lost_zone = lost_zone;
		this.lost_size = lost_size;
		this.lost_phone = lost_phone;
		this.lost_date = lost_date;
	}


	public int getLost_num() {
		return lost_num;
	}



	public void setLost_num(int lost_num) {
		this.lost_num = lost_num;
	}



	public String getLost_name() {
		return lost_name;
	}



	public void setLost_name(String lost_name) {
		this.lost_name = lost_name;
	}



	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public String getLost_zone() {
		return lost_zone;
	}



	public void setLost_zone(String lost_zone) {
		this.lost_zone = lost_zone;
	}



	public int getLost_size() {
		return lost_size;
	}



	public void setLost_size(int lost_size) {
		this.lost_size = lost_size;
	}



	public int getLost_phone() {
		return lost_phone;
	}



	public void setLost_phone(int lost_phone) {
		this.lost_phone = lost_phone;
	}


	public int getLost_date() {
		return lost_date;
	}



	public void setLost_date(int lost_date) {
		this.lost_date = lost_date;
	}



	@Override
	public String toString() {
		return "PetLostVO [lost_num=" + lost_num + ", lost_name=" + lost_name + ", user_id=" + user_id + ", lost_zone="
				+ lost_zone + ", lost_size=" + lost_size + ", lost_phone=" + lost_phone + ", lost_date=" + lost_date
				+ "]";
	}

}