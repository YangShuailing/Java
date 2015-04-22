import java.util.* ;

public class Factorial{
	public static void main (String[] args){
		int n = 0;
		System.out.println("请输入一个正整数");
		input in = new input();
		n = in.input();
		rec fr = new rec();
		System.out.println(n+"!="+fr.rec(n));
		
	}
}
class input{
	public int input(){
		int value = 0;
		Scanner s = new Scanner(System.in) ;
		value = s.nextInt();
		return value;
	}
}

class rec{
	public long rec(int n){
		long value =0;
		if (n==1){
			value = 1;
		}
		else{
			value = n*rec(n-1);
		}
		return  value;
	}
}