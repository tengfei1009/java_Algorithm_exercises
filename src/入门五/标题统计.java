package 入门五;
import java.util.Scanner;
public class 标题统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            if (c != ' ' && c != '\n') {
                count++;
            }
        }
        System.out.println(count);
    }
}
