package 蓝桥杯;

import java.util.Scanner;

public class 合根植物2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count =0;
        //初始化数组
        int []f = new int[m*n+1];
        for (int i = 1; i < f.length; i++) {
            f[i] = i;
        }

        int k = sc.nextInt();
        while(k-->0){
            //输入两种植物
            int a = sc.nextInt();
            int b = sc.nextInt();
            marge(f,a,b); //合并a与b植物
        }
        for (int i = 1; i < f.length; i++) {
            if(f[i] == i){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int getF(int[]f,int v){
        if(f[v]==v){
            return v; //获取到当前合株植物的根节点
        }else {
            //不断地找
            //f[6]= getF(f,3)
            f[v] = getF(f,f[v]);
        }
        return f[v];
    }
    public static void marge(int []f,int v ,int u){

        int t1 = getF(f,v); //2   3  f[3]=2;  6  f[6] =getF(f,6);
        int t2 = getF(f,u); //3   6  f[6]=6;  10
        if(t1!=t2){
            f[t2]=t1; //f[3] =2;  //f[6]=f[3]=2;
        }
    }
}