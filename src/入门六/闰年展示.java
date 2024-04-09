package 入门六;

import java.util.ArrayList;
import java.util.Scanner;

public class 闰年展示 {
    public static void main(String[] args) {
        int count =0;
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        ArrayList array =new ArrayList<>();
        for (int i = x; i <= y; i++) {
            if((i%4==0 && i%100!=0)|| i%400==0){
                count ++;
                array.add(i);
            }
        }
        System.out.println(count);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
        }
    }
}
