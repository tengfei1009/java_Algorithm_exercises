package 蓝桥杯;

import java.util.Scanner;

public class 饮料换购_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        while(n>0){
            if(n>=3){
                res+=3;
                n-=2;
            }else {
                res+=n;
                n=0;
            }
        }
        System.out.println(res);
    }
}
