package 力扣链表.简单;

public class 移除链表元素3 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1,head);
        ListNode pre =dummy;
        ListNode cur = head;
        if(head == null) { //头节点为空,返回
            return head;
        }
        while (cur != null){
            if(cur.val ==val){
                pre.next = cur.next;
            }else {
                pre= cur;
            }
                cur = cur.next;
        }
        return dummy.next;
    }
}
