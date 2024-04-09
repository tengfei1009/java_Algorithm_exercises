package 动态规划;

public class 斐波那契数2 {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
