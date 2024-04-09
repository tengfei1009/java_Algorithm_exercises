package 入门五;

import java.util.Scanner;

public class 统计单词个数_2 {
    static int count = 0;
    static int temp = 0; //第一次出现的位置
    static String model, lines;
    //指针法
    //temp作为首字母位置的记录，而count是出现次数的统计。
    static boolean first = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        model = sc.nextLine();
        lines = sc.nextLine();
        sc.close();

        model = model.toLowerCase();
        lines = lines.toLowerCase();

        String[] arr = lines.split(" ");//遇到空格就换行分开

        /**
         td
           Td tLWCsrmt
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+i);
            /**当最开始出现空格时,第一个里面存放的是null,读取第一个数据,结果读取到空格,直接到下一个空间了*/
//            System.out.println() ==  System.out.println(arr[i])
            if (arr[i].equals(model)) {
                count++;
            } else {
                if (!first) { // 如果已经出现了第一个单词，就不要再继续了
                    temp += arr[i].length() + 1; // 如果遍历的单词不是，就把位置加好
                }
            }

            if (count == 1) {
                first = true;//此时已经出现了
            }
        }
        if (count == 0) {
            //如果单词在文章中没有出现，则直接输出一个整数-1
            temp = -1;
            System.out.println(temp);
        } else {
            System.out.print(count + " " + temp);
        }
        }
    }