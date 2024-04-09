package 前缀和;

import java.util.Scanner;

public class A_B_Problem_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //1~m之间有多少个质数
        int []a = new int[m+1];
        for (int i = 1; i <= m; i++) {
            a[i]+=a[i-1];
            //如果自己是质数,就++,顺便加上前面所有的质数
            if(is_prime(i)){
                a[i]++;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l>=1&&r<=m){
                System.out.println(a[r]-a[l-1]);
            }else {
                System.out.println("Crossing the line");
            }
        }
    }
    private static boolean is_prime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}
