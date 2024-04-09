package 入门四;

import java.util.Scanner;

public class The_Heartache_Of_Love_And_Sorrow_13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t= sc.nextInt();
        int []arr =new int[n];

        //对痛值进行初始化
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int min=0;  //记录最开始的前t个值
        int temp=0;  //记录获取到后面的前t个值

        //记录前t个数,作为最小值
        for (int i = 0; i < t; i++) {
            min=arr[i]+min;
        }
        //从1索引开始,因为从第0位开始已经赋值好了
        for (int i = 1; i < arr.length+1-t; i++) {
            for(int j=i;j<t+i;j++){  //中间相差i个
                temp=arr[j]+temp;
            }
            if(temp<min){
                min=temp;
            }
            temp=0;
        }
        System.out.println(min);
    }
}
