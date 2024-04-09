package 二叉树的遍历;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList();
        if(root ==null) return 0;
        qu.offer(root);
        int max =0;
        while (!qu.isEmpty()){
            int len = qu.size();
            while (len>0){
                TreeNode node = qu.poll();
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null) qu.offer(node.right);
                len--;
            }
            max++;
        }
        return max;
    }
}
