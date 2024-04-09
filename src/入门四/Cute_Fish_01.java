package 入门四;

import java.util.Scanner;

//小鱼比可爱
public class Cute_Fish_01 {
    public static void main (String []args) {
        Scanner sc =new Scanner (System.in);
        int num=sc.nextInt();
        int []arr = new int[num];
        //有多少鱼就有多少可爱程度
        //给数组存储了数据，接下来遍历每个数据，进行比较
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            //记录这个鱼前面有多少个鱼比他可爱
            int a=0;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    a++;
                }
            }
            System.out.print(a+" ");
        }
    }
}
