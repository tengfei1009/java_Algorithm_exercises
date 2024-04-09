package Scanner;

public class ddd {
    public static void main(String [] args) {
        int i, ge, shi, bai;
        for (i = 100; i < 1000; i++) {
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100%10;
            if ((bai * bai * bai + shi * shi * shi + ge * ge * ge) == i) {
                System.out.println(i);
            }
        }
    }
}