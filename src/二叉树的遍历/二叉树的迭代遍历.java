package 二叉树的遍历;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 二叉树的迭代遍历 {

}

class 前序 {
    /**
     * 用栈来模拟
     */
    /**集合中的排序：中-左-右*/
    /**
     * 栈中的顺序(因为栈是先进先出后进后出的): 中-右-左
     */
    //    前序遍历顺序:中-右-左(栈中顺序)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }
}

class 中序 {
    //    左-中-右(栈中顺序)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        //记录当前遍历到的节点
        TreeNode cur = root;
        //当前节点不为空,或者栈不为空,就可以一直遍历
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}

class 后序 {
//    左-右-中(栈中顺序)
    /**爆改前序遍历来遍历*/
    /**
     * 调换前序遍历的两个位置： 数组排序：中-右-左(栈的顺序：中-左-右)  ————> 翻转数组以后：左-右-中
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}