package 卡码网;

import java.util.Scanner;

public class A加B问题IV {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum =0;
            if(n ==0){
                break;
            }
            for (int i = 0; i < n; i++) {
                sum+=sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
