package 入门五;

import java.util.Scanner;

public class 单词覆盖还原_2 {
    public static void main(String[] args) {
//        1.可将原始字符串str视作“..........................”，即全为“.”，每次贴上一个“boy”或者一个“girl”；
//        2.若为“boy”，则查找str中有几个‘b’，有几个‘b’说明至少有几个“boy”;
//        2.1再判断是否为‘o’，若为‘o’且‘o’的前一个字符不为‘b’，则说明这是另一个被贴上去的“boy”;
//        2.2再判断是否为‘y’，若为‘y’且‘y’的前一个字符不为‘o’，则说明这是另一个被贴上去的“boy”;
//        3.判断“girl”同理
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] chars=str.toCharArray();
        int girlSum=0;
        int boySum=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='b'){
                boySum++;
            }else if (chars[i]=='o' && chars[i-1]!='b'){
                boySum++;
            }else if (chars[i]=='y' && chars[i-1]!='o'){
                boySum++;
            }else if (chars[i]=='g'){
                girlSum++;
            } else if(chars[i] == 'i' && chars[i-1] != 'g'){
                girlSum++;
            } else if(chars[i] == 'r' && chars[i-1] != 'i') {
                girlSum++;
            } else if(chars[i] == 'l' && chars[i-1] != 'r') {
                girlSum++;
            }
        }
        System.out.println(boySum);
        System.out.println(girlSum);


    }
}
