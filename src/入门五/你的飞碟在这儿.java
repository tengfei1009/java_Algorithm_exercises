package 入门五;

import java.util.Scanner;

public class 你的飞碟在这儿 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String comet = sc.next();  //彗星
//        String group = sc.next();  //小组
        int a = compute(sc.next());
        int b = compute(sc.next());
//        System.out.println((int)'A');  //65
        if(a%47 == b%47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
    }
    public static int  compute(String s) {
        int sum =(int)s.charAt(0)-64;//计算
        for (int i = 1; i < s.length(); i++) {
            int c =(int)s.charAt(i)-64;
            sum*=c;
        }
        return sum;
    }
}
