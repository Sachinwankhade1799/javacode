package javacodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class CompileTimeException {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, MalformedURLException {

		File file = new File("g:/test.txt");

		FileInputStream fileInputStream = new FileInputStream(file);

		// fileInputStream.close();

		Class.forName("");

		URL url = new URL("www.google.com");

	}

}
