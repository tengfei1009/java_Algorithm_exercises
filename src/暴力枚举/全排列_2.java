package 暴力枚举;

import java.util.Scanner;

public class 全排列_2 {
    static Scanner sc =new Scanner(System.in);
    static int n  = sc.nextInt();
    //定义一个数组存储结果
    static int[]res = new int[n];
    //代表位置
    static boolean [] pos = new boolean[n+1];
    public static void main(String[] args) {
        dfs(0);
    }
    private static void dfs(int step){
        if(step == n){
            for (int i = 0; i < res.length; i++) {
                System.out.printf("%5d",res[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(! pos[i]){
                res[step]=i;
                pos[i] = true;
                dfs(step+1);
                pos[i] =false;
            }
        }
    }
}