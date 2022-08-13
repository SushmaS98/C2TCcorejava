

/*
package org.tns.c2tc.entities;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="details1")
public class Student 
{
	@Id
	private int uid;
	@Column(name="student_name")
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
*/



/*Storing the Values*/
  
  
package org.tns.c2tc.entities;
 
 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Student 
{
	@Id
	private int uid;
	private String name;
	
	public Student(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
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
