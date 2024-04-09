package 二叉树的遍历;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 二叉树的统一迭代遍历 {
}
class 迭代前序{
    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); //将该节点弹出,避免重复操作.下面再将右中左节点添加到栈中
                if (node.right != null) st.push(node.right); //添加右节点(空节点不入栈)
                if (node.left != null) st.push(node.left); //添加左节点 (空栈不入栈)
                st.push(node); //添加中节点
                st.push(null);  //中节点访问过,但是还没右处理,假如空节点作为标记
            }else {
                st.pop(); //将空节点弹出
                node =st.peek();  //重新取出栈中元素
                st.pop();
                result.add(node.val); //加入到结果集
            }
        }
        return result;
    }
}
