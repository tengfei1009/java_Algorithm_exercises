package 卡码网;

import java.util.Scanner;

//并查集
public class 共同祖先 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[30];
            //用一个数组记录他爹
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a] = b;
            }
            //记录辈分
            int deep1 = 0;
            int deep2 = 0;
            //记录当前要查询的父类
            int f1 = 1;
            int f2 = 2;
            while (arr[f1] != 0) {
                deep1++;
                //更新父的父节点
                f1 = arr[f1];
            }
            while (arr[f2] != 0) {
                deep2++;
                //向上找1的祖先,然后1祖先的祖先
                f2 = arr[f2];
            }
            if (deep1 == deep2) {
                System.out.println("You are my brother");
            } else if (deep1 > deep2) {
                System.out.println("You are my elder");
            } else {
                System.out.println("You are my younger");
            }
        }
    }
}
