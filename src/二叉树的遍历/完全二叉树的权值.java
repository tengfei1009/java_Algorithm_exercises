package 二叉树的遍历;

import java.io.*;

public class 完全二叉树的权值 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        String[] split = br.readLine().split(" ");
        for (int i = 1; i <= n; i++)
            arr[i] = Integer.parseInt(split[i - 1]);

        long max = Long.MIN_VALUE;  //最大和
        int ans = 1;  //最大层数
        for (int deep = 1, i = 1; i <= n; i *= 2, deep++) {  //deep为当前层数，i为该层的开始下标
            long sum = 0;
            for (int j = i; j < (1 << deep) && j <= n; j++) {  //遍历每层
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
                ans = deep;
            }
        }
        System.out.println(ans);
    }
}
