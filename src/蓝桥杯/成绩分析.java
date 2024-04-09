package 蓝桥杯;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 成绩分析 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> array = new ArrayList();
        while (sc.hasNext()){
            array.add(sc.nextInt());
        }
        Collections.sort(array);
        int sum =0;
        for (int i = 0; i < array.size(); i++) {
            sum+=array.get(i);
        }
        int min = array.get(0);
        int max = array.get(array.size()-1);
        double avg = sum*1.0/ array.size();
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f",avg);
    }
}
