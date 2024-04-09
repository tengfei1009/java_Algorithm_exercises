package 蓝桥杯;

import java.util.Arrays;
import java.util.Scanner;

public class 双向排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); //操作次数
        Integer []arr =new Integer[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] =i;
        }
        for (int i = 0; i < m; i++) {
            int check = sc.nextInt();
            int end = sc.nextInt();
            if(check ==0){
                //降序排序
                Arrays.sort(arr,1,end+1,(o1,o2)->o2-o1);
            }else {
                Arrays.sort(arr,end,arr.length);
            }
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
