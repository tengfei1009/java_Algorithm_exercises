package 动态规划;

import java.util.Scanner;

public class 走方格 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]f= new int[n+1][m+1];
        f[1][1]=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i%2==0&&j%2==0){
                    f[i][j]=0;
                    continue;
                }
                if(i>1){
                    f[i][j]+=f[i-1][j];
                }
                if(j>1){
                    f[i][j]+=f[i][j-1];
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
