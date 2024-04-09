package 入门五;

import java.util.Scanner;

public class 数字反转_升级版 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String num = sc.next();
        StringBuilder sb = new StringBuilder(num);
        int check = 0;
//        for (int i = 0; i < num.length(); i++) {
//            if(num.charAt(i)=='.') {
//                check = 1;
//                break;
//            }
//            if(num.charAt(i)=='/') {
//                check = 2;
//                break;
//            }
//        }
//        if(num.charAt(num.length()-1)=='%') {
//            check = 3;
//        }

        if (num.contains(".")) check = 1;
        if (num.contains("/")) check = 2;
        if (num.contains("%")) check = 3;

        //判断是哪种数
        switch (check) {
            case 0 :    //整数
            break;
            case 1 :    //小数
                break;
            case 2 :    //分数
                break;
            case 3 :    //百分数
                break;
        }
        System.out.println(num);
    }


}
