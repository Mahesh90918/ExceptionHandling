package Arrayofelements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class teststudent {
	public static void Serialization(String pathName, Object obj) throws IOException {
		try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(pathName));) {
			ob.writeObject(obj);
			ob.close();
		}
	}

	public static student[] deSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));) {
			return (student[]) in.readObject();
		}

	}

	public static void main(String[] args) {
		student s1 = new student(01, "mahesh", "123456");
		student s2 = new student(01, "mahesh", "123456");
		student s3 = new student(01, "mahesh", "123456");
		student s4 = new student(01, "mahesh", "123456");
		student s5 = new student(01, "mahesh", "123456");
		student[] Ss= {s1,s2,s3,s4,s5};
		try {
			for (student student : Ss) {
			Serialization("student.ser", Ss);
			}
			System.out.println("sucess");
			for (student student : Ss) {
				
			student []ss = deSerialization();
			System.out.println(student);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
