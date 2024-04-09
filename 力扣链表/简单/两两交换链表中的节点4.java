package 力扣链表.简单;

public class 两两交换链表中的节点4 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next =head.next;
        ListNode three = swapPairs(next.next);

        next.next = head;
        head.next = three;

        return next;
    }
}
