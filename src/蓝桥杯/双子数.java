package 蓝桥杯;

import java.util.Scanner;

public class 双子数 {
    //简单dp
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n =sc.next();
        //dp数组的含义就是当前 2 20 202 2023 的个数
        long []dp  =new long[4];
        String s ="";
        for (int i = 1; i <= 2023; i++) {
            s+=i;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='2'){
                dp[0]++;
                dp[2]+=dp[1];
            }else if(s.charAt(i)=='0'){
                dp[1]+=dp[0];
            }else if(s.charAt(i)=='3'){
                dp[3]+=dp[2];
            }
        }
        if(n=="A"){
            System.out.println(dp[3]);
        }
    }
}
