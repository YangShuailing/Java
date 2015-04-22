import java.util.*;

public class lianxi24{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		long a = s.nextLong();
		String ss = Long.toString(a);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		System.out.println(a+"是一个"+j+"位数");
		for(int i=j-1;i>=0;i--){
			System.out.println(ch[i]);
		}
	}
}

