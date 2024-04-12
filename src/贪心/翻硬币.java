package 贪心;

import java.util.Scanner;

public class 翻硬币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray(); // 从输入中获取第一个字符串，并将其转换为字符数组
        char[] b = sc.next().toCharArray(); // 从输入中获取第二个字符串，并将其转换为字符数组
        int n = a.length; // 字符串长度
        int ans = 0; // 存储结果的变量
        for (int i = 0; i < n; i++) {
            // 如果两个字符不相等，进行翻转操作
            if (a[i] != b[i]) {
                for (int j = i+1; j < n; j++) {
                    // 找到下一个不相等的字符
                    if(a[j]!=b[j]){
                        ans+=j-i; // 计算翻转的操作次数
                        i=j; // 更新外层循环的索引位置
                        break;
                    }
                }
            }
        }
        System.out.println(ans); // 输出最终结果
    }
}