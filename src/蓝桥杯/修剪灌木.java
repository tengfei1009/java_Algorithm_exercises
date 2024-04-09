package 蓝桥杯;

import java.util.Arrays;
import java.util.Scanner;

public class 修剪灌木 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int []arr =new int[n];
        int day =1;
        while (true){
            day++;
            for (int i = 0; i < arr.length; i++) {
             arr[i]++;
            }
            if(day!=0&&day<=n){
                arr[day]-=1;
            }
        }
    }
}
