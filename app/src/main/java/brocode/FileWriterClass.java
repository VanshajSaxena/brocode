package brocode;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriterClass
 */
public class FileWriterClass {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("/mnt/data/var/filewriter.txt");
			writer.write("FileWriter is a class that writes to files, and it is a subclass of OutputStreamWriter.");
			writer.append("\n");
			writer.append("\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
