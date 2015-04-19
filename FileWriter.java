import java.io.*;

public class FileWriter{
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("d:/java/ioTestFileWriter1.java");
		FileWriter fw = new FileWriter("d:/java/io/TestFileWriter2.bak");
		int b;
		while((b = fr.read()) != -1) {
			fw.write(b);
		}
		fr.close();
		fw.close();
	}
}