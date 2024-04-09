package 二叉树的遍历;

import java.util.*;

public class 二叉树的层序遍历II {
    //集合翻转
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //节点为空，没有创建对象
        if(root == null) return res;
        Queue<TreeNode> qu = new LinkedList();
        qu.offer(root);
        while (!qu.isEmpty()){
            int len = qu.size();
            List<Integer> cur = new ArrayList<>();
            while (len>0){
                TreeNode node = qu.poll();
                cur.add(node.val);
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null)qu.offer(node.right);
                len--;
            }
            res.add(cur);
        }
        Collections.reverse(res);
        return res;
    }
}