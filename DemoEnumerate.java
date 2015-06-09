import java.util.*;
public class DemoEnumerate{ 
     public static void main(final String[] args){
          //实例化MyDataStruct类型的对象
           MyDataStruct myDataStruct=new MyDataStruct();
          //得到描述myDataStruct类型对象的enumeration对象
           Enumeration myEnumeration = myDataStruct.getEnum();
         //使用对象循环显示myDataStruct类型的对象中的每一个元素
               System.out.println(myEnumeration.nextElement()+"123");
         while (myEnumeration.hasMoreElements())
    } 
}
//MyEnumeration类实现Enumeration接口
class MyEnumeration implements Enumeration
{ 
      int count; // 计数器
      int length; //存储的数组的长度
      Object[] dataArray; // 存储数据数组的引用
      public MyEnumeration(int i, int length2, String[] data) {
		// TODO Auto-generated constructor stub
	}
	//构造器
      MyEnumeration(final int count,final int length,final Object[] dataArray){ 
            this.count = count;
            this.length= length;
            this.dataArray = dataArray;
      } 
      public boolean hasMoreElements() { 
            return (count< length);
      }
      public Object nextElement() {
            return dataArray[count++];
      }
} 
//MyDataStruct类用于实例化一个简单的、可以提供enumeration对象
//给使用程序的数据结果对象
class MyDataStruct
{ 
     String[] data;
     // 构造器
     MyDataStruct(){
          data = new String[4] ;
          data[0] = "zero";
          data[1]= "one";
          data[2] = "two";
          data[3]= "three";
     }
     // 返回一个enumeration对象给使用程序
    Enumeration getEnum() {
          return new MyEnumeration(0,data.length,data);
    }
}