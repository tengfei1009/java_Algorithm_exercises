package 蓝桥杯;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 双向排序_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 操作次数
        Integer[] arr = new Integer[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if (check == 0) {
                // 降序排序
                Arrays.sort(arr, 1, end + 1, comparator);
            } else {
                Arrays.sort(arr, end, arr.length);
            }
        }
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}