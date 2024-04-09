package 二叉树的遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root ==null) return res;
        Queue<TreeNode> qu = new LinkedList();
        qu.offer(root);
        while (!qu.isEmpty()){
            int len = qu.size();
            int  mid =len;
            Double sum = 0.0;
            while (len>0){
                TreeNode node = qu.poll();
                sum+= node.val;
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null) qu.offer(node.right);
                len--;
            }
            res.add(sum/mid);
        }
        return res;
    }
}
