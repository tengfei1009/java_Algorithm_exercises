package 进制转换;


import java.util.Scanner;

public class 进制转换2 {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());//需要转换的进制
        String num = sc.nextLine();//输入一个n进制的数
        int a= Integer.parseInt(num,n);//将n进制的数转换为十进制
        int m = Integer.parseInt(sc.nextLine());//转化后的进制
        //将十进制的数转化为m进制的数
        System.out.println(Integer.toString(a,m).toUpperCase());
    }
}
