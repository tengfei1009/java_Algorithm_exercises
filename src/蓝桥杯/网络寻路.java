package 蓝桥杯;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 网络寻路 {
    //转发两次,枚举步长为3的不同路径
    static int res = 0;
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
        Read sc = new Read();
        int n = sc.nextInt();
        int m = sc.nextInt();
        //邻接表存储当前图
        List<Integer>[] list = new List[n + 1]; //创建一个表,表中存储的每一条是链表,代表,当前点与哪些点有连接
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>(); //对图初始化
        }
        for (int i = 0; i < m; i++) {  //接收m条边
            int x = sc.nextInt(); //起点
            int y = sc.nextInt(); //终点
            //表示两个点之间相连
            list[x].add(y);
            list[y].add(x);
        }
        int[] v = new int[n + 1]; //标记数组,当v[i]=1 表示当前点已经访问过了
        for (int i = 1; i <= n; i++) {
            Arrays.fill(v, 0); //初始化标记数组
            v[i] = 1;
            dfs(i,i,list, 0, v);
        }
        System.out.println(res);
    }

    private static void dfs(int start, int current, List<Integer>[] list, int step, int[] v) {
        if (step == 3) {
            res++;
            return;
        }
        for (int x : list[current]) {
            if (v[x] == 1) {
                if (step == 2 && x == start) {//步长为2了.搜当前表要搜回去,就可以搜回去
                    dfs(start, current, list, step + 1, v);
                }
            }else {//步长不为2,不能搜回去,并且当前搜的不是之前搜到过的,也就是新的路就继续往下搜
                v[x] = 1;
                dfs(start, x, list, step + 1, v);
                v[x]=0;
            }
        }
    }
}
class Read {
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public int nextInt() throws Exception {
        st.nextToken();
        return (int) st.nval;
    }
}
