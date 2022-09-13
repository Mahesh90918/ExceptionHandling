package com.Externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class teststudent {
public static void main(String[] args) {
	student s= new student(01, "mahesh","123456");
	try {
		ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("stu.ser"));
		ob.writeObject(s);
		ob.close();
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("stu.ser"));
		student ss=(student) in.readObject();
		System.out.println(ss);
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
