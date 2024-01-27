package iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Timepass {
	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("resources/database.properties");
			FileWriter writer=new FileWriter("resources/timepass.txt");
			int b = 0;
			while ((b = reader.read()) != -1) {

				System.out.print((char) b);
				writer.write(b);
				
			}
			writer.flush();

			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
