package 前缀和;

import java.util.ArrayList;
import java.util.Scanner;

public class A_B_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>arr = new ArrayList<>();
        //询问次数
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (l >= 1 && r <= m) {
                arr.add(prime(l,r)+"");
            }else {
                arr.add("Crossing the line");
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    public static int prime (int l, int r){
        int count =0;
        if(l<2){
            l=2;
        }
        for (int i = l; i <= r; i++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {
                //能够整除说明不是
                if(i%j==0){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    }
}