package com.hjd.jdbc;

public class Student {
	private int id;
	private String name;
	private String gener;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	@Override
	public String toString() {
		return "Student [gener=" + gener + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	
	
}
