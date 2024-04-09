package 力扣链表.简单;

public class 移除链表元素2 {
    public ListNode removeElements(ListNode head, int val) {

        //头节点指向的地址为空
        if(head ==null){
            return head;
        }
        //创建一个虚拟头节点
        ListNode dummy = new ListNode(-1,head);
        ListNode pre = dummy; //用这个二把手来修改虚拟头节点指向的下一个地址
        ListNode cur = head; //用这个cur存储当前结点的值,与目标值进行比较
        while(cur != null){
            if(cur.val==val) {
                pre.next = cur.next;
            }else {
            pre =cur;//这样以便判断下一个pre的next的值和下一个cur的next的值
            }
            cur =cur.next;
        }
        return dummy.next;
    }
}
