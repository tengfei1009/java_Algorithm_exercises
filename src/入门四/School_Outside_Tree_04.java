package 入门四;

import java.util.Scanner;

//校门外的树
public class School_Outside_Tree_04 {
    //比大小,所有的数,取最大值和最小值,然后总米数减去最大最小
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        //输入500，因为是从0 开始的 实际上有501颗树
        boolean []arr=new boolean[sc.nextInt()+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=true;
        }
        //输入区间，在区间内的都是flase
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int small= sc.nextInt();
            int big= sc.nextInt();
            //遍历所有数据
            for(int j=0;j< arr.length;j++){
                if(j>=small&&j<=big){
                    arr[j]=false;
                }
            }
        }
        int n=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==true){
                n++;
            }
        }
        System.out.println(n);
        }
    }

