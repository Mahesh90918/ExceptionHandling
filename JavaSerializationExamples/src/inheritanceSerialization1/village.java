package inheritanceSerialization1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// only child can be implements Serializable then we will get default values in parent class
// reduce this problem we go with write read and Write operation
public class village extends Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String location;
	transient String state;

	public village(int id, String name, double fee, String Emailid, long phone_No, String location, String state) {
		super(id, name, fee, Emailid, phone_No);
		this.location = location;
		this.state = state;
	}

	@Override
	public String toString() {
		return "village [location=" + location + ", state=" + state + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getFee()=" + getFee() + ", getEmailid()=" + getEmailid() + ", getPhone_No()="
				+ getPhone_No()  + "]";
	}

	private void writeObject(ObjectOutputStream obj) throws IOException {
		obj.defaultWriteObject();
		obj.writeInt(getId());
		obj.writeObject(getEmailid());
		obj.writeObject(getFee());
		obj.writeObject(getName());
		obj.writeLong(getPhone_No());
	}

	private void readObject(ObjectInputStream obj) throws IOException, ClassNotFoundException {
		obj.defaultReadObject();
		setId(obj.readInt());
		setName((String) obj.readObject());
//	      setEmailid((String)obj.readObject());//class cast Exception
		setEmailid(Emailid);obj.read();
		setFee((double) obj.readObject());
		//setPhone_No(obj.readLong());// EOF exception
	}

	
	
	}


