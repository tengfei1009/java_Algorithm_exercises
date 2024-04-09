package 动态规划;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class 语文成绩 {
    public static void main(String[] args) throws Exception {
        Read sc =new Read();
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //学生数量
        int p = sc.nextInt(); //增加分数的次数
        int[] a = new int[n+1];
        int[] arr = new int[n+2];
        //初始化数组
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        //将数组变成差分数组,再对差分数组进行操作,将差分数组再加回原数组

        for (int i = 1; i <= n; i++) {
            arr[i] = a[i] - a[i - 1];//变成差分数组
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < p; i++) { //增加分数的次数
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            arr[x] += z;
            if (y<n) {
                arr[y + 1] -= z;
            }
        }
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i];
            min = arr[i] < min ? arr[i] : min;
        }
        System.out.println(min);
    }
}

//快读
class Read {
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public int nextInt() throws Exception {
        st.nextToken();
        return (int) st.nval;
    }
}
