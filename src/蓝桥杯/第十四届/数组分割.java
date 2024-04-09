package 蓝桥杯.第十四届;

import java.util.Scanner;

public class 数组分割 {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();//数组长度

            int[] arr = new int[n];
            int sum=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); //输入n个整数
                sum+=arr[i];
            }
            if(sum%2!=0){
                System.out.println(0);
                continue;
            }
            dfs(arr,0,0,sum);
            System.out.println(count);
            count =0;
        }
        sc.close();
    }

    private static void dfs(int[] arr,int step,int mid,int sum) {
        if(mid%2==0){
            count++;
        }
        //对索引下标进行排列组合
        for (int i = step; i <arr.length; i++) {
            mid+=arr[i];
            dfs(arr,i+1,mid,sum);
            mid-=arr[i];
        }
    }
}
