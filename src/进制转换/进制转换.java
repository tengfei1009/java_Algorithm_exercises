package 进制转换;

import java.util.Scanner;

public class 进制转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 需要转化的进制
        String num = sc.next();
        StringBuilder jin = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) >= 'A' && num.charAt(i) <= 'F') {
                jin.append(num.charAt(i) - 'A' + 10);
            } else {
                jin.append(num.charAt(i));
            }
        }

        int a = Integer.parseInt(jin.toString(), n);//转化为十进制

        int m = sc.nextInt(); // 被转化的进制
        System.out.println(Integer.toString(a, m).toUpperCase());
    }
}