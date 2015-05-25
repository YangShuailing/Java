public class Quick_Sort{
	public static void main(String[] args){
		int [] a = {1, 2, 4, 0, -4, 6, 1, 2, 4, 7, 8, 9, 0, 2, -1};
		int i;
		quick_Sort(a, 0, a.length-1);
		for(i=0; i<10; i++) 
			System.out.printf("%d ", a[i]);
		 
	}

public static void quick_Sort(int source[], int low, int high){
	int i, j, x;
	if( low < high ){
		i = low;
		j = high;
		x = source[i];
		while ( i < j ){
			while (i<j && source[j] > x){
				j--;
			}
			if ( i < j ) {
				source[i] = source[j];
				i++;
			}
			while ( i < j && source[i] < x){
				i++;
			}
			if( i < j ){
				source[j] = source[i];
				j--;
			}
		}
		source[i] = x;
		quick_Sort(source, low, i-1);
		quick_Sort(source, i+1, high);
	}
	
 }

}
