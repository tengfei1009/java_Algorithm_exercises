package 暴力枚举;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class 选数2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Set <Integer> zong = new HashSet<>();
        //一共有多少个数
        int n = sc.nextInt();
        int []arr =new int[n];
        int count =0;
        //一共划分多少次
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        for (int i = 0; i < arr.length - k + 1; i++) { // 修改循环条件
            for (int j = i + 1; j < i + k; j++) { // 修改循环条件
                int sum = arr[i] + arr[j];
                if (is(sum)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean is(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
