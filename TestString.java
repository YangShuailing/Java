public class TestString{
	public static void main(String[] args){
		String s = "asdhiohfshfksndkfnJkiKNNIONNMKki123123824032";
		int iCount=0, uCount=0, oCount=0;
		for(int i=0; i<s.length();i++){
			char c = s.charAt(i);
			if (c>='a' && c<='z'){
				iCount++;
			}else if(c>='A' && c<='Z'){
				uCount++;
			}else if (c>=0 && c<=9){
				oCount++;
			}
			
		}
		System.out.println(iCount+" "+ uCount+" "+oCount);
	
	
		
	}
	
	
}