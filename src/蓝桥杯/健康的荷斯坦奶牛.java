package 蓝桥杯;

import java.util.*;

public class 健康的荷斯坦奶牛 {
    static int[] min;
    static List<Integer> result = new ArrayList<>();//存放袋数最小的结果集
    static Map<Integer, List> map = new TreeMap<>();//给键自动排序

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); //维他命的种类数
        min = new int[v + 1];
        //每种维他命最小的需求量
        for (int i = 1; i < min.length; i++) {
            min[i] = sc.nextInt();
        }
        //用来喂牛的饲料种数
        int g = sc.nextInt();
        //每种饲料包含的维他命的量是多少
        int[][] arr = new int[g + 1][v + 1];
        for (int i = 1; i <= g; i++) {
            for (int j = 1; j <= v; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        for (int i = 1; i <= g; i++) {
//            for (int j = 1; j <= v; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int[] sum = new int[v + 1];
        dfs(arr, sum, 1, g, v, 0);
        Integer firstKey = map.keySet().iterator().next();
        List<Integer> firstValue = map.get(firstKey);
        System.out.print(firstKey+" ");
        for (int i = 0; i < firstValue.size(); i++) {
            System.out.print(firstValue.get(i)+" ");
        }
//        System.out.println(map);
    }

    //搜出所有满足条件的种数
    private static void dfs(int[][] arr, int[] sum, int step, int g, int v, int count) {
        boolean a = true;
        for (int i = 1; i <= v; i++) {
            //当前袋数有小于最小值的,不满足,跳出循环
            if (sum[i] < min[i]) {
//                System.out.println(sum[i]+" "+min[i]+"HHHHH"+i);
                a = false;
                break;
            }
        }
        //如果说满足条件了
        if (a) {
            //所有的都大了,就记录当前饲料的袋数
//            System.out.println(count);
            //只记录第一次找到的键值对
            if (map.get(count) == null) {
                List array = new ArrayList(result);
                map.put(count, array);
            }
            return;
        }
        for (int j = step; j <= g; j++) {
            for (int i = 1; i <= v; i++) { //维他命的需求量
                sum[i] += arr[j][i];
//                System.out.println(sum[i]);
            }
            result.add(j);
            count++;
            dfs(arr, sum, j + 1, g, v, count);
            result.remove(result.size() - 1);
            count--;
            for (int i = 1; i <= v; i++) { //维他命的需求量
                sum[i] -= arr[j][i];
//                System.out.println(sum[i]);
            }
        }
    }
}