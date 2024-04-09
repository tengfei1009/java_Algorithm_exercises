package 暴力枚举;

import java.util.Scanner;

public class 选数3 {
    static int n;
    static int k;
    static int[]s;
    static int ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        k= sc.nextInt();
        s= new int [n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        dfs(0,0,0);
        System.out.println(ans);
    }
    private static boolean is(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    private static void dfs(int u,int sum,int start){
        if(u==k){
            if (is(sum)) {
                ans++;
            }
            return;
        }
        if(n-start+1<k){
            return;
        }
        for (int i = start; i < n; i++) {
            dfs(u+1,sum+s[i],i+1);
        }
    }
}
