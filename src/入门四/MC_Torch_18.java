package 入门四;

import java.util.Scanner;

public class MC_Torch_18 {
    //插火把
    public static void main(String[] args) {
        //先开一个方阵
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        //假设为n
        boolean [][]arr =new boolean [n+4][n+4];

        //有的火把数
        int m= sc.nextInt();
        //有的萤石数
        int k= sc.nextInt();

        //所有区域都为黑
        for (int i = 0; i < n+4; i++) {
            for (int j = 0; j < n+4; j++) {
                arr[i][j]=false;
            }
        }

        for (int i = 0; i < m; i++) {
            //有多少火把输入多少对横纵坐标
            int x = sc.nextInt()-1;
            int y= sc.nextInt()-1;
                    arr[x][y+2]=true;

                    arr[x+1][y+1]=true;
                    arr[x+1][y+2]=true;
                    arr[x+1][y+3]=true;

                    arr[x+2][y]=true;
                    arr[x+2][y+1]=true;
                    arr[x+2][y+2]=true;
                    arr[x+2][y+3]=true;
                    arr[x+2][y+4]=true;

                    arr[x+3][y+1]=true;
                    arr[x+3][y+2]=true;
                    arr[x+3][y+3]=true;

                    arr[x+4][y+2]=true;

        }

        //萤石
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt()-1;
            int y= sc.nextInt()-1;
                    arr[x][y]=true;
                    arr[x][y+1]=true;
                    arr[x][y+2]=true;
                    arr[x][y+3]=true;
                    arr[x][y+4]=true;

                    arr[x+1][y]=true;
                    arr[x+1][y+1]=true;
                    arr[x+1][y+2]=true;
                    arr[x+1][y+3]=true;
                    arr[x+1][y+4]=true;

                    arr[x+2][y] =true;
                    arr[x+2][y+1] =true;
                    arr[x+2][y+2] =true;
                    arr[x+2][y+3] =true;
                    arr[x+2][y+4] =true;

                    arr[x+3][y]=true;
                    arr[x+3][y+1]=true;
                    arr[x+3][y+2]=true;
                    arr[x+3][y+3]=true;
                    arr[x+3][y+4]=true;

                    arr[x+4][y]=true;
                    arr[x+4][y+1]=true;
                    arr[x+4][y+2]=true;
                    arr[x+4][y+3]=true;
                    arr[x+4][y+4]=true;
        }
        int count=0;
        //循环遍历,外层从2到n+2,内层从2到n+2
        for (int i = 2; i < n + 2; i++) {
            for (int j = 2; j < n+2; j++) {
                if(arr[i][j]==false){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
