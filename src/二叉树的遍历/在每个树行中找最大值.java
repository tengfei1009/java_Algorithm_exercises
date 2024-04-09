package 二叉树的遍历;

import java.util.*;

public class 在每个树行中找最大值 {
    public List<Integer> largestValues(TreeNode root) {
//        该方法返回一个空的、不可变的 List
//        使用 Collections.emptyList() 可以避免创建新的空列表对象，
//        提高性能并减少内存开销。返回一个空的List（使用前提是不会再对返回的list进行增加和删除操作）
        if (root == null) return Collections.emptyList();
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while (!qu.isEmpty()) {
            int max =Integer.MIN_VALUE;
            int len = qu.size();
            for (int i = 0; i <len; i++) {
                TreeNode node = qu.poll();
                max = Math.max(node.val, max);
                if (node.left != null) qu.offer(node.left);
                if (node.right != null) qu.offer(node.right);
            }
            res.add(max);
        }
        return res;
    }
}
