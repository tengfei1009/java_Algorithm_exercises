package 二叉树的遍历;

import java.util.*;

public class 层序遍历_广度优先搜索 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        //使用队列来模拟
        Queue<TreeNode> qu = new LinkedList();
        qu.offer(root);
        //当队列中没有元素了，说明这个层序遍历中就没有元素添加到队列，也就是终止了
        while (!qu.isEmpty()) {
            //记录当前层节点的个数，控制队列里面弹出的节点数量
            int len = qu.size();
            //将每一层的数放入一维数组中保存
            ArrayList<Integer> cur = new ArrayList();
            while (len > 0) {
                TreeNode node = qu.poll();
                cur.add(node.val);
                if(node.left!=null) qu.offer(node.left);
                if(node.right!= null)qu.offer(node.right);
                len--;
            }
            res.add(cur);
        }
        return res;
    }
}