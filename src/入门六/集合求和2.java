package 入门六;

import java.util.Scanner;

public class 集合求和2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String[] arr = n.split(" ");

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=Integer.valueOf(arr[i]);
        }
        //获取到每个元素在集合中出现的次数
        //求出每个元素的和
        for (int i = 1; i < arr.length; i++) {
            sum =sum*2;
        }
        System.out.println(sum);
    }
}
