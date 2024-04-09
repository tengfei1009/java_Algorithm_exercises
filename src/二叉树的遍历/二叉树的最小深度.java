package 二叉树的遍历;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的最小深度 {
    //    最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
    public int minDepth(TreeNode root) {
        if(root ==null) return 0;
        Queue <TreeNode>qu = new LinkedList();
        int min=0;
        qu.offer(root);
        ss:while (!qu.isEmpty()){
            int len = qu.size();
            min++;
            for (int i = 0; i < len; i++) {
                TreeNode node= qu.poll();
                if(node.left==null&&node.right==null){
                    break ss;
                }else {
                    if(node.left!=null)qu.offer(node.left);
                    if(node.right!=null)qu.offer(node.right);
                }
            }
        }
        return min;
    }
}
