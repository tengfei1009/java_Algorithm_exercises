package 自由练习;

public class sss {
    public static void main(String[] args) {
        System.out.println(gcd(12, 3));
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}