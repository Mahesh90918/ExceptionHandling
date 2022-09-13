package inheritanceSerialization1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test2 {
	public static void main(String[] args) {
//	village[] v = new village[4];
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vill.ser"));) {
			village[] vill = (village[]) ois.readObject();
			for (village ville : vill) {

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
}
