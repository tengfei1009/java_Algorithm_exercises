package 二叉树的遍历;

import java.util.*;

public class 二叉树的右视图 {
    //只获取到二叉树的右节点
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> qu = new LinkedList();
        qu.offer(root);
        while (!qu.isEmpty()){
            int len = qu.size();
            res.add(qu.peekLast().val);
            while (len>0){
                TreeNode node =qu.poll();
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null)qu.offer(node.right);
                len--;
            }
        }
        return res;
    }
}