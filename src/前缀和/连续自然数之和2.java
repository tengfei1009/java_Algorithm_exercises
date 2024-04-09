package 前缀和;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 连续自然数之和2 {
    //前缀和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List arr = new ArrayList();
        int []sum = new int[n+1];
        int slow = 1;//记录起始索引
        int fast = 1;//记录结束索引
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1]+i;//求出1~nd的前缀和
        }
        while (fast<n){
            if(sum[fast]-sum[slow]<n){
                fast++;
            }else if(sum[fast]-sum[slow]==n){
                //最后一个和前一个的差值为10000
                //这个+1是
                System.out.println(slow+1+" "+fast);
                slow++;
            }else {
                slow++;
            }
        }
    }
}
