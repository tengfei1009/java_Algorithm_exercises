package 入门五;

import java.util.ArrayList;
import java.util.Scanner;

public class 文字处理软件_2 {
    static Scanner sc =new Scanner(System.in);
    static int cao = sc.nextInt();
    static String str = sc.next();
    public static void main(String[] args) {

        ArrayList ss = new ArrayList();
        for (int i = 0; i < cao; i++) {
            switch (sc.nextInt()) {
                case 1 :
                    ss.add(one(sc.next()));
                    break;
                case 2 :
                    ss.add( two(sc.nextInt(), sc.nextInt()));
                    break;
                case 3 :

                    ss.add(three(sc.nextInt(), sc.next()));
                    break;
                case 4 :
                    ss.add(four(sc.next()));
                    break;
            }
        }
        for (int i = 0; i < ss.size(); i++) {
            System.out.println(ss.get(i));
        }
    }
    public static String one(String s) {
        return str+=s;
    }
    public static String two(int a ,int b) {
        return str=str.substring(a,a+b);

    }
    public static String three(int a,String s) {
        //暴力插入
        return str=str.substring(0,a)+s+str.substring(a,str.length()); //截取的范围是0~a-1   如果只写一个数,那么就是从那个数索引截取到后面的

    }
    public static int four(String s) {
        return str.indexOf(s); //返回索引
    }
}
