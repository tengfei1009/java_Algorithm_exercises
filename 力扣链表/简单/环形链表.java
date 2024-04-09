package 力扣链表.简单;

public class 环形链表 {
    //快指针相对于慢指针,多移动一个,相当于,快指针追赶慢指针,快指针每次向前1,慢指针不动,快指针一定会追上慢指针
    public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast !=null && fast.next != null){
                slow = slow.next;
                fast= fast.next.next;
                if(slow == fast){//有环
                    ListNode index1 = fast;
                    ListNode index2 = head;
                    while (index1 != index2){
                        index1 = index1.next;
                        index2 = index2.next;
                    }
                    return index1;
                }
            }
            return null;
    }
}
