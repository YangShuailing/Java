public class FibonacciSequence{
	public static void main(String[] Args){
		System.out.println("第1个兔子数：1");
		System.out.println("第2个兔子数：1");
		int f1 = 1, f2 = 1,f, M = 24;
		for(int i=3; i<=24;i++){
			f = f2;
			f2 = f1+f2;
			f1 = f;
			System.out.println("第"+i+"个月兔子数"+f2);
		}
	}
}