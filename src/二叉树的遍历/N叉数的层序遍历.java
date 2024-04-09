package 二叉树的遍历;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class N叉数的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Node> qu = new LinkedList<>();

        if (root == null)
            return list;
        qu.offer(root);
        while (!qu.isEmpty()){
            int levelSize = qu.size();
            List<Integer>levelList = new ArrayList<>();

            //遍历每一层的节点
            for (int i = 0; i < levelSize; i++) {
                Node poll = qu.pollFirst();
                levelList.add(poll.val);
                List<Node> children = poll.children;
                if(children==null || children.size() ==0){
                    continue;
                }
                //将每一个孩子节点加入到队列中
                for(Node child:children){
                    if(child!=null){
                        qu.offerLast(child);
                    }
                }
            }
            list.add(levelList);
        }
        return list;
    }
}
