package 无限三角形;

import java.util.Scanner;

public class sada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        //正空心等腰三角形
        for(int i =1;i<=n;i++){
            int k =2*n-1;
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1 ; j++) {
                if(j==1 || j==2*i-1||i==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
        }
    }
