import java.io.*;
public class Iotest{
	public static void main(String[] args){
		try{
			FileOutputStream out =new FileOutputStream("Test.txt");
			out.write("字符串写入文件".getBytes());
			out.close();
		}catch(IOException ioe){
			System.out.println("无法读取文件");
		}
	}
}