package com.lz.test.model;

import java.util.Date;

public class Comment {

	Integer userid;
	String info;
	Date time;
	
	public Integer getuserid() {
		return userid;
	}
	public void setuserid(Integer userid) {
		this.userid = userid;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Comment(Integer userid, String info, Date time) {
		super();
		this.userid = userid;
		this.info = info;
		this.time = time;
	}
	
}
