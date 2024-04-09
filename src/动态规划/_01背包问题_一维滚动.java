package 动态规划;

import java.util.Scanner;

public class _01背包问题_一维滚动 {
    //容量为j的背包,所能装的最大价值为dp[j]

    //    因为递推公式是退后的，而滚动数组需要利用上一层的数据，如果正序遍历，那么只有第一个是正确的，后面的dp递推全用的是本层刚算出来的数据了
    //一维数组,每个物品只使用一次,滚动赋值,如果,先遍历背包再遍历物品,此时同一个物品被反复使用了,不符合条件,所以只能先遍历物品
    //再遍历背包
    //定义dp数组
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //一共多少种
        int M = sc.nextInt();
        //背包的空间有多少
        int N = sc.nextInt();

        //每种材料所占的空间
        int[] weight = new int[M];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = sc.nextInt();
        }
        //每种材料的研究价值
        int[] value = new int[M];
        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextInt();
        }

        int[] dp = new int[N + 1];

        //初始化dp数组
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 0;
        }
//        dp[0]=0;
        //先遍历物品,再遍历背包容量
        for (int i = 0; i < M; i++) {
            //当前容量大于，物品大小
            for (int j = N; j >= weight[i]; j--) {
                //dp[j]就是上一层覆盖下一层,就相当于没有添加该物品的最大研究价值,与添加了该物品的最大研究加载比较
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        System.out.println(dp[N]);
    }
}
//当使用正向遍历时，考虑以下情况：
//        假设有3个物品，它们的重量分别为2、3和4，价值分别为4、5和6。背包的容量为5。
//        在第一个物品（重量为2，价值为4）的情况下，我们需要计算 dp[j]（背包容量为j）的最大价值。当j等于2时，我们需要使用到 dp[j - weight[i]]，也就是 dp[0]，但是此时 dp[0] 还没有被更新。
//        因此，在正向遍历的情况下，无法正确地计算每个状态的值。
//相比之下，使用倒着遍历的代码如下：
//        在第一个物品的情况下，当j等于2时，我们需要使用到 dp[j - weight[i]]，也就是 dp[0]。由于我们是倒着遍历，此时 dp[0] 已经被更新过，因此我们可以正确地计算每个状态的值。
//        通过倒着遍历，我们确保在计算每个状态时，所依赖的状态值已经被正确计算并更新，从而得到正确的结果。
