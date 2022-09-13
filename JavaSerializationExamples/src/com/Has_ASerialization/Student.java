package com.Has_ASerialization;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * If we don't add this, and run SerializeSerialVersionUIDExample then add new
	 * // attribute to this class and then run DeserializeSerialVersionUIDExample,
	 * then // we hit with java.io.InvalidClassException // private static final
	 * long serialVersionUID = 1L;
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double fee;
	private transient String Emailid;
	private transient long phone_No;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double fee, String emailid, long phone_No) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		Emailid = emailid;
		this.phone_No = phone_No;
	}

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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}

	public long getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}

	public String data() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", Emailid=" + Emailid + ", phone_No="
				+ phone_No + "]";
	}
}
