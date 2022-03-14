package kr.co.easydog;

public class PetVO {
	private int pet_num;
	private String user_id;
	private String pet_kind;
	private String pet_name;
	private int pet_age;
	private boolean pet_gender;
	
	public int getPet_num() {
		return pet_num;
	}
	public void setPet_num(int pet_num) {
		this.pet_num = pet_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPet_kind() {
		return pet_kind;
	}
	public void setPet_kind(String pet_kind) {
		this.pet_kind = pet_kind;
	}
	public String getPet_name() {
		return pet_name;
	}
	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}
	public int getPet_age() {
		return pet_age;
	}
	public void setPet_age(int pet_age) {
		this.pet_age = pet_age;
	}
	public boolean isPet_gender() {
		return pet_gender;
	}
	public void setPet_gender(boolean pet_gender) {
		this.pet_gender = pet_gender;
	}
	
	@Override
	public String toString() {
		return "PetVO [pet_num=" + pet_num + ", user_id=" + user_id + ", pet_kind=" + pet_kind + ", pet_name="
				+ pet_name + ", pet_age=" + pet_age + ", pet_gender=" + pet_gender + "]";
	}
	
	public PetVO(int pet_num, String user_id, String pet_kind, String pet_name, int pet_age, boolean pet_gender) {
		super();
		this.pet_num = pet_num;
		this.user_id = user_id;
		this.pet_kind = pet_kind;
		this.pet_name = pet_name;
		this.pet_age = pet_age;
		this.pet_gender = pet_gender;
	}
	

}
