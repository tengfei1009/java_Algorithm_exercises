package 快读;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class 语文成绩 {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        Read sc=new Read();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[n+1]; //得到原数组
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        //增加分数就是求前缀和数组,最后得到的就是原数组
        int min =Integer.MAX_VALUE;
        int[] arr = new int[n + 2];
        for (int i = 1; i <=n; i++) {
            arr[i] = a[i] - a[i - 1];
        }
        for (int i = 0; i < p; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            //得到差分数组
            arr[x] += z;
            arr[y + 1] -= z;
        }
        for (int i = 1; i <=n; i++) {
            arr[i] += arr[i - 1];
            min = arr[i]<min ? arr[i] :min;
        }
        System.out.println(min);
    }
}
class Read {
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public int nextInt() throws Exception {
        st.nextToken();
        return (int) st.nval;
    }
}