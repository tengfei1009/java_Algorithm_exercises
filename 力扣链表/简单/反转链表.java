package 力扣链表.简单;

public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        //定义一个前驱
        ListNode prev = null;
        //存储头结点
        ListNode cur = head;
        //中间变量存储
        ListNode temp = null;
        while (cur!= null){
            //存储后一个值
            temp = cur.next;
            //存储当前值
            prev =cur;
            //使得后一个值指向前一个值
            cur.next = prev;
            //将后一个值赋值给当前值,使得当前值为后一个值,而这个后一个值,指向的下一个值为当前值,因为后一个值 cur.next 指向pre.而pre赋值为cur
            //实现链表反转 ,而现在cur = temp = cur.next 等于了下一个值,然后判断下一个值是否为null,如果为null,就不翻转,最后指向null
            cur = temp;
        }
        //因为每次循环,cur = cur.next pre也重新赋值为下一个,因为翻转,所以最后pre移动到最后一个,也就是翻转以后第一个的位置
        return prev;
    }
}
