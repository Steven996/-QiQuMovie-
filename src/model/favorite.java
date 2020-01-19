package model;

public class favorite {
	private int fav_id;
	private int user_id;
	private int mov_id;
	public favorite(int fav_id,int user_id,int mov_id){
		this.fav_id = fav_id;
		this.user_id = user_id;
	}
	public int getFav_id() {
		return fav_id;
	}
	public void setFav_id(int fav_id) {
		this.fav_id = fav_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getMov_id() {
		return mov_id;
	}
	public void setMov_id(int mov_id) {
		this.mov_id = mov_id;
	}
}
