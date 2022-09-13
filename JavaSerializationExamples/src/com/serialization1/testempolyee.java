package com.serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testempolyee {
	public static void main(String[] args) {

		Employee e1 = new Employee(01, "mahesh", 2500, "DEVELOPER", "SOFTWARE");
		Employee e2 = new Employee(02, "ganesh", 2500, "DEVELOPER", "SOFTWARE");
		Employee e3 = new Employee(03, "suresh", 2500, "DEVELOPER", "SOFTWARE");
		Employee e4 = new Employee(03, "subbu", 2500, "DEVELOPER", "SOFTWARE");
		Employee e[] = { e1, e2, e3, e4 };
		try {
			/*
			 * Serialization is the process used to convert an object state into stream of
			 * bytes so that it can be written into a file, transported through a network or
			 * stored into database. De-serialization is just a vice versa.
			 */
			// serialization
			FileOutputStream f = new FileOutputStream("empolyee.ser");
			ObjectOutputStream obj = new ObjectOutputStream(f);
			for (Employee employee : e) {
				obj.writeObject(employee);
			}

			// de Serialization
			// Constructor won't be invoked in the deserialization
			FileInputStream f1 = new FileInputStream("empolyee.ser");
			ObjectInputStream objread = new ObjectInputStream(f1);
			Employee read = (Employee) objread.readObject();
			System.out.println(read);
		} catch (FileNotFoundException es) {
			// TODO Auto-generated catch block
			es.printStackTrace();
		} catch (IOException es) {
			// TODO Auto-generated catch block
			es.printStackTrace();
		} catch (ClassNotFoundException es) {
			// TODO Auto-generated catch block
			es.printStackTrace();
		}
	}
}
