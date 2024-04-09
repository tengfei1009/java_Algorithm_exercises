package 搜索;

import java.util.Scanner;

public class dfs洪水深搜 {
    //定义一片区域 (n,m)
    static int n,m;
    static int [][]f = new int [1001][1001];
    static int ans;
    static char [][]a =new char[1001][1001];  //这个是水域  0为坡,1为水域,相邻水域(上下左右相邻)为同一片水域,
    // 搜索再n,m范围内,一共有多少片水域

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();//一维,纵向长度 y
        m = sc.nextInt();//二维,横向长度 x
        for (int i = 1; i <= n; i++) { //横向遍历
            for (int j = 1; j <= m; j++) { //横向遍历每一行中的每一个数
                if(a[i][j] !='0'){ //找到第一个水域,进行搜索
                    ans++;//水域数量++
                    dfs(i,j); //传入这个水域坐标,通过水域坐标搜索
                }
            }
        }
        System.out.println(ans);
    }
    private static void dfs(int x, int y){
        if(x<1 ||x>n || y <1 ||y>m || a[x][y] =='0'){//递归当前坐标是否合法,只有合法了才能进行标记,不合法退出深搜
            return;
        }
        //搜索水域坐标的上下左右,如果为相同就标记
        dfs(x-1,y);//搜索上
        dfs(x+1,y);//搜索下
        dfs(x,y-1);//搜索左
        dfs(x,y+1);//搜索右

        //标记当前合法坐标
        a[x][y] ='0';
    }
}
