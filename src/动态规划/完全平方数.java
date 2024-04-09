package 动态规划;

import java.util.ArrayList;

public class 完全平方数 {
    static ArrayList<Integer> array = new ArrayList();


    static ArrayList<ArrayList> res =new ArrayList();
    static ArrayList<Integer> current  =new ArrayList();
    public static void main(String[] args) {
        numSquares(12);
    }
    public static  void numSquares(int n) {
        is(n);
        dfs(array.size(),n,0);
        for (int i = 0; i < res.get(0).size(); i++) {
            System.out.println(res.get(0).get(i));
        }

    }
    private static void is(int n) {
        for (int i = 1; i < n; i++) {
            int mid =(int) Math.pow(i,0.5);
            if(mid*mid == i){
                array.add(i);
            }
        }
    }

    private static void dfs(int n,int sum,int count){
        if(res.isEmpty()&& count == sum){
            res.add(new ArrayList(current));
            return;
        }
        for (int i = 0; i < n; i++) {
            int mid = array.get(i);
            current.add(mid);
            count+=mid;
            dfs(n,sum,count);
            count-=mid;
            current.remove(current.size()-1);
        }
    }
}
