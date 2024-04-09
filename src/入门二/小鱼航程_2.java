package 入门二;
import java.util.Scanner;

public class 小鱼航程_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int you = 0;
            for (int i = 0; i <= n; i++) {
                if ((i + x) % 7 != 0&&(i + x) % 6!=0) {
                    you = you + 250;
                }
            } //2000
        System.out.println(you); //1250
    }
}