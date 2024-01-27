package iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFileDemo {

	public static void main(String[] args) {

		FileReader reader = null;
		FileWriter writer = null;

		try {
//			FileInputStream reader=new FileInputStream("resources/Input.txt");
//			
//			int n=reader.read();
//			System.out.println(n);
//			System.out.println((char)n);

			reader = new FileReader("resources/Input.txt");

//			int n=reader.read();
//			System.out.println(n);
//			System.out.println((char)n);
			
			writer = new FileWriter("resources/Output.txt");

			int b = 0;
			while ((b = reader.read()) != -1) {

				System.out.print((char) b);
				writer.write(b);
			}

			writer.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
