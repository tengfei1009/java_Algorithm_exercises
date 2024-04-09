package 入门六;

import java.util.Scanner;

public class 猴子吃桃 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = (sum+1)*2;
        }
        System.out.println(sum);
    }
}
