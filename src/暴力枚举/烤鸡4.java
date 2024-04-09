package 暴力枚举;

import java.util.Scanner;

public class 烤鸡4 {
        static StringBuilder s =new StringBuilder();
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr=new int[10];
            int []count=new int[1];
            if (n>=10&&n<=30){
                xun(arr,count,n-10,0);
                System.out.println(count[0]);
                System.out.println(s);
            }else {
                System.out.println(0);
            }
        }
        public static void xun ( int[]arr, int[] count, int n,int index){
            if (n==0&&index==10){
                for (int i = 0; i < 10; i++) {
                    s.append(arr[i]).append(" ");
                }
                count[0]++;
                s.append("\n");
                return;

            }else if (index==10){return;}
            arr[index]=1;
            xun(arr,count,n,index+1);
            arr[index]=2;
            xun(arr,count,n-1,index+1);
            arr[index]=3;
            xun(arr,count,n-2,index+1);
        }
    }
