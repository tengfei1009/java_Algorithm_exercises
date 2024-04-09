package 入门四;

import java.util.Scanner;

//小鱼数字游戏
public class Fish_Num_02 {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int []arr_1=new int[50];
        for (i=0;;i++) {
            //输入数字并判断是否结束
            arr_1[i]=sc.nextInt();
            if(arr_1[i]==0){
//                System.out.println(i);
                //实际上现在i已经是++过的了
//                int b=i++;
//                System.out.println(b);
//                System.out.println(i);
                break;
            }
        }
        //倒着遍历,把最后一个去掉
        for (i--;i>=0;i--){
            System.out.print(arr_1[i]+" ");
        }
    }
}
