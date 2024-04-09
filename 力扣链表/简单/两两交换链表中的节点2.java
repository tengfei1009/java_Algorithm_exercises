package 力扣链表.简单;

public class 两两交换链表中的节点2 {
    public ListNode swapPairs(ListNode head) {
        //递归,最后一个指向空,前两个不断交换位置
        //判断最后的双数,和单数,也就是最后剩几个数,双数,一个数都不剩,单数剩一个数,也不交换,返回当前判断节点
        if(head == null || head.next == null){
            return head;
        }
        //假设为两个数
        ListNode next =head.next;
        //获取第三个数
        ListNode newNode = swapPairs(next.next); //null
        //交换
        next.next =head; //第二个数指向第一个数
        //第一个数指向迭代的第三个数
        head.next = newNode;
        //next 成为第一个数
        return next;
        //当然如果是总共三个数,第三个数的next为null,所以不交换,当第三个数的next不为空时,第三个数传入迭代,进入交换,就会实现,第一个和第二个交换
        //第三个和第四个交换,然后判断第五个数和是否存在第六个数
    }
}
