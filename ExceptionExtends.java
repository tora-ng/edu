package class_10_28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionExtends {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\java\\Simple.txt");
		BufferedWriter writer = null;

		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A'); // IOException 발생 가능
			writer.write('Z'); // IOException 발생 가능

			if (writer != null)
				writer.close(); // IOException 발생 가능

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
