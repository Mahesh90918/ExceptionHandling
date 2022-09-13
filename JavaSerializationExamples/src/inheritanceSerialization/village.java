package inheritanceSerialization;

import java.io.Serializable;

public class village extends Student  {
  String location;
 transient String state;
public village(int id, String name, double fee, String emailid, long phone_No,String location, String state) {
	super(id,name,fee,emailid,phone_No);
	this.location = location;
	this.state = state;
}
@Override
public String toString() {
	System.out.println(data());
	return "village [location=" + location + ", state=" + state + "]";
}

}
