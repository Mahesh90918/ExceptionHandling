package inheritanceSerialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testVillage {
	public static void serialization() {
		village v1 = new village(01, "mahesh", 2500, " m@gmail.com", 312523, "palakonda", "Ap");
		village v2 = new village(01, "mahesh", 2500, " m@gmail.com", 312523, "palakonda", "Ap");
		village v3 = new village(01, "mahesh", 2500, " m@gmail.com", 312523, "palakonda", "Ap");
		village v4 = new village(01, "mahesh", 2500, " m@gmail.com", 312523, "palakonda", "Ap");
		village[] v = { v1, v2, v3, v4 };
		try {
			ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("vill.ser"));
			for (village village : v) {

				ob.writeObject(v);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deserialization() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vill.ser"));) {
			village[] v  = (village[]) ois.readObject();
			for (village ville : v) {
			//ville=(village) ois.readObject();
				System.out.println(ville);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//serialization();

		deserialization();
	}
}
