package 蓝桥杯;

import java.util.Scanner;

public class owo2 {
    //简单dp
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        //dp数组的含义就是当前 o ow owo的个数
        long []dp =new long[3];
        String s = "";
        int sum = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            str+=sc.next();
        }
        System.out.println(str);
        res(str,dp);
        System.out.println(dp[2]);

    }
    private static void res (String str,long []dp){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='o'){
                dp[0]++;
                dp[2]+=dp[1];
            }else if(str.charAt(i)=='w'){
                dp[1]+=dp[0];
            }
        }
    }
}
