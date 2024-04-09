package 力扣链表.简单;

public class 反转链表2 {
    public ListNode reverseList(ListNode head) {
        //指针,存储当前结点
        ListNode pre = null;
        //存储头结点
        ListNode cur = head;
        //存储当前结点的下一个结点
        ListNode temp = null;
        while (cur!=null){
            //保存下一结点
            temp = cur.next;
            //当前节点的下一个结点,指向当前结点(我指向我自己,我自己的值是不断变化的,相当于我一直是我自己,我是第一个节点,我一直不变,不动位置,我cur的next指向我的前一个值)
            //向外不断生成,当前结点的下一个节点是前一个节点,而头结点的前一个节点为null(因为默认头结点的前一个节点为null上面赋值了)
            cur.next = pre;
            //存储当前结点,方便下次发送,妙啊!!!
            pre = cur;
            //下一结点指向当前结点
            cur= temp;


        }
        return pre;
    }
}
