package class_10_28;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//�ѹ濡 ����Ʈ �ϰ� ������ ��Ʈ�� + ����Ʈ + o

public class ThrowsTest {

	public static void main(String[] args) {
		   try {
		      md1();
		   }
		   catch(IOException e) {
		      e.printStackTrace();
		   }
		}

	public static void md1() throws IOException {    // IOException ���� �ѱ�ٰ� ���!
	    md2();
	}
	public static void md2() throws IOException {    // IOException ���� �ѱ�ٰ� ���!
	   Path file = Paths.get("C:\\javastudy\\Simple.txt");
	   BufferedWriter writer = null;
	   writer = Files.newBufferedWriter(file);   // IOException �߻� ����
	   writer.write('A');   // IOException �߻� ����
	   writer.write('Z');   // IOException �߻� ����
	   
	   if(writer != null)
	      writer.close();   // IOException �߻� ����
	}
}
