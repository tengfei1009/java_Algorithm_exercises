package 力扣链表.简单;

public class 移除链表元素5 {
    //不添加虚拟头结点的方法
    public ListNode removeElements(ListNode head, int val) {
        while (head!= null&& head.val == val) {
            head = head.next;
        }
        ListNode cur = head;
        while (cur!= null){
            while (cur.next!=null && cur.next.val ==val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
