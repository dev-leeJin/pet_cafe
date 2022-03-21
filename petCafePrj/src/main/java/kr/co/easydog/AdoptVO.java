package kr.co.easydog;

public class AdoptVO {
	
	private int adopt_num;
	private String user_id;
	private String adopt_kind;
	private String adopt_name;
	private int adopt_age;
	private boolean adopt_gender;
	private String adopt_price;
	private String adopt_phone;
	
	public AdoptVO(int adopt_num, String user_id, String adopt_kind, String adopt_name, int adopt_age,
			boolean adopt_gender, String adopt_price, String adopt_phone) {
		super();
		this.adopt_num = adopt_num;
		this.user_id = user_id;
		this.adopt_kind = adopt_kind;
		this.adopt_name = adopt_name;
		this.adopt_age = adopt_age;
		this.adopt_gender = adopt_gender;
		this.adopt_price = adopt_price;
		this.adopt_phone = adopt_phone;
	}
	
	public int getAdopt_num() {
		return adopt_num;
	}
	public void setAdopt_num(int adopt_num) {
		this.adopt_num = adopt_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getAdopt_kind() {
		return adopt_kind;
	}
	public void setAdopt_kind(String adopt_kind) {
		this.adopt_kind = adopt_kind;
	}
	public String getAdopt_name() {
		return adopt_name;
	}
	public void setAdopt_name(String adopt_name) {
		this.adopt_name = adopt_name;
	}
	public int getAdopt_age() {
		return adopt_age;
	}
	public void setAdopt_age(int adopt_age) {
		this.adopt_age = adopt_age;
	}
	public boolean isAdopt_gender() {
		return adopt_gender;
	}
	public void setAdopt_gender(boolean adopt_gender) {
		this.adopt_gender = adopt_gender;
	}
	public String getAdopt_price() {
		return adopt_price;
	}
	public void setAdopt_price(String adopt_price) {
		this.adopt_price = adopt_price;
	}
	public String getAdopt_phone() {
		return adopt_phone;
	}
	public void setAdopt_phone(String adopt_phone) {
		this.adopt_phone = adopt_phone;
	}

	@Override
	public String toString() {
		return "AdoptVO [adopt_num=" + adopt_num + ", user_id=" + user_id + ", adopt_kind=" + adopt_kind
				+ ", adopt_name=" + adopt_name + ", adopt_age=" + adopt_age + ", adopt_gender=" + adopt_gender
				+ ", adopt_price=" + adopt_price + ", adopt_phone=" + adopt_phone + "]";
	}
	
}
