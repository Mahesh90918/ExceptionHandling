package com.Has_ASerialization;

import java.io.Serializable;

public class Address implements Serializable{
private String door_No;
// transient keyword is NOT participating serialization but participating Deserialization
private transient String Steet;
public Address(String door_No, String steet) {
	super();
	this.door_No = door_No;
	Steet = steet;
}
public String getDoor_No() {
	return door_No;
}
public void setDoor_No(String door_No) {
	this.door_No = door_No;
}
public String getSteet() {
	return Steet;
}
public void setSteet(String steet) {
	Steet = steet;
}
@Override
public String toString() {
	return "Address [door_No=" + door_No + ", Steet=" + Steet + "]";
}

}
