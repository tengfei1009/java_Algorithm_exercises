package 入门四;

import java.util.Scanner;

public class Statistics_In_Dreams_11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int M =sc.nextInt();
        int N =sc.nextInt();
        int []arr =new int[10];
        for(int i=M;i<=N;i++){
            int mid =i;
            //当i还有位数时
            while(mid!=0){
                arr[mid%10]++;
                mid/=10;
            }
            //判断每个数的个位十位百位
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
