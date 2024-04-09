package 入门六;

import java.util.ArrayList;
import java.util.Scanner;

public class 质数筛 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList array =new ArrayList();
        for (int i = 0; i < n; i++) {
            int d= sc.nextInt();
            if(d<2){
                continue;
            }
            if (is(d)) {
                array.add(d);
//                System.out.printf("%d ", d);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
//            System.out.printf("%d%c",n,(i== array.size()-1) ? "":" ");
        }
    }

    private static boolean is(int n) {
        boolean c = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                c = false;
                break;
            }
        }
        return c;
    }
}
