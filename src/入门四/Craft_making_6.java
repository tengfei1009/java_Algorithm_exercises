package 入门四;

import java.util.Scanner;

public class Craft_making_6 {
    //工艺品制作,数组标记暴力破解
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //正方体的大小
            int w = scanner.nextInt();
            int x = scanner.nextInt();
            int h = scanner.nextInt();

            //切割次数
            int q = scanner.nextInt();


            int[][][] cube = new int[w + 1][x + 1][h + 1];
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= x; j++) {
                    for (int k = 1; k <= h; k++) {
                        cube[i][j][k] = 1;
                    }
                }
            }

            for (int i = 0; i < q; i++) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int z1 = scanner.nextInt();

                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                int z2 = scanner.nextInt();

                for (int j = x1; j <= x2; j++) {
                    for (int k = y1; k <= y2; k++) {
                        for (int l = z1; l <= z2; l++) {
                            cube[j][k][l] = 0;
                        }
                    }
                }
            }

            int volume = 0;
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= x; j++) {
                    for (int k = 1; k <= h; k++) {
                        if (cube[i][j][k] == 1) {
                            volume++;
                        }
                    }
                }
            }

            System.out.println(volume);
        }
    }
