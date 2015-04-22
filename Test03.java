public class Test03{
	public static void main(String[] args){
		
		int b1,b2,b3;
		for(int i=101;i<1000;i++){
			b3 = i/100;
			b2 = i%100/10;
			b1 = i%10;
			if(b3*b3*b3+b2*b2*b2+b1*b1*b1==i){
				System.out.println(i+"是水仙花数");
			}
		} 
	}
}