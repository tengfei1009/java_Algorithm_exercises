package 蓝桥杯;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 危险系数_2 {
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 读取节点数量
        int m = sc.nextInt(); // 读取边数量
        List<Integer>[] lists = new List[n + 1]; // 创建邻接表数组
        for (int i = 0; i <= n; i++) {
            lists[i] = new ArrayList<>(); // 初始化邻接表
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(); // 读取边的起点
            int y = sc.nextInt(); // 读取边的终点
            lists[x].add(y); // 将边的终点添加到起点的邻接表中
            lists[y].add(x); // 将边的起点添加到终点的邻接表中
        }
        int x = sc.nextInt(); // 读取起始点
        int y = sc.nextInt(); // 读取目标点
        int []v = new int[n+1]; // 创建标记数组
        v[x]=1; // 标记起始点已访问
        dfs(-1,x,y,lists,v); // 进行深度优先搜索
        if(!flag){
            System.out.println(-1); // 输出结果为-1，表示起始点和目标点不连通
        }else {
            int res =0; // 初始化结果计数器
            for (int i = 0; i < n; i++) {
                if(i==x||i==y||lists[i].size()==0){
                    continue;
                }
                flag =false;
                v = new int[n+1];
                v[x]=1;
                dfs(i,x,y,lists,v);
                if(!flag) {//如果去除当前点就联不通，那么当前点就是一个必经点
                    res++; // 对于每个非起始点和目标点且邻接表非空的节点，进行深度优先搜索
                }
            }
            System.out.println(res); // 输出结果计数器的值，表示与起始点和目标点不连通的节点数量
        }
    }
    //检测两个点是否连通
    public static void dfs(int i ,int s,int t,List<Integer>[]list,int []v){
        if(s==t){
            flag = true; // 如果起点和目标点相同，则标记为连通
            return;
        }
        for(int x :list[s]){
            if(v[x]==1||x==i){//被标记过，或者当前坐标为必经点
                continue;
            }
            v[x]=1;
            dfs(i,x,t,list,v); // 递归搜索与起点和目标点连通的路径
        }
    }
}