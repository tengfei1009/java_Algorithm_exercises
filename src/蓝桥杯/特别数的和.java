package 蓝桥杯;

import java.util.Scanner;

public class 特别数的和 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= n; i++) {
            if(check(i)){
             sum+=i;
            }
        }
        System.out.println(sum);
    }
    private static boolean check(int num){
        while(num!=0){
            if(num%10 ==2 ||num%10== 0 ||num%10== 1 ||num%10== 9||num/10 ==2||num/10 ==1||num/10 ==9){
                return true;
            }
            num =num/10;
        }
        return false;
    }
}
