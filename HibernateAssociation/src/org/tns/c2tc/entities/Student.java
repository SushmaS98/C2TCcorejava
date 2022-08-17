package org.tns.c2tc.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
	{
		@Id
		private int uid;
		private String name;
		//@OneToMany(mappedBy = "student")
		@ManyToMany(mappedBy = "student")
		private List<Laptop> laptop=new ArrayList();
		
		
		public List<Laptop> getLaptop() {
			return laptop;
		}
		public void setLaptop(List<Laptop> laptop) {
			this.laptop = laptop;
		}
		
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
