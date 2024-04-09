package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 组合_剪枝 {
    public static void main(String[] args) {
        combine(1,1);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(k<=0 ||n<k){
            return res;
        }
        backTracking(n,k,1,res,path);
        return res;
    }
    //递归函数参数返回值
    //确定终止条件
    //单层递归逻辑
    public static void  backTracking( int n, int k,int startIndex,List<List<Integer>> res,List<Integer> path){
        if(path.size() == k){
            res.add(new ArrayList<>(path)); // 创建新的列表，并将当前组合添加到 res 中
            return;
        }
        //假设有4个数,已经选了三个了,还剩一个需要选,最多starIndex从2开始选,因为再往后就不够了
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backTracking(n,k,i+1,res,path);
            path.remove(path.size()-1);
        }
    }
}
