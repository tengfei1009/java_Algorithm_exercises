package 前缀和;

import java.util.Scanner;

public class 一维差分 {
    public static void main(String[] args) {
//        差分可以看成前缀和的逆运算
//        a数组是b数组的前缀和数组
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //原数组a是b数组的前缀和数组
        int[] a = new int[n + 1];
        //b数组叫做a数组的差分数组(a数组是b数组中从头开始的一段区间和)
        int[] b = new int[n + 2];
        for (int i = 1; i < b.length-1; i++) {
            a[i] = sc.nextInt();
            b[i]= a[i]-a[i-1];
        }
        //输入m个操作
        for (int i = 0; i < m; i++) {
            //每个操作有三个数,代表,从l到r区间内,每个数都加上c
            int l= sc.nextInt();
            int r =sc.nextInt();
            int c =sc.nextInt();
            b[l]+=c;
            b[r+1]-=c;
        }
        //操作完成后的所有序列
        for (int i = 1; i <= n; i++) {
            b[i]+=b[i-1];
            System.out.print(b[i]+" ");
        }
    }
}
