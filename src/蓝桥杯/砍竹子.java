package 蓝桥杯;

import java.util.Scanner;

public class 砍竹子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入竹子的棵数
        long[] h = new long[n+1]; // 存储竹子的高度
        long []b =new long[n+1];
        int t =0; //砍的次数
        long  ans =0;
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextLong(); // 输入每棵竹子的高度
        }
        while(h[1]>1){
            b[++t] = h[1];ans++;
            h[1] =(long)Math.sqrt(h[1]/2+1);
        }
        for (int i = 2; i <= n; i++) {
            long v =h[i];
            while(v>1){
                int flag =0;
                for (int j = 1; j <= t; j++) {
                    if(b[j] == v){//如果说,当前值为前面值的因数,说明不需要再砍了
                        flag =1;
                        break;
                    }
                }
                if(flag==1) break;
                ans++;
                v =(long)Math.sqrt(v/2+1); //4被砍了一次
            }
            t=0;
            while(h[i]>1){
                b[++t]=h[i]; //存储当前数的因数 4的因数
                h[i] = (long)Math.sqrt(h[i]/2+1);
            }
        }
        System.out.println(ans);
    }
}
