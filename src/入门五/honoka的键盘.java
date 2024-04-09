package 入门五;

import java.util.Scanner;

public class honoka的键盘 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length = sc.nextInt();
        String str = sc.next();
        int index = 0;
        int count = 0;
        //统计VK个数
        while ((index = str.indexOf("VK", index)) != -1) {
            count++;
            index += "VK".length();

        }
        //将str中所有VK全部替换
        str=str.replace("VK"," ");
//        System.out.println(str);

        //查找剩下的字符串中
        if(str.indexOf("VV")!=-1 || str.indexOf("KK")!=-1){
            count++;
        }
        System.out.println(count);
    }
}
