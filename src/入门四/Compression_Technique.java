package 入门四;

import java.util.Scanner;

public class Compression_Technique {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        //一个n*n的数组
        int count=0;
        //从起点开始
        int start=0;
        //定义一个计时器,按照奇偶性来输出,奇数输出0,偶数输出1
        int m =0;

                //不够一直输入
                while(start!=n*n){
                    int a = sc.nextInt();
                    //依次输出a个数
                    for (int k = 0; k < a; k++) {
                        if(count%2==0){
                            //偶数个,输入0
                            System.out.print(0);
//                            System.out.println("hhhhh");
                        }else {
                            System.out.print(1);
                }
                        m++;
                        //m满足n就换行,也就是m到n或者n的倍数就可以换行
                        if(m%n==0){
                            System.out.println();
                        }
            }
                    count++;
                    start+=a;
        }

    }
}
