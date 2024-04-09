package 蓝桥杯;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 网络寻路_2 {
    static int res = 0;

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        Read sc = new Read();

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] list = new List[n + 1];
        //初始化集合
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(); //起点
            int y = sc.nextInt(); //终点

            list[x].add(y);
            list[y].add(x);
        }
        int[] v = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(v, 0); //初始化为0,都没有走过
            v[i] = 1;
            dfs(i,i,list,0,v);
        }
        System.out.println(res);
    }

    private static void dfs(int start, int current, List<Integer>[] list, int step, int[] v) {
        if (step == 3) {
            res++;
            return;
        }
        for (int x : list[current]) {
            if (v[x] == 1) { //如果说当前点走过了,只有一种情况,就是步长为2的地方可以回头
                if (step % 2 == 0 && x == start) {
                    dfs(start, current, list, step + 1, v);
                }
            }else {
                v[x]=1;
                dfs(start,x,list,step+1,v);
                v[x]=0;
            }
        }
    }
}
//class Read {
//    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//
//    public int nextInt() throws Exception {
//        st.nextToken();
//        return (int) st.nval;
//    }
//}

