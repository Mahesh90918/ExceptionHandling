package customcreation;

import java.io.Serializable;

public class address {
private String location;
private String state;
private long pincode;
public address(String location, String state, long pincode) {
	super();
	this.location = location;
	this.state = state;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "address [location=" + location + ", state=" + state + ", pincode=" + pincode + "]";
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}

}
