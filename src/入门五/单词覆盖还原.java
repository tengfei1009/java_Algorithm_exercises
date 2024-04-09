package 入门五;

import java.util.Scanner;

public class 单词覆盖还原 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        String a = "boy";
        String b = "girl";
        int index = 0 ;
        int b_count= 0;
        int g_count = 0;
        //统计个数
        while((index = str.indexOf("boy",index))!=-1){  //从0索引开始查询查询到第一个boy的索引并返回其下标
            b_count++;
            index +=a.length();
        }
        while((index = str.indexOf("girl",index))!=-1){  //从0索引开始查询查询到第一个boy的索引并返回其下标
            g_count++;
            index +=b.length();
        }
        //字符串替换
        str=str.replace("boy","").replace("girl","").replace(".","");

        System.out.println(str);

        //遍历剩下的字符串
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'b' ||str.charAt(i)=='o'||str.charAt(i)=='y'){
                b_count++;
            }
            if(str.charAt(i) == 'g' ||str.charAt(i)=='i'||str.charAt(i)=='r'||str.charAt(i)=='l'){
                g_count++;
            }
        }
        System.out.println(b_count);
        System.out.println(g_count);
    }
}
