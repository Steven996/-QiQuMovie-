package model;

public class user {
	private int user_id;
	private String username;
	private String password;
	private int vip;
	public user(int user_id,String username,String password,int vip){
		this.password = password;
		this.vip = vip;
		this.user_id = user_id;
		this.username = username;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	
}
