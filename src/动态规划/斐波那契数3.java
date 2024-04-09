package 动态规划;

public class 斐波那契数3 {
    public int fib(int n) {
//        if(n<2){
//            return n;
//        }
//        int a = 0,b=1,c =0;
//        for (int i = 0; i < n; i++) {
//            c =a +b;
//            a=b;
//            b= c;
//        }
//        return c;

        if(n<=1)return n;
        int []dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int index = 2; index <= n; index++) {
            //利用数组赋值
            dp[index] = dp[index-1]+dp[index-2];
        }
        return dp[n];
    }
}
