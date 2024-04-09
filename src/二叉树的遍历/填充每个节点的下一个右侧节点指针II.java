package 二叉树的遍历;

import java.util.LinkedList;
import java.util.Queue;

public class 填充每个节点的下一个右侧节点指针II {
    public Node connect(Node root) {
        Queue<Node> qu = new LinkedList();
        if(root==null) return root;
        qu.offer(root);
        while (!qu.isEmpty()){
            int len =qu.size();
            while (len>0){
                len--;
                Node node = qu.poll();
                if(len>0){
                    node.next =qu.peek();
                }else {
                    node.next=null;
                }
                if(node.left!=null) qu.offer(node.left);
                if(node.right!=null) qu.offer(node.right);
            }
        }
        return root;
    }
}
