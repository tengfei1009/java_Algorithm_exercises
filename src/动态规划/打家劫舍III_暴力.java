package 动态规划;

import 二叉树的遍历.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class 打家劫舍III_暴力 {
    //    后序遍历：根节点的偷和不偷的值要依赖于左、右子树的返回值，所根节点要放在最后就成了后序。
    /**
     * 超时
     */
//    public int rob(TreeNode root) {
//        if (root == null) return 0;
//        int money = root.val;
//        if (root.left != null) {
//            money += rob(root.left.left) + rob(root.left.right);
//        }
//        if (root.right != null) {
//            money += rob(root.right.left) + rob(root.right.right);
//        }
//        return Math.max(money, rob(root.left) + rob(root.right));
//    }

    //递归去偷,记录状态
    public int rob1(TreeNode root){
        // 创建一个存储节点和对应最大金额的缓存Map
        Map<TreeNode,Integer> memo = new HashMap<>();
        // 调用辅助方法进行打家劫舍，并返回结果
        return robAction(root, memo);
    }

    int robAction(TreeNode root, Map<TreeNode,Integer> memo){
        // 如果当前节点为空，表示没有可偷窃的房屋，返回金额0
        if(root == null) {
            return 0;
        }
        // 如果当前节点已经在缓存中有对应的最大金额，直接返回缓存中的值
        if(memo.containsKey(root)) {
            return memo.get(root);
        }

        int money = root.val; // 当前节点的金额
        // 对左子节点进行偷窃，加上左子节点的左右子节点的偷窃金额
        if(root.left != null){
            money += robAction(root.left.left, memo) + robAction(root.left.right, memo);
        }
        // 对右子节点进行偷窃，加上右子节点的左右子节点的偷窃金额
        if(root.right != null){
            money += robAction(root.right.left, memo) + robAction(root.right.right, memo);
        }

        // 计算当前节点偷窃和不偷窃的情况下的最大金额
        int res = Math.max(money, robAction(root.left, memo) + robAction(root.right, memo));

        // 将当前节点和对应的最大金额存入缓存中
        memo.put(root, res);

        // 返回最大金额
        return res;
    }
}
