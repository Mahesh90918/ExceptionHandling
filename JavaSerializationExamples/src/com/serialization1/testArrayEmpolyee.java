package com.serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class testArrayEmpolyee {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(new Employee(01, "siva", 2500, "DEVELOPER", "SOFTWARE"));
		a.add(new Employee(02, "shankar", 2500, "DEVELOPER", "SOFTWARE"));
		a.add(new Employee(03, "shan", 2500, "DEVELOPER", "SOFTWARE"));
		a.add(new Employee(04, "mahesh", 2500, "DEVELOPER", "SOFTWARE"));
		a.add(new Employee(05, "sriman", 2500, "DEVELOPER", "SOFTWARE"));
		// System.out.println(a);
		try (FileOutputStream file = new FileOutputStream("src/com/serialization1/EmpArr.ser");
				ObjectOutputStream obj = new ObjectOutputStream(file);) {
			obj.writeObject(a);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream("src/com/serialization1/EmpArr.ser"))) {
			ArrayList i = (ArrayList) ob.readObject();
			System.out.println(i);
			Iterator itr= i.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				//System.out.println(itr.hasNext());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
