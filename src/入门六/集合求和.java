package 入门六;

import java.util.ArrayList;
import java.util.Scanner;

public class 集合求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        String n = sc.nextLine();
        String[] arr = n.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            array.add(num);
        }
        //获取到每个元素在集合中出现的次数
        long mid = 0;
        //求出每个元素的和
        for (int i = 0; i < array.size(); i++) {
            mid+=array.get(i);
        }
        for (int i = 1; i < array.size(); i++) {
            mid*=2;
        }
        System.out.println(mid);

        sc.close();
    }
}