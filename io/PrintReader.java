import java.io.*;
public class PrintReader{
	public static void main(String[] args) throws Exception{
		
		/* File path=new File("F:/test");
		File dir=new File(path,"test.txt");
		 */
		/* 	if(!dir.exists())
			dir.createNewFile();  */
		
			FileInputStream fis = new FileInputStream("F:/test/test.txt");
			InputStreamReader  isr = new InputStreamReader(fis);
			BufferedReader bf = new BufferedReader(isr);
			String s="007,zs,";
			int sum=0,count=0;
			while((s=bf.readLine())!=null){
				s = s.trim();//字符串修整 两端的空格删除
				String[] sa=s.split(",");//字符串修整 两端的空格删除
				if(s.length() == 0) continue;
				sum+=Integer.parseInt(sa[3]);
				count ++;
			    if (Integer.parseInt(sa[3]) < 60){
				
				System.out.println(sa[1]);
			    
				}
			}	
			 fis.close(); isr.close();bf.close();
			 System.out.println("avg grade = "+sum/count+"\n"+"count="+count);
		 
	
		
	}
}


/* class  Student{
	int id , grade ;
	String  name;
	boolean gender;
	Student(int id, String  name , boolean gender , int  grade ){
		
		this.id = id ;
		this.name = name;
		this.gender = gender ;
		this.grade = grade;
		
	}
	
} */