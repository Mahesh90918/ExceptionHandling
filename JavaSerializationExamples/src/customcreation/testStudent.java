package customcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testStudent {

	// Serialization code
	private static void serialize(Student obj) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("Student.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(obj);
		}
	}

	// Deserialization code
	private static Student deserialize() throws IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream("Student.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (Student) ois.readObject();
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		address addresss1 = new address("palokonda", "AP", 532445);
		Student s1 = new Student(01, "mahesh", addresss1);
		
		// serialization
		
			System.out.println("Before s erialization  => " + s1.toString());
		      
		      serialize(s1);
		

		// deserialization
		Student ss = deserialize();
		System.out.println("After deserialization => " + ss.toString());
	}
}
