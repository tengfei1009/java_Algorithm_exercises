package 贪心;

import java.util.Scanner;

public class 翻硬币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int n = a.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            //翻转，两个肯定是不同的
            if (a[i] != b[i]) {
                for (int j = i+1; j < n; j++) {
                    if(a[j]!=b[j]){
                        ans+=j-i;
                        i=j;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}