package 蓝桥杯;
import java.util.Scanner;

public class 冶炼金属2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 读取输入的整数 n
        int n = scan.nextInt();

        // 初始化左右边界
        int left = 0, right = 1000000000;

        // 循环 n 次，读取每对整数 a 和 b
        while (n-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            // 计算 c 和 d 的值
            int c = a / (b + 1) + 1;
            int d = a / b;

            // 更新左边界，如果 c 大于当前左边界
            if (c > left) {
                left = c;
            }

            // 更新右边界，如果 d 小于当前右边界
            if (d < right) {
                right = d;
            }
        }

        // 输出结果
        System.out.println(left + " " + right);
    }
}
