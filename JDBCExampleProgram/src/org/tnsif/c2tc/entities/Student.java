package org.tnsif.c2tc.entities;

public class Student {
	private int uid;
	private String name;
	
	public Student(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public Student() 
	{
		
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
	

}
