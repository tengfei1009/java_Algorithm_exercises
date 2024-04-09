package 暴力枚举;

import java.util.Scanner;

public class 组合输出2 {
    static Scanner sc =new Scanner(System.in);
    static int n = sc.nextInt();
    static int r = sc.nextInt();
    static int []arr =new int[r];
    public static void main(String[] args) {
        dfs(0,1);
    }
    private static void dfs(int stp,int flag){
        if(stp == r){
            //遍历数组
            bian(arr);
            return;
        }
        for (int i =flag ; i <= n; i++) {
            arr[stp] = i;
            dfs(stp+1,i+1);
        }
    }
    private static  void bian (int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d",arr[i]);
        }
        System.out.println();
    }
}
