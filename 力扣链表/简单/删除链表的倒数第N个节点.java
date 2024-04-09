package 力扣链表.简单;

public class 删除链表的倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n){
        //定义一个虚拟头结点,快慢指针相差n,也就是后面的长度,当fast指向null时,slow恰好指向需要删除的节点的前一个节点

        //定义一个虚拟头节点
        ListNode dummyNode = new ListNode(0);
        dummyNode.next =head;

        ListNode fastIndex = dummyNode;
        ListNode slowIndex = dummyNode;
        //快慢指针相差(中间有n个)n个，所以移动n+1次
         for(int i = 0;i<=n;i++){
             fastIndex = fastIndex.next;
        }
         while(fastIndex != null){ //没有到null就一直移动，两个一起移动，带着区间，fastIndex为null的前一个就是最后一个元素
             fastIndex = fastIndex.next;
             slowIndex = slowIndex.next;
         }
         slowIndex.next = slowIndex.next.next;

         //head从头到尾都没有改变，一直改变的是dummyNode所以，返回的修改链表也应该是dummyNode.next
         return dummyNode.next;
    }
}
