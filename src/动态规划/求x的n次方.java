package 动态规划;

public class 求x的n次方 {
    public int function2(int x, int n) {
        if(n==0){
            return 1;
        }
        return function2(x,n-1)*x;
    }
}
