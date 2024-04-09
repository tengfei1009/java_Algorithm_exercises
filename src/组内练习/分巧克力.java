package 组内练习;

import java.util.Scanner;

public class 分巧克力 {
    public static void main(String[] args) {
        //假设巧克力的边长从10000开始,因为分出来的尽可能大,如果大了就缩小范围
        int r = 10000;
        int l = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //N块巧克力
        int k = sc.nextInt();  //K个人
        int[] h = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int res = 0;
        while (l <= r) {//判断边长的临界值
            int mid = (l + r) / 2;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                //算出总块数
                cnt +=(h[i]/mid)*(w[i]/mid);
            }
            if(cnt>=k){//如果数量够,就增大边长
                l=mid+1;
                res =mid;
            }else {
                r=mid-1;//不够就缩小边长
            }
        }
        System.out.println(res);
    }
}
