package Arrayofelements;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class student implements Externalizable {
	private int id;
	private String name;
	private String password;

	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(id);
		out.writeObject(name);
		out.writeObject(password);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		setId(in.readInt());
		setName((String) in.readObject());
		setPassword((String) in.readObject());

	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
