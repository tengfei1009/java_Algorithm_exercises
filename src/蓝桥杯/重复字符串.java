package 蓝桥杯;

import java.util.Scanner;

public class 重复字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int n = arr.length;
        if (n % k != 0) {
            System.out.println(-1);
            return;
        }
        int m= n/k;  //6/2=3 分成三个字段
        int[][]res =new int[m][26];//找出每个字符串同一位置出现最多的字母
        int ans =0;
        for (int i = 0; i < n; i++) {
            int x = arr[i]-'a';
            res[i%m][x]++;
        }
        for (int i = 0; i < m; i++) {
            int sum=0,max=0;
            for (int j = 0; j < 26; j++) {
                sum+=res[i][j];
                max =Math.max(max,res[i][j]);
            }
            ans+=sum-max;//当前位置需要修改的次数
        }
        System.out.println(ans);
    }
}
