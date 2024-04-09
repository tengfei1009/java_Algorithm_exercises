package 入门五;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class 统计单词数{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();//这里同下
        String text = scanner.nextLine();//重点，如果写成scanner.next()就会错误，因为只有nextLine()可以输入像空格、回车一样的字符
        String[] datas = text.split(" ");//用分割函数将分割之后的串存到datas数组中
        int count = 0;// 计数器
        boolean flag = false;
        int location = 0;// 表示在文章中第一次出现时，单词首字母在文章中的位置
        for (int i = 0; i < datas.length; i++) {
            if (datas[i].equalsIgnoreCase(word)) {
                count++;
            } else {
                if (!flag) { // 如果已经出现了第一个单词，就不要再继续了
                    location +=  datas[i].length() + 1; // 如果遍历的单词不是，就把位置加好
                }
            }
            //判断，计算位置,想测试的话可以把下面的注释打开
            if (count == 1) {
                flag = true;
            }
        }
        if (count == 0) {
            //如果单词在文章中没有出现，则直接输出一个整数-1
            System.out.println(-1);
        } else {
            System.out.println(count + " " + location);
        }
        scanner.close();
    }
}