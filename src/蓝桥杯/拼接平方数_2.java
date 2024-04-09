package 蓝桥杯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 拼接平方数_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // 区间起始值
        int r = sc.nextInt(); // 区间结束值

        List<Integer> res = find(l, r);

//        System.out.println("拼接平方数：");
        for (int number : res) {
            System.out.println(number);
        }
    }

    public static List<Integer> find(int l, int r) {
        List<Integer> current = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (is(i)) {
                current.add(i);
            }
        }
        return current;
    }

    public static boolean is(int number) {
        if (!isPerfectSquare(number)) {
            return false;
        }

        String numberString = Integer.toString(number);
        int length = numberString.length();

        for (int i = 1; i < length; i++) {
            int firstPart = Integer.parseInt(numberString.substring(0, i));
            int secondPart = Integer.parseInt(numberString.substring(i));
            if(firstPart!=0&&secondPart!=0){
                if (isPerfectSquare(firstPart)&&isPerfectSquare(secondPart)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPerfectSquare(int number) {
        return (int) Math.sqrt(number) == Math.sqrt(number);
    }
}

