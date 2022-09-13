package com.Has_ASerialization;

import java.io.Serializable;

public class village extends Student implements Serializable {
	String location;
	String state;
//HAS_A relation
	Address address;// HAS_A relation

	public village(int id, String name, double fee, String emailid, long phone_No, String location, String state,
			Address address) {
		super(id, name, fee, emailid, phone_No);
		this.location = location;
		this.state = state;
		this.address = address;
	}

	@Override
	public String toString() {
		System.out.println(data());
		return "village [location=" + location + ", state=" + state + ", address=" + address + "]";
	}

}
