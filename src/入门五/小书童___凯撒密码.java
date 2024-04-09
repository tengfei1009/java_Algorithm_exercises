package 入门五;

import java.util.Scanner;

public class 小书童___凯撒密码 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //往前移动了多少行
        int n =sc.nextInt();
        //获取原文字符串
        String str =sc.next();
        char []arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=n;
            if(arr[i]>'z'){
                arr[i]=(char)(arr[i]-'z'+'a'-1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
