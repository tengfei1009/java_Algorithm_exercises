package 入门五;

import java.util.Scanner;

public class 笨小猴 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        char []arr1 =str.toCharArray();
        int arr2[] = new int[100];


        for (int i = 0; i < arr1.length; i++) {//找出每个位置字母在整个字符串中相同字母的个数
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                //每一位判断
                if (arr1[i]==arr1[j]) {
                    count++;
                }
            }
            //第i位有多少个
            arr2[i] = count;
        }
        //假设第一位出现的最多(因为至少有一位)
        int max = arr2[0];
        //假设第一位出现的少(因为至少有一位)
        int min = arr2[0];

        //判断个数也只需要判断字符串长度个数即可
        for (int i = 1; i < arr1.length; i++) { // 根据比较大小来判断数组a中谁最大谁最小
            if(arr2[i]==0){
                break;
            }
                if (arr2[i] >= max ) {
                    max = arr2[i];
                }
                if (arr2[i] <= min) {
                    min = arr2[i];
                }
        }

        //得到最大和最小之间的差
        int s =max-min;
        boolean mid =Prime(s);
        if(mid &&s!=0 && s!=1){
            System.out.println("Lucky Word");
            System.out.print(s);
        }else {
            System.out.println("No Answer");
            System.out.print(0);
        }
    }

    public static boolean Prime(int s){
        //判断是否为质数
        boolean mid =true;
        for (int i = 2; i < s; i++) {
            if(s%i==0){
                //不是一个质数,跳出循环
                mid =false;
                break;
            }
        }
        return mid;
    }
}
