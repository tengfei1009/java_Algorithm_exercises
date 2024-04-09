package Scanner;

public class BBB {
    public static void main(String[] args) {
        for (int i = 100; i <1000; i++) {
            int ge =i%10;
            int j=i/10;
            int shi = j%10;
            int bai = j/10;
            int temp = ge*ge*ge + shi*shi*shi + bai*bai*bai;
            if (temp==i){
                System.out.println(i);

            }
        }
    }
}
