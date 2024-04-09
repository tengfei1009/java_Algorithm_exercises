package 二叉树的遍历;

import java.util.*;

public class 完全二叉树的权值_2 {
    static int N = 100010;//使得数据范围最大
    static long[] arr = new long[N];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        long max = arr[1];//默认第一个数为最大
        long deep = 1;//默认第一层开始遍历
        long a = 1;//用于存放层数
        //进行遍历处理
        for (int i = 1; i < n; i = i * 2) {//每次i的值都为当前层数的首节点编号  i的起始索引为i*i
            long res = 0;//定义一个变量存放每次累加的结果
            for (int j = i; j <= 2 * i - 1 && j <= n; j++) {//每一层的个数为2*i-1
                res = res + arr[j];
            }
            //找出当前深度结点权值之和的最大
            if (max < res) {
                a = deep;
                max = res;
            }
            //到下一层
            deep++;
        }
        System.out.println(a);
    }
}

