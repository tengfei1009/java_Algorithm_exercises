package 二叉树的遍历;

import java.util.LinkedList;
import java.util.Queue;

public class 填充每个节点的下一个右侧节点指针 {
    //给定一个完美二叉树，所有叶子节点都在同一层，每个父节点都有两个子节点
    public Node connect(Node root) {
        Queue<Node> tmpQueue = new LinkedList<>();
        if(root!=null) tmpQueue.add(root);

        while (tmpQueue.size()!=0){
            int size = tmpQueue.size();
            Node cur = tmpQueue.poll();
            if(cur.left!=null) tmpQueue.add(cur.left);
            if(cur.right!=null) tmpQueue.add(cur.right);

            for (int i = 1; i < size; i++) {
                Node next = tmpQueue.poll();
                if(next.left!=null) tmpQueue.add(next.left);
                if(next.right!=null) tmpQueue.add(next.right);
                cur.next =next;
                cur=next;
            }
        }
        return root;
    }
}
