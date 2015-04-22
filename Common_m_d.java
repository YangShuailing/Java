import 	java.util.* ;

public class Common_m_d{
	public static void main(String[] args){
		int a,b,m; 
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		 a = s.nextInt();
		System.out.println("请再输入一个正整数");
		b = s.nextInt();
		deff cd = new deff();
		m = cd.deff(a,b);
		int n = a*b/m;
		System.out.println("最大公约数"+m);
		System.out.println("最小公倍数"+n);
	}	
}
	class deff{
		public int deff(int x, int y){
			int t;
			if(x<y){
				t=x;
				x=y;
				y=t;
			}
			while(y!=0){
				if (x==y){
					return x;
				}
				else{
					int k =x%y;
					x=y;
					y=k;
				}
			}
			return x;
		}
	}
	