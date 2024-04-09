package 二叉树的遍历;

public class 二叉树的最大深度_2 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dep(root, 0);
    }

    //深度搜索
    public int dep(TreeNode node, int max) {
        if (node == null) return max;
        if(node.left==null&&node.right==null) return max+1;
        int a = -1;
        int b = -1;
        if (node.left != null) a = dep(node.left, max + 1);
        if (node.right != null) b = dep(node.right, max + 1);
        return Math.max(a,b);
    }
}
