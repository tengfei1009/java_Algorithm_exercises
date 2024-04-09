package 入门四;

import java.util.Random;
import java.util.Scanner;

public class Lottery_Draw_07 {
    //彩票摇奖
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr_1=new int[7];
        int []arr_2=new int[7];
        int []arr_4=new int[7];

//        中奖号码
        for(int i=0;i<7;i++){
            arr_1[i]=sc.nextInt();
        }
        //表示买了多少张
        for(int i=0;i<n;i++){
            for(int j=0;j<7;j++){
                arr_2[j]=sc.nextInt();
            }

            //定义一个中间变量
            int mid=0;

//            判断彩票号码,用二维数组
            for(int j=0;j<7;j++){
                for(int k=0;k<7;k++){
                    if(arr_1[j]==arr_2[k]){
                        mid++;
                    }
                }
            }

            switch (mid) {
                case 7:
                    arr_4[0]++; // 特等奖
                    break;
                case 6:
                    arr_4[1]++; // 一等奖
                    break;
                case 5:
                    arr_4[2]++; // 二等奖
                    break;
                case 4:
                    arr_4[3]++; // 三等奖
                    break;
                case 3:
                    arr_4[4]++; // 四等奖
                    break;
                case 2:
                    arr_4[5]++; // 五等奖
                    break;
                case 1:
                    arr_4[6]++; // 六等奖
                    break;
            }
        }
        // 输出中奖情况
        for (int i = 0; i < 7; i++) {
            System.out.print(arr_4[i]+ " ");
        }
    }
}
