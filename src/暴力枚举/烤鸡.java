package 暴力枚举;

import java.util.Scanner;

//暴力枚举
public class 烤鸡 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        //枚举
        int a,b,c,d,e,f,g,h,i,j;
        for (a = 1; a <= 3; a++) {
            for (b = 1; b <= 3; b++) {
                for (c = 1; c <= 3; c++) {
                    for (d = 1; d <= 3; d++) {
                        for (e = 1; e <= 3; e++) {
                            for (f = 1; f <= 3; f++) {
                                for (g = 1; g <= 3; g++) {
                                    for (h = 1; h <= 3; h++) {
                                        for (i = 1; i <= 3; i++) {
                                            for (j = 1; j <= 3; j++) {
                                                if(a+b+c+d+e+f+g+h+i+j==n) {
                                                    count++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
        for (a = 1; a <= 3; a++) {
            for (b = 1; b <= 3; b++) {
                for (c = 1; c <= 3; c++) {
                    for (d = 1; d <= 3; d++) {
                        for (e = 1; e <= 3; e++) {
                            for (f = 1; f <= 3; f++) {
                                for (g = 1; g <= 3; g++) {
                                    for (h = 1; h <= 3; h++) {
                                        for (i = 1; i <= 3; i++) {
                                            for (j = 1; j <= 3; j++) {
                                                if(a+b+c+d+e+f+g+h+i+j==n) {
                                                    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        scanner.close();
    }
}
