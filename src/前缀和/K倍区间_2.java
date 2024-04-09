package 前缀和;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class K倍区间_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }

        //滑动窗口
        Deque<Integer> qu =new LinkedList<>();
        int index =0;
        int left =0;
        while (index<=n){
            qu.offerLast(arr[index]);
            while (!qu.isEmpty()&&(arr[index]-qu.peekFirst())%k==0){
                count++;
            }
            index++;

            if(index==n){
                left++;
                count++;
                index=0;
                qu.clear();

            }
            if(left==n){
                break;
            }
        }
        System.out.println(count);
    }
}
