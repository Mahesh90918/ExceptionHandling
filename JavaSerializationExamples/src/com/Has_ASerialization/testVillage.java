package com.Has_ASerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testVillage {
	public static void main(String[] args) {
		Address adress1=new Address("2-133", "manku Street");
		village v1 = new village(01, "mahesh", 2500, " m@gmail.com", 312523, "palakonda", "Ap",adress1);
		
		//System.out.println(v.toString());
	
		try {
			// file Storing purpose
			// Serialization is Writing purpose
			FileOutputStream f = new FileOutputStream("village.ser");
			ObjectOutputStream obj = new ObjectOutputStream(f);
			obj.writeObject(v1);
			obj.flush();
			obj.close();
			// De-Serialization is reading purpose
			FileInputStream f1 = new FileInputStream("village.ser");
			ObjectInputStream objread = new ObjectInputStream(f1);
			village vill=(village) objread.readObject();
			System.out.println(vill);

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
