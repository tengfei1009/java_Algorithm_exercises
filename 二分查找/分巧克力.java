package 二分查找;

import java.util.Scanner;

public class 分巧克力 {
    public static void main(String[] args) {
        //        每个小孩获得的巧克力是一样的，所以我们可以计算每一个边长下可以切分的巧克力数量，再与孩子数量做比较即可
        //把所有巧克力豆按照最大长度来切割,最后得到的巧克力总数大于等于小明的朋友数,就返回
        Scanner sc = new Scanner(System.in);
        int []h = new int[100000];
        int []w = new int[100000];
        int N = sc.nextInt(); //N块巧克力
        int K = sc.nextInt(); //K位小朋友
        int height;
        int width;
        int res =0;
        for (int i = 0; i < N; ++i) {
            //输入多少组数据
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        //长和宽最大是100000
        //二分查找左右边界
        int r =100001;
        int l = 1;
        while(l<=r){ //当右边界大于等于左边界时
            int mid = (l+r)/2;  //必然小于等于,判断切割成这样宽度是否可以
            int cnt =0;
            for (int i = 0; i < N; i++) {
                cnt += (h[i]/mid)*(w[i]/mid);
            }
            //块数大于小朋友数,够分
            if(cnt>=K){
                l=mid+1;
                res = mid;//当前分的巧克力块数,还需要再除更大的数,得到尽可能小的块数,也就是尽可能大的巧克力
            }else {
//                块数不够,少除
                r =mid-1;
            }
        }
        System.out.println(res);
    }
}
