package 入门五;

import java.util.ArrayList;
import java.util.Scanner;

public class 文字处理软件_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.next());
        ArrayList  array =new ArrayList();
//        sc.nextLine();

        String sum = sc.next();
        //吞一个换行符
        sc.nextLine();
        //输入
        for (int i = 0; i < q; i++) {
            //读取到一个数组
            String []s = sc.nextLine().split(" ");
            if (s[0].charAt(0) == '1') {
                sum = sum + s[1];
                array.add(sum);
//                System.out.println(sum);
            } else if (s[0].charAt(0) == '2') {
                String amount = sum;
                sum = "";
                for (int j = Integer.parseInt(s[1]); j < Integer.parseInt(s[1]) + Integer.parseInt(s[2]); j++) {
                    sum = sum + amount.charAt(j);
                }
                array.add(sum);
//                System.out.println(sum);
            } else if (s[0].charAt(0) == '3') {
                String amount = sum;
                sum = "";
                for (int j = 0; j < Integer.parseInt(s[1]); j++) {
                    sum = sum + amount.charAt(j);
                }
                sum = sum + s[2];
                for (int j = Integer.parseInt(s[1]); j < amount.length(); j++) {
                    sum = sum + amount.charAt(j);
                }
                array.add(sum);
//                System.out.println(sum);
            } else if (s[0].charAt(0) == '4') {
                array.add(sum.indexOf(s[1]));
//                System.out.println(sum.indexOf(s[1]));
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
