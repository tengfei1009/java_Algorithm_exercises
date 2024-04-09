package 入门五;

import java.util.Scanner;

public class 垂直柱状图 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //建一个数组,表示26个字母出现的次数
        int [] s =new int[26];
        String str;
        char a;
        for (int i = 0; i <= 3; i++) {  //一共四行
            str = sc.nextLine();  //获取到字符串
            //获取每一行每一个字母,判断字母对应数组中的第几个索引里面++
            for (int j = 0; j < str.length(); j++) {
                a =str.charAt(j);
                if(a>='A' && a<='Z'){
                    s[a-'A']++;  //记录A-Z的字符数
                }
            }
        }
        //数组填充完毕,现在需要找出最大值,来定义最高行数
        int max = 0;
        //遍历数组,得到最大值
        for (int i = 0; i <= 25; i++) {
            if(s[i]>max){
                max = s[i];
            }
        }

        //输出行数,因为已经得到了最大行数
        for (int i = max; i >=1 ; i--) { //一共max行
            for (int j = 0; j <= 25; j++) { //一共26列
                if(s[j] == i){
                    s[j]--;
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }
}