package 入门四;

import java.util.Scanner;

public class Compression_Technique_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //首先输出第一行
        String s =sc.next();
        //计算第一行的长度,来判断输出字符行数
        int n =s.length();

        //计算总值
        int sum =0;

        for (int i = 0; i < n-1; i++) {
            String o =sc.next();
            s+=o;
        }
        System.out.print(n+" ");


        char num ='0';

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==(char)num){
                sum++;
            } else {
                num=s.charAt(i);
                System.out.print(sum+" ");
                sum=1;
            }
        }
        //因为最后如果不变,就不会输出,所以需要输出最后一次的计数
        System.out.print(sum);
    }
}
