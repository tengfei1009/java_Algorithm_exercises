package 入门五;

import java.util.Scanner;

public class 自动修正 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        char[] arr= str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            if(arr[i]>='a'&&arr[i]<='z'){
                arr[i]=(char)(arr[i]-'a'+'A');
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
