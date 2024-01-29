package brocode;

import java.io.File;

/**
 * File
 */
public class FileClass {

	public static void main(String[] args) {
		File file = new File("/mnt/data/var/hellotext");


		if (file.exists()) {
			System.out.println("The file exists");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		} else {
			System.out.println("The file does not exists!");
		}
	}
}
