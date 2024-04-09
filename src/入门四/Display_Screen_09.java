package 入门四;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Display_Screen_09 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub   自动生成的方法存根
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw;
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        char[] arr = num.toCharArray();


        //输入一到九
        String[] arr0 = {"XXX", "X.X", "X.X", "X.X", "XXX"};
        String[] arr1 = {"..X", "..X", "..X", "..X", "..X"};
        String[] arr2 = {"XXX", "..X", "XXX", "X..", "XXX"};
        String[] arr3 = {"XXX", "..X", "XXX", "..X", "XXX"};
        String[] arr4 = {"X.X", "X.X", "XXX", "..X", "..X"};
        String[] arr5 = {"XXX", "X..", "XXX", "..X", "XXX"};
        String[] arr6 = {"XXX", "X..", "XXX", "X.X", "XXX"};
        String[] arr7 = {"XXX", "..X", "..X", "..X", "..X"};
        String[] arr8 = {"XXX", "X.X", "XXX", "X.X", "XXX"};
        String[] arr9 = {"XXX", "X.X", "XXX", "..X", "XXX"};

        //总共5行,一行一行的打印
        for(int i = 0; i < 5; i++) {
            //从第一个开始,打印每个数的第一行
            for(int j = 0; j < n; j++) {
                //获取到当前数字
                int k = arr[j] - '0';
//                选择当前数字在第i+1行中第i+1个位置,选择完一个就回到   int k = arr[j] - '0';
                switch(k){
                    case 0:
                        pw.print(arr0[i]);
                        break;
                    case 1:
                        pw.print(arr1[i]);
                        break;
                    case 2:
                        pw.print(arr2[i]);
                        break;
                    case 3:
                        pw.print(arr3[i]);
                        break;
                    case 4:
                        pw.print(arr4[i]);
                        break;
                    case 5:
                        pw.print(arr5[i]);
                        break;
                    case 6:
                        pw.print(arr6[i]);
                        break;
                    case 7:
                        pw.print(arr7[i]);
                        break;
                    case 8:
                        pw.print(arr8[i]);
                        break;
                    case 9:
                        pw.print(arr9[i]);
                        break;
                }
                //判断是否为最后一个数,如果不是最后一个数,在每个数的中间都需要打 .
                if(j != n-1)
                    pw.print('.');
            }
            pw.println();
        }
        pw.flush();
    }
}