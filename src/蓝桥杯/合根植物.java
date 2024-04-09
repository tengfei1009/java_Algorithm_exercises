package 蓝桥杯;

import java.util.Scanner;

public class 合根植物 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;

        int [] f=new int[n*m+1];

//数据初始化
        for (int i = 1; i<f.length;i++){
            f[i]=i;
        }

        //输入
        int k=sc.nextInt();

        while (k-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            merge(f, a, b);//合并a与b植物
        }

//找出合根植物的数量

        for (int i = 1; i <f.length;i++){
            if (f[i]==i) {
                count++;
            }
        }
        System.out.println(count);
    }

    //getF ，获取根节点
    public static int getF(int []f,int v) {

        if (f[v]==v) {
            return v;
        }else {
            f[v]=getF(f, f[v]);
            return f[v];
        }
    }
    //merge,合并节点
    public static void merge(int []f,int v,int u) {
        int t1=getF(f, v);
        int t2=getF(f, u);

        if (t1!=t2) {
            f[t2]=t1;
        }
    }
}