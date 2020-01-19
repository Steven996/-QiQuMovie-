package model;

import java.util.Date;
import java.util.List;

public class Movie {
	private int movie_id;
	private String moviename;
	private int hits;
	private String picture;
	private String detail;
	private String date;
	private int movietype;
	
	public Movie(int movie_id,String moviename,int hits,String picture,String detail,String date,int movietype){
		this.movie_id = movie_id;
		this.moviename = moviename;
		this.hits = hits;
		this.movietype = movietype;
		this.picture = picture;
		this.detail = detail;
		this.date = date;
		
		
	}
	

	public int getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}


	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMovietype() {
		return movietype;
	}
	public void setMovietype(int movietype) {
		this.movietype = movietype;
	}
}
