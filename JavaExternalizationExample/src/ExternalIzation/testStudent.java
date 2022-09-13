package ExternalIzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testStudent {
	public static void Serilizaion(Object obj) {
		try (FileOutputStream fos = new FileOutputStream("seri.ser");
				ObjectOutputStream obbj = new ObjectOutputStream(fos);) {
			obbj.writeObject(obj);
			System.out.println("serialization");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Student Deserilization() throws IOException, ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("seri.ser");
		ObjectInputStream fos = new ObjectInputStream(fis);){
		System.out.println("deserialization");
		return (Student) fos.readObject();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Student s = new Student(01, "mahesh", 2500);
		System.out.println(s.toString());
		Serilizaion(s);
		Student ss = Deserilization();
		System.out.println(ss);

	}
}
