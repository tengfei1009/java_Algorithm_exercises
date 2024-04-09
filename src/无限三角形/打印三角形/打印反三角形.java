package 无限三角形.打印三角形;

import java.util.Scanner;

public class 打印反三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //一共n行
            int star = 2*i-1;//每行的*数
//            倒着遍历
            for(int j = 2*n-1;j>=1;j--){
                //当j小于等于star时,打印*
                if(j<=star) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
