package 动态规划;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 砝码称重 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n个砝码
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            Set<Integer> mid = new HashSet<>();
            for (Integer res : set) {
                mid.add(Math.abs(num + res));
                mid.add(Math.abs(num - res));
            }
            set.addAll(mid);
            set.add(num);
        }
        set.remove(0);
        System.out.println(set.size());
    }
}
