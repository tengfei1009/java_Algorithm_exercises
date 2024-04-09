package 组内练习;

import java.io.*;
//import java.util.Scanner;

public class 查找 {
    public static void main(String[] args) throws Exception {
//        Scanner sc =new Scanner(System.in);
        Read sc = new Read();
        int n = sc.nextInt();//数字个数
        int m = sc.nextInt(); //询问次数

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int l = 0;
            int r = n-1;
            //输入查询
            int search = sc.nextInt();
            while (l < r) {
                int mid = (l + (r - l) / 2);
                if (arr[mid] >= search) r = mid;
                else l = mid + 1;
            }
            if (arr[l] != search) {
                System.out.print(-1+" ");
            } else {
                System.out.print(r+1+" ");
            }
        }
    }
}
//快读
class Read {
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public int nextInt() throws Exception {
        st.nextToken();
        return (int) st.nval;
    }
}
//class Read {
//    public BufferedReader reader;
//    public StringTokenizer tokenizer;
//
//    public Read(InputStream stream) {
//        reader = new BufferedReader(new InputStreamReader(stream), 32768);
//        tokenizer = null;
//    }
//
//    public String next() {
//        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
//            try {
//                tokenizer = new StringTokenizer(reader.readLine());
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return tokenizer.nextToken();
//    }
//
//    public String nextLine() {
//        String str = null;
//        try {
//            str = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return str;
//    }
//
//    public int nextInt() {
//        return Integer.parseInt(next());
//    }
//
//    public long nextLong() {
//        return Long.parseLong(next());
//    }
//
//    public Double nextDouble() {
//        return Double.parseDouble(next());
//    }
//
//    public BigInteger nextBigInteger() {
//        return new BigInteger(next());
//    }
//}

