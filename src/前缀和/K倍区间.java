package 前缀和;

import java.util.Scanner;

public class K倍区间 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入的整数个数
        int k = sc.nextInt(); // k倍数

        int count = 0; // 计数器，记录满足条件的区间个数

        int[] arr = new int[n + 1]; // 存储输入的整数
        long[] sum = new long[n + 1]; // 存储前缀和
        long[] cnt = new long[k]; // 存储余数计数

        sum[0] = 0; // 初始化前缀和数组

        // 读取输入的整数，并计算前缀和
        for (int i = 1; i <= n; i++) {
            long num = sc.nextLong();
            arr[i] = (int) num; // 存储整数到数组
            sum[i] = sum[i - 1] + num; // 计算前缀和
        }

        long res = 0; // 存储结果
        cnt[0] = 1; // 初始化余数计数

        // 遍历前缀和数组，统计满足条件的区间个数
//        原理是基于余数的性质。通过计算前缀和的余数，我们可以确定在某个位置之前的区间中，
//        余数相同的个数。通过累加这些个数，我们可以得到满足条件的区间个数。
//        这种方法的时间复杂度为 O(n)，其中 n 是输入整数的个数。
        for (int i = 1; i <= n; i++) {
            res += cnt[(int) (sum[i] % k)]; // 累加满足条件的区间个数
            cnt[(int) (sum[i] % k)]++; // 更新余数计数
        }

        System.out.println(res); // 输出结果
    }
}
//双层for循环
//        for (int i = 0; i <= n; i++) {
//            for (int j = i+1; j <= n; j++) {
//                if((arr[j]-arr[i])%k==0){
//                    count++;
//                }
//            }
//        }