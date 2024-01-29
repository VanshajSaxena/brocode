package brocode;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReaderClass
 */
public class FileReaderClass {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("/mnt/data/var/filewriter.txt")) {
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
