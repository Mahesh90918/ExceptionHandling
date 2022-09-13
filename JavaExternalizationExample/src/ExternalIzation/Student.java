package ExternalIzation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Student implements Externalizable {
	private static final long serialVersionUID = 2L;
	private int id;
	private String name;
	private double fee;
public Student() {
	// TODO Auto-generated constructor stub
}
	public Student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("------------writeExternal(ObjectOutput out)------------");
		out.writeInt(this.id);
		out.writeObject(this.name);
		out.writeObject(this.fee);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readInt();
		this.name = (String) in.readObject();
		this.fee = in.readDouble();
		// Even final variables are de-serialized we can't assign that value to final
		// variable
		// But in the case of Serializable interface, JVM can assign value to final
		// instance variable in the de-serialization process
		String dept = (String) in.readObject();
		System.out.println("In deserializtion - department : " + dept);
		// this.department = (String) in.readObject();
		// Compilation Error: The final field Employee.department cannot be assigned
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
}
