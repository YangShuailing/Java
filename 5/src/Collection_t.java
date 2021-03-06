import java.util.*;

public class Collection_t {
	static public <T> int getSize(T t) {
		if (t instanceof int[]) {
			return ((int[]) t).length;
		} else if (t instanceof String) {
			return ((String) t).length();
		} else if (t instanceof Collection) {
			return ((Collection) t).size();
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "hello";
		List list = new LinkedList();
		list.add(5);
		list.add(6);
		int[] a = new int[5];
		System.out.println(Collection_t.getSize(s));
		System.out.println(Collection_t.getSize(list));
		System.out.println(Collection_t.getSize(a));
	}
}
