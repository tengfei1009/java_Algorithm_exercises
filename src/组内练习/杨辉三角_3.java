package 组内练习;

import java.util.Scanner;

public class 杨辉三角_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数");

        int level = sc.nextInt();
        int[][]arr =new int[level][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =new int[i+1];
            for (int j = 0; j < arr[i].length; j++) {
                if(j==0||j== arr[i].length-1){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < level - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
