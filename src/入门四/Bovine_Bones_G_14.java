package 入门四;

import java.util.Scanner;

public class Bovine_Bones_G_14 {
    public static void main(String[] args) {

//

//      桶排序
        int [] flag =new int [105];
        //三个骰子
        Scanner sc =new Scanner(System.in);
        int s1= sc.nextInt();
        int s2= sc.nextInt();
        int s3= sc.nextInt();
        //暴力枚举
        //遍历每个骰子,获取到任意三个面数字之和,感觉不需要去重
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    //遍历到有多少个相同的数字到同一个桶中
                    flag[i+j+k]++;
                }
            }
        }

        int sum=0;
        //设ans为最大值
        int ans =0;
        //定义一个中间变量
        int tmp=0;
        for(int i=1;i<=s1+s2+s3;i++)//这里通过排列组合可得知，最大的和就是a+b+c
        {
            //获取到每个桶中出现标签的数量
//            sum=flag[i];
            //sum和之前比较出来的最大值ans来比较
            if(flag[i]>ans)
            {
                ans=flag[i];//把ans替换成更大的sum
                tmp=i;//使用标记标记出这个时候的桶最多的和是哪个数字
            }
        }
        //最后巧妙在只判断了后续的比前面大的情况,如果说后面和前面一样大,则不会进入if判断语句中去
        //简直妙啊!
        System.out.println(tmp);
    }
}
