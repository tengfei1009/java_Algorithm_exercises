import java.util.ArrayList;
import java.util.Scanner;

public class 滑动窗口3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //双指针
        int mid = 0;
        int max = -1;
        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        ArrayList aa = new ArrayList();
        ArrayList bb = new ArrayList();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (mid <= n - k) {
            for (int i = mid; i < mid + k; i++) {
                max = arr[i] > max ? arr[i] : max;
                min = arr[i] < min ? arr[i] : min;
            }
            aa.add(max);
            bb.add(min);
            mid++;
            max = -1;
            min = Integer.MAX_VALUE;
        }

        for (int i = 0; i < bb.size(); i++) {
            System.out.print(bb.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < aa.size(); i++) {
            System.out.print(aa.get(i) + " ");
        }

    }
}
