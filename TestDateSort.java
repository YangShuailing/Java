public class TestString{
	public static void main(String[] args){
		String s = "asdhiohfshfksndkfnJkiKNNIONNMKki123123824032";
		int lCount, uCount, oCount;
		for(int i=0; i<s.length();i++){
			char c = s.CharAt(i);
			if (c>='a' && c<='z'){
				iCount++;
			}else if(c>='A' && c<='Z'){
				uCount++;
			}else if (c>=0 && c<=9){
				oCount++;
			}
			
		}
		System.out.println("小写字母"+iCount+" "+"大写字母"+uCount+" "+"数字"+oCount);
	}
	
}