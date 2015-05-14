package edu.smc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestEntrySet{
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "zs");
		map.put("2", "ls");
		map.put("3", "ww");
		 
		System.out.println("Method1:");
		Iterator <Entry<String, String>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){      
           Map.Entry<String, String> entry= (Entry<String, String>) iterator.next();
		   System.out.println("key:"+entry.getKey()+" value"+entry.getValue());  
		 
		  }       
        System.out.println("Method2:");
        for (Map.Entry<String, String> m : map.entrySet()) {
        	  System.out.println("key:"+m.getKey()+" value"+m.getValue());
          } 
      }
}
 
