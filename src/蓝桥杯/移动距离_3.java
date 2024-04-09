package 蓝桥杯;
import java.util.Scanner;

public class 移动距离_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); // 输入网格的宽度
        int m = sc.nextInt(); // 第一个点的位置
        int n = sc.nextInt(); // 第二个点的位置

        int my = m / w; // 第一个点所在的行
        int ny = n / w; // 第二个点所在的行

        int mx, nx; // 第一个点和第二个点所在的列

        if (my % 2 == 1) {//是偶数行
            if (m % w == 0)
                mx = w;
            else
                mx = m % w;
        } else {  //是奇数行
            if (m % w == 0)
                mx = 1;
            else
                mx = w + 1 - m % w;
        }

        if (ny % 2 == 1) {
            if (n % w == 0)
                nx = w;
            else
                nx = n % w;
        } else {
            if (n % w == 0)
                nx = 1;
            else
                nx = w + 1 - n % w;
        }

        int distance = Math.abs(mx - nx) + Math.abs(my - ny); // 计算距离
        System.out.println(distance); // 输出距离
    }
}