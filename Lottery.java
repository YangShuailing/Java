import java.util.*;


class  Lottery{
	public static void main(String[] args){
		Set set = new TreeSet();
		while (set.size()<7){
			set.add((int)(Math.random()*35+1));
		}
		System.out.println(set);
	}
}