public class FibonacciSequence{
	public static void main(String[] Args){
		System.out.println("��1����������1");
		System.out.println("��2����������1");
		int f1 = 1, f2 = 1,f, M = 24;
		for(int i=3; i<=24;i++){
			f = f2;
			f2 = f1+f2;
			f1 = f;
			System.out.println("��"+i+"����������"+f2);
		}
	}
}