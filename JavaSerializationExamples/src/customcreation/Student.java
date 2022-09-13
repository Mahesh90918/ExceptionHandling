package customcreation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
//This will not get serialized by default, it should be transient
	private transient address addresss;

	public Student(int id, String name, address addresss) {
		super();
		this.id = id;
		this.name = name;
		this.addresss = addresss;
	}

	// Custom serialization logic:
	// We can do additional serialization logic on top of the default one e.g.
	// serialize some extra variables which are not by default serialized
	private void writeobj(ObjectOutputStream obj) throws IOException {
		System.out.println("-------------Custom serialization logic-------------");
		obj.defaultWriteObject(); // Calling the default serialization logic
		// As address is transient it will not be serialized by default
		// If we really need to serialize address data we could do as follows
		obj.writeObject(this.id);
		obj.writeObject(this.name);
		obj.writeObject(this.addresss.getLocation());
		obj.writeObject(this.addresss.getState());
		obj.writeObject(this.addresss.getPincode());

	} /*
		 * These methods always should be private, because these are not meant for any
		 * one to call explicitly. Even these methods are private, Still they can be
		 * called by JVM in the serialization and de-serialization process.
		 */

	private void readobj(ObjectInputStream obj) throws ClassNotFoundException, IOException {
		System.out.println("-------------Custom deserialization logic-------------");

		obj.defaultReadObject(); // Calling the default deserialization logic
		// Here we are deserialize each variable in the order they serialized

		String location = (String) obj.readObject();
		String state = (String) obj.readObject();
		Long pincode = (Long) obj.readObject();
		// Here we are creating Address object and setting state manually
		this.addresss = new address(location, state, pincode);

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addresss=" + addresss + "]";
	}

}
