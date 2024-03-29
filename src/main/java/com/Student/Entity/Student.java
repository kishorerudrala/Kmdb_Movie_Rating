package com.Student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long s_id;
	private String s_name;
	private String s_branch;
	private String s_college;

	public long getS_id() {
		return s_id;
	}

	public void setS_id(long s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_branch() {
		return s_branch;
	}

	public void setS_branch(String s_branch) {
		this.s_branch = s_branch;
	}

	public String getS_college() {
		return s_college;
	}

	public void setS_college(String s_college) {
		this.s_college = s_college;
	}

	public Student(long s_id, String s_name, String s_branch, String s_college) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_branch = s_branch;
		this.s_college = s_college;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_branch=" + s_branch + ", s_college=" + s_college
				+ "]";
	}
}
