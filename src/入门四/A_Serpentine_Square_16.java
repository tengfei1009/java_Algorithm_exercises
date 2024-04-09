package 入门四;

import java.util.Scanner;

//蛇形方阵
public class A_Serpentine_Square_16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        //存储总数方便遍历
        //定义好法阵
        int [][]arr =new int[n][n];
        //x,y记录当前坐标
        int total = 1;
        int x = 0;
        int y = 0;
        arr[x][y] = 1;
        while (total <n * n) {

            while (y < n - 1 && arr[x][y + 1] == 0) {
                y++; total++;
                arr[x][y] = total;
            }
            while (x < n - 1 && arr[x + 1][y] == 0) {
                x++;  total++;
                arr[x][y] = total;
            }
            while (y > 0 && arr[x][y - 1] == 0) {
                y--; total++;
                arr[x][y] = total;
            }
            while (x > 0 && arr[x - 1][y] == 0) {
                x--; total++;
                arr[x][y] = total;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
