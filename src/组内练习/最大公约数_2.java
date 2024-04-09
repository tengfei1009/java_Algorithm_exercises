package 组内练习;

public class 最大公约数_2 {
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,b%a);
    }
}
