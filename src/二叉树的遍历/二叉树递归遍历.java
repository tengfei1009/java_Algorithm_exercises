package 二叉树的遍历;

import java.util.ArrayList;
import java.util.List;
public class 二叉树递归遍历{
    public static void main(String[] args) {
        // 初始化根节点和子节点
        TreeNode root = new TreeNode(1);
        TreeNode node2 = null;
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);

        // 连接节点
        root.left = node2;
        root.right = node3;
        node3.left = node4;

        // 执行前序遍历
        前序遍历 solution = new 前序遍历();
        List<Integer> result = solution.preorderTraversal(root);
        // 输出结果
        System.out.println(result);
    }
}

class 前序遍历 {
    //传入一个根节点
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    /**
     * 前序遍历
     */
//    由于递归调用是在处理当前节点的左子树和右子树之前进行的，因此在添加左子树和右子树节点值之前，需要确保它们不为空。
    /**在前序遍历中，节点的访问顺序是根节点 -> 左子树 -> 右子树。
     * 递归调用 preorder 方法可以确保在处理完当前节点后，能够继续遍历其左子树和右子树。*/
    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorder(root.left, result); //这个不能保证左右节点都不为空,所以递归调用,先判断是否为空
        preorder(root.right, result);
    }
}
class 中序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        preorder(root.left, result);
        result.add(root.val);
        preorder(root.right, result);
    }
}

class 后序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        preorder(root.right, result);
        preorder(root.left, result);
        result.add(root.val);
    }
}

