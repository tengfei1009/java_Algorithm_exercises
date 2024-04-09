package 力扣链表.简单;

public class 移除链表元素6 {
    public ListNode removeElements(ListNode head, int val) {
        if(head ==null){
            return head;
        }
        ListNode dummy = new ListNode(-1,head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur!=null){
            if(cur.val ==val){
                pre.next = cur.next;
            }else {
                pre =cur; //以便判段下一个指向,若是对应值,就让pre当前的next值指向cur.next(下一个指向下一个的指针,也就是跳过中间了)
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
