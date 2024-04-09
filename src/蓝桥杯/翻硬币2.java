package 蓝桥杯;

import java.util.Scanner;

public class 翻硬币2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] arr1 = a.toCharArray();
        String b = sc.next();
        char []arr2 =b.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length()-1; i++) {
            if (arr1[i] != arr2[i]) {
                count++;
                //当前位置不一样就翻转一次
                arr1[i] = arr1[i]=='*' ? 'o' :'*';
                arr1[i+1] = arr1[i+1]=='*' ? 'o' :'*';
            }
        }
        System.out.println(count);
    }
}
