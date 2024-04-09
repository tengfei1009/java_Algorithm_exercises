package 组内练习;

import java.util.Arrays;
import java.util.Scanner;

public class 最大公约数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //最大公约数
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0]; j >= 1; j--) {
                if(arr[0]%j ==0&&arr[1]%j ==0&&arr[2]%j==0){
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
