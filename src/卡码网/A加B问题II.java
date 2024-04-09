package 卡码网;

import java.util.Scanner;

public class A加B问题II {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       while(sc.hasNext()){
           int n = sc.nextInt();
           for (int i = 0; i < n; i++) {
               System.out.println(sc.nextInt()+sc.nextInt());
           }
       }
    }
}
