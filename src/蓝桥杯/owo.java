package 蓝桥杯;

import java.util.Scanner;

public class owo {
    static int count;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        String mid ="";
        for (int i = 0; i < n; i++) {
            mid += sc.next();
//            mid.split("owo");
            check(mid);
            System.out.println(count);
            count =0;
        }
    }
    private static void check (String str){
        String res = "owo";
        for (int i = 0; i < str.length()-2;i++) {
            if(res.equals(str.substring(i,i+3))){
               count++;
            }
        }
    }
}
