 

import java.io.*;

/**
 * Created by Administrator on 2015/5/15 0015.
 */

public class PrintResult{
    public static void main (String[] args){
        System.out.println("请输入整数");
        BufferedReader bu = new BufferedReader(
                new InputStreamReader(System.in));
        String  st="" ;
        try{
            st = bu.readLine();

        }catch (IOException e) {
            System.out.println("输入。。");
        }

        int a = Integer.parseInt(st);
        Result result = new Result();
        result.print(a);


    }
}

class Result{
    void print(int d){
        System.out.println("平方"+d*d );
        System.out.println("立方"+d*d*d);
    }
}