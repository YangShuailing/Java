public class RanHun{
	public static void main(String [] args){
		int n = 100;
		int[] array = new int[n];
		Random  r = new Random(100);
		for(i=0; i<100; i++){
			array[i] = r.nextInt(100)+1;
			for(j=0;j<i;j++){
				if(array[i]==array[j]){
					i--;
					break;
				}
			}
		}
		for(i=0;i<100;i++){
			System.out.println(array[i]);
		}
	}
}