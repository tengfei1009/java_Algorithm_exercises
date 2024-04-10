package 动态规划;

import 二叉树的遍历.TreeNode;

public class 打家劫舍III_2 {
    public int rob(TreeNode root) {
       int []result= robAction(root);
        return Math.max(result[0],result[1]);
    }
    public int []robAction(TreeNode root){
        int[] res =new int[2];
        if(root==null) return res;
        int[]left = robAction(root.left);
        int []right =robAction(root.right);
        res[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1] = root.val +left[0]+right[0];
        return res;
    }
}
