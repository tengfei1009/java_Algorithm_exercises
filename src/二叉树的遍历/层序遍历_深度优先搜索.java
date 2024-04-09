package 二叉树的遍历;


import java.util.ArrayList;
import java.util.List;

public class 层序遍历_深度优先搜索 {
    public List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        //起始层为0
        dfs(root,0);
        return res;
    }

    private void dfs(TreeNode node, Integer deep) {
        if (node == null) return;
        //记录多少层
        deep++;
        //当前没有记录到该层，就去记录该层
        if (res.size() < deep) {
            //当层级增加时，list的Item也增加，利用list的索引值进行层级界定
            List<Integer> item = new ArrayList<Integer>();
            res.add(item);
        }
        res.get(deep - 1).add(node.val);

        dfs(node.left, deep);
        dfs(node.right, deep);
    }
}
