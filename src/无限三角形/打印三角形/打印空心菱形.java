package 无限三角形.打印三角形;

import java.util.Scanner;

public class 打印空心菱形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int star = 2*i-1;
            for (int j = 0; j < 2 * n - 1; j++) {
                //打印空格
                if(j<(2*n-1-star)/2){
                    System.out.print(" ");
                }
            }
            for (int k = 0; k < star; k++) {
                if(k == 0 || k ==star-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            int star = 2*i-1;
            for (int j = 0; j < 2 * n - 1; j++) {
                //打印空格
                if(j<(2*n-1-star)/2){
                    System.out.print(" ");
                }
            }
            for (int k = 0; k < star; k++) {
                if(k ==0 || k==star-1){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
