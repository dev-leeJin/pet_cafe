package kr.co.easydog;

public class ContestVO {

	private int cont_num;
	private String user_id;
	private String cont_title;
	private String cont_content;
	private int pet_num;
	private int cont_hit;
	private int cont_votes;
	public ContestVO(int cont_num, String user_id, String cont_title, String cont_content, int pet_num, int cont_hit,
			int cont_votes) {
		super();
		this.cont_num = cont_num;
		this.user_id = user_id;
		this.cont_title = cont_title;
		this.cont_content = cont_content;
		this.pet_num = pet_num;
		this.cont_hit = cont_hit;
		this.cont_votes = cont_votes;
	}
	public int getCont_num() {
		return cont_num;
	}
	public void setCont_num(int cont_num) {
		this.cont_num = cont_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCont_title() {
		return cont_title;
	}
	public void setCont_title(String cont_title) {
		this.cont_title = cont_title;
	}
	public String getCont_content() {
		return cont_content;
	}
	public void setCont_content(String cont_content) {
		this.cont_content = cont_content;
	}
	public int getPet_num() {
		return pet_num;
	}
	public void setPet_num(int pet_num) {
		this.pet_num = pet_num;
	}
	public int getCont_hit() {
		return cont_hit;
	}
	public void setCont_hit(int cont_hit) {
		this.cont_hit = cont_hit;
	}
	public int getCont_votes() {
		return cont_votes;
	}
	public void setCont_votes(int cont_votes) {
		this.cont_votes = cont_votes;
	}
	@Override
	public String toString() {
		return "ContestVO [cont_num=" + cont_num + ", user_id=" + user_id + ", cont_title=" + cont_title
				+ ", cont_content=" + cont_content + ", pet_num=" + pet_num + ", cont_hit=" + cont_hit + ", cont_votes="
				+ cont_votes + "]";
	}
	
	
	
	
	
}
