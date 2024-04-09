package 进制转换;

import java.util.Scanner;

public class 进制转换 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();//需要转化的进制
        String  num = sc.next();
        String jin = "";
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i)>='A'){
                jin += Integer.parseInt(num.charAt(i)-'A'+10+"");
            }else {
                jin = Integer.parseInt(num.charAt(i)+"")+"";
            }
        }
        int a = Integer.parseInt(jin);
//        System.out.println(a);
        int m = sc.nextInt(); //被转化的进制
        String ss = Integer.toBinaryString(a);//转二进制
        System.out.println(ss);
    }
}
