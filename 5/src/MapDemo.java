import java.util.*;

class Student1{
	private String id, name; 
	private int age;
	private  boolean gender;
	public Student1(String id, String name, int age, boolean gender){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
			}
	public String toString(){
		return "id = " + id + "\t\t name: "+name;	
	}
}
public class MapDemo{
		public static void main(String[] args){
			Student1 s1 = new Student1("001", "张三", 19, true);
			Student1 s2 = new Student1("002", "李四", 19, true);
			Student1 s3 = new Student1("003", "王五", 20, true);
			Map map = new TreeMap();
			map.put("001", s1); // 注意键值对的添加顺序和遍历顺序
			map.put("003", s3);
			map.put("002", s2);	
			
			Set set = map.keySet();
			Iterator it = set.iterator();
			while (it.hasNext()) {
				String s = (String) it.next();
				Student1 student = (Student1) map.get(s);
				System.out.println(student);
			}
			
	}
}
	
