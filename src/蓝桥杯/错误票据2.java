package 蓝桥杯;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 错误票据2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> array =new ArrayList<>();
        sc.nextLine();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                array.add(Integer.parseInt(arr[j]));
            }
        }
        Collections.sort(array);
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i)-array.get(i-1)>1){
                a = array.get(i-1)+1;
            }
            if(array.get(i).equals(array.get(i-1))){
                b = array.get(i);
            }
            if(a*b!=0){
                break;
            }
        }
        System.out.println(a+" "+b);
    }
}
