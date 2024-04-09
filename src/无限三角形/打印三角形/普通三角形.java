package 无限三角形.打印三角形;

import java.util.Scanner;

public class 普通三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //一共n行
            int star = 2*i-1;//每行的*数
            for (int j = 0; j < 2*n-1; j++) {
                //一行的总长度是固定的就是 2* n -1
                //假如j从0 开始增长,当j大于等于每行的 * 数,就说明*打印完毕,就打印空格
                if(j>=star){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
