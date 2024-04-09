package 入门四;

import java.util.Scanner;

//旗鼓相当的对手
public class Equal_Rivals_05 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //二维数组,方便计算每个学生的分成绩之间的差值
        int [][]arr=new int[a][3];

        //外层控制行数,内层控制列数
        for(int i=0;i<a;i++){
            for(int j=0;j<3;j++){
                //对所有学生的成绩进行赋值
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<a;i++){
            //j代表的是下一行,下一行总比上一行少一
            for(int j=i+1;j<a;j++){
                //取绝对值
                if(Math.abs(arr[i][0]+arr[i][1]+arr[i][2]-arr[j][0]-arr[j][1]-arr[j][2])<=10){
                    if(Math.abs(arr[i][0]-arr[j][0])<=5 && Math.abs(arr[i][1]-arr[j][1])<=5 && Math.abs(arr[i][2]-arr[j][2])<=5){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        }

    }