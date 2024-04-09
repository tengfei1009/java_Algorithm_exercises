package 蓝桥杯;

import java.util.Scanner;

public class 天干地支 {
    //天干 1~10
    //地支 1~12
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n  = sc.nextInt();
        String []tian= {"geng", "xin", "ren", "gui", "jia", "yi" , "bing", "ding", "wu", "ji"};
        String[] di = {"shen", "you", "xu", "hai", "zi", "chou", "yin", "mou", "chen", "si", "wu", "wei"};
        System.out.println(tian[n%10]+di[n%12]);
    }
}
