import 	java.util.* ;
public class Factorization{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int n = s.nextInt();
		int k = 2;
		System.out.println(n+"=");
		while(k<=n){
			if(k==n){
				System.out.println(""+n+"");
				break;
			}
			else if(n%k==0){
				System.out.println(k+"*"+""); 
				n=n/k;
			}
			else   {k++;}
		}
		
	}
}