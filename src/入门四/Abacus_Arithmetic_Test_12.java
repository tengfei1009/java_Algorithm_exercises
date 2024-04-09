package 入门四;

import java.util.Scanner;

public class Abacus_Arithmetic_Test_12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int []arr=new int[a];
        int[]arr1=new int [a];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            arr1[i]=0;
        }
        //对数组中的每一个数和其他数进行遍历
        int n=0;

        for (int i = 0; i < arr.length; i++) {
            //判断只要有满足i的一个就直接结束里面两个循环不需要再往后看了
            label: for (int j = 0; j < arr.length; j++) {
                if(j!=i){
                    for (int k = 0; k < arr.length; k++) {
                        if(k!=j&&k!=i){
                            if(arr[i]==arr[j]+arr[k]&&arr1[i]==0){
                                n++;
                                arr1[i]=1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(n);
    }

}
