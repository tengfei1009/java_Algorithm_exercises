package 入门五;

import java.util.*;

public class 垂直柱状图_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s[] = new int[26]; // 记录26个字母的个数
        String str ; // 存储当前一行的字符串
        char a; // 存储当前字符串的单个字符
        // 一共有4行数据
        for(int i=0;i<=3;i++) {
            str = in.nextLine();
            for(int j = 0;j<str.length();j++) {
                a = str.charAt(j);
//        		System.out.print(a);
                if(a>='A' && a <= 'Z') {
                    s[a-'A']++; // 记录A-Z的字符的个数
                }
            }
//        	System.out.println(str.length());
        }
        // 因为要处理结果字符串的高度，要找到出现字符中的最大值
        int max=0;
        for(int i=0;i<=25;i++) {
            if(s[i]>max) {
                max = s[i];
            }
//        	System.out.printf("%d ",s[i]);
        }
//        System.out.println();
        // 处理输出的字符
        for(int i=max;i>=1;i--) { // 一共有max行（除了字母）
            for(int j =0; j<=25;j++) { // 一共有26个字母
                if(s[j]==i) {  // 如果找到当前字符等于i,记录个数减1
                    s[j]--;
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println(); // 记得换行
        }
        System.out.print("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }
}