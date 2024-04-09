package 蓝桥杯;

import java.util.Scanner;

public class 饮料换购 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while (n>=3){//还有瓶盖
            int shen =n%3;//剩的瓶盖
            count+=n-shen;
            n=n/3+shen;
        }
        count+=n;
        System.out.println(count);
    }
}
