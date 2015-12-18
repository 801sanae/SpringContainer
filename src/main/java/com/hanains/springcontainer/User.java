package com.hanains.springcontainer;

import org.springframework.stereotype.Component;

@Component
public class User {
	private long no;
	private String name;
	private Friend friend;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, long no) {
		this.name = name;
		this.no = no;
	}
	

	public long getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
	public Friend getFriend() {
		return friend;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + "]";
	}


	
}
