package 前缀和;

import java.util.Scanner;

public class 前缀和 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //输入长度
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = 0;
        int r =0;
        int []a = new int[n+1]; //记录单个的
        int sum[] =new int[n+1]; //记录前n项和
        for (int i = 1; i <= n; i++) {
            a[i]= sc.nextInt();
        }
        //获取前n项和
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1]+a[i];
        }
        for (int i = 0; i < m; i++) {
            l= sc.nextInt();
            r= sc.nextInt();
            System.out.printf("%d\n",sum[r] - sum[l-1]);
        }
    }
}
