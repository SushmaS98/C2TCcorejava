package org.tns.c2tc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	//@ManyToOne
	@OneToOne
	private Student student;
	
	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
