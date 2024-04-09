import java.util.Scanner;

public class 滑动窗口 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int []arr =new int[n];
        int []aa = new int [n-k+1];//最大值
        int []bb = new int [n-k+1];//最小值

        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-k+1; i++) {
            for (int j = i; j < i + k; j++) {
                //判断大小
                min = arr[j]<min ? arr[j] :min;
                max = arr[j]>max? arr[j]:max;
            }
            aa[i] =max;
            bb[i] = min;
            max = -1;
            min = Integer.MAX_VALUE;
        }
        for (int i = 0; i < bb.length; i++) {
            System.out.print(bb[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i]+" ");
        }

    }
}
