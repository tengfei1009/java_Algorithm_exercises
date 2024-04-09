package 力扣链表.简单;

public class 移除链表元素 {
    //链表的头节点实际上是一个地址，可以代表一个数组的第一个值，或者代表一个数组。
    public ListNode removeElements(ListNode head, int val) {
        //头节点指向为空
        if(head ==null) {
            return head;
        }
        //定义一个虚拟头节点,值为-1 (因为题目中给定的val的值在0~50之间)  指向下一个结点的地址
        ListNode dummy = new ListNode(-1,head);
        ListNode pre = dummy; //获取到dummy,不断赋值给pre 不断获取下一个
        ListNode cur = head;//存储dummy指向的下一个(也就是 ListNode head)
        while (cur!= null){
            if(cur.val ==val){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            //获取到下一个地址
            cur = cur.next;
        }
        //改变的只是虚拟头结点的指向
        return  dummy.next;
    }
}
