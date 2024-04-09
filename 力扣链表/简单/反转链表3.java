package 力扣链表.简单;

public class 反转链表3 {
    public ListNode reverseList(ListNode head) {
        //存储新链表的最后一个的指向,最后一个指向默认为null
        ListNode prev = null;
        //不断移动cur的位置,判断cur的下一个是否为空,如果为空就是新链表的最后一个,则不移动
        ListNode cur = head;
        //存储当前原链表的结点下一个结点
        ListNode temp = null;
        //移动cur的位置
        while (cur!= null){
            temp = cur.next;
            cur.next = prev;  //将当前cur指向前一个cur
            prev = cur;  //对前一个cur重新赋值为当前cur
            //当next不为空,下一次就把next添加到链表中  cur.next = prev;  prev = cur;
            cur= temp;  //判断下一个cur是否合适,合适就参与下一次
        }
        return prev;
    }
}
