package 力扣链表.简单;

public class 两两交换链表中的节点 {
    //递归
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //获取当前节点的下一个节点
        ListNode next = head.next;
        //进行递归
        ListNode newNode = swapPairs(next.next); //后面的后面,也就是第三个的后面,判断是否有,如果没有就返回next.next
        next.next =head;
        head.next = newNode; //next.next

        return next;
    }
}
