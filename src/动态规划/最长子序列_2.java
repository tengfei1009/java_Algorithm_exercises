package 动态规划;

import java.util.Scanner;

public class 最长子序列_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String T =sc.next();
        String S = sc.next();
        int start =0;
        int count=0;
        for (int i = 0; i < T.length(); i++) {
           if(start<S.length()&& S.charAt(start) ==T.charAt(i)){
               count++;
               start++;
           }
        }
        System.out.println(count);
    }
}
