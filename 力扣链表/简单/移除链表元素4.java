package 力扣链表.简单;

public class 移除链表元素4 {
    public ListNode removeElements(ListNode head, int val) {
        if(head ==null){
            return head;
        }
        //一个值,一个指向下一个地址值
//        创建虚拟头节点
        ListNode dummy = new ListNode(-1,head);
        ListNode pre = dummy;  //使用pre来不断改变next 的指向,简直是太妙了
        ListNode cur = head;
        while (cur!=null){
            if(cur.val == val){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
