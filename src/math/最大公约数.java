package math;

public class 最大公约数 {
    public int gcd (int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
