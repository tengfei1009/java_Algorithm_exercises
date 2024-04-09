package 力扣链表.简单;

public class 反转链表4 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur!=null){
            //判断后一个
            temp = cur.next;
            cur.next =prev;//后一个指向前一个,前一个等于后一个,后一个的后一个等于temp,判断后一个的后一个是否合法,最后无论合不合法后一个都加入了prev
            prev = cur;
            cur= temp;
        }
        return prev;
    }
}
