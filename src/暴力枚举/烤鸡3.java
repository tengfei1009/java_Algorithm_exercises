package 暴力枚举;

import java.util.Scanner;
//深度搜索
public class 烤鸡3 {

    static StringBuffer ans =new StringBuffer();
    static int count =0;
    static int n;  // 读取输入值并赋给n
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        dfs(0, 0, ""); // 调用dfs函数，初始值为0
        System.out.println(count); // 打印有效组合的数量
        System.out.print(ans); // 打印有效组合
    }

    // 深度优先搜索函数
    private static void dfs(int i, int sum, String str) {
        // 检查配料级别之和是否超过目标值
        if (sum > n) {
            return; // 如果超过目标值，返回并终止该分支的递归
        }
        // 检查是否已处理了所有10种配料
        if (i == 10) {
            if (sum == n) {
                // 如果配料级别之和等于目标值，则得到一个有效的组合
                count++; // 增加有效组合的数量
                str = str.trim(); // 去除组合字符串的前导和尾随空格
                ans.append(str + "\n"); // 将组合追加到答案字符串中
            }
            return; // 返回并终止该分支的递归
        }
        // 递归地遍历三个配料级别
        for (int j = 1; j <= 3; j++) {
            dfs(i + 1, sum + j, str + " " + String.valueOf(j)); // 递归调用dfs，并更新值
        }
    }
}
