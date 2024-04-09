package 蓝桥杯;

import java.math.BigInteger;

public class Demo2 {
    public static BigInteger zero = new BigInteger("0");
    public static BigInteger ten = new BigInteger("10");
    public static BigInteger one = new BigInteger("1");
    long result = 0;

    public static void main(String[] args) {
        BigInteger target = new BigInteger("100000000000000000");
//        BigInteger target = new BigInteger("128");
        BigInteger z = new BigInteger("0");

        long result = 0;


        for (; z.compareTo(target) <= 0; z = z.add(one)) {

            BigInteger demo = z;

            long temp = 0;
            // 计算位数之和
            while (demo.compareTo(zero) > 0) {
                temp += Integer.parseInt(demo.mod(ten).toString());

                demo = demo.divide(ten);
            }

            if (judgePrime(temp)) {
                result++;
                System.out.println(z);
            }
        }


        System.out.println(result);
    }


    public static boolean judgePrime(long l) {
        if (l <= 1) return false;

        for (int i = 2; i < l; i++) {
            if (l % i == 0) return false;
        }
        return true;
    }

}