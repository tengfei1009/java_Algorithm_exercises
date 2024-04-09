package 力扣链表.简单;

public class 链表相交_神 {
    public static void main(String[] args) {
        // 创建链表节点
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(0);
        ListNode node8 = new ListNode(1);

        // 构建链表A：4 -> 1 -> 8 -> 4 -> 5
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // 构建链表B：5 -> 0 -> 1 -> 8 -> 4 -> 5
        node6.next = node7;
        node7.next = node8;
        node8.next = node3;

        // 调用getIntersectionNode方法获取交点
        ListNode intersection = getIntersectionNode(node1, node6);

        // 打印交点的值
        if (intersection != null) {
            System.out.println("两个链表的交点是: " + intersection.val);
        } else {
            System.out.println("两个链表没有交点");
        }
    }
    // 构建链表A：4 -> 1 -> 8 -> 4 -> 5
    // 构建链表B：5 -> 0 -> 1 -> 8 -> 4 -> 5
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;  // 创建指针 h1，指向链表 headA 的头节点
        ListNode h2 = headB;  // 创建指针 h2，指向链表 headB 的头节点

        while (h1 != h2) {  // 当 h1 和 h2 不相等时，执行以下循环
            h1 = h1 == null ? headB : h1.next;  // 如果 h1 为空，则将 h1 指向链表 headB 的头节点，否则将 h1 指向 h1 的下一个节点
            h2 = h2 == null ? headA : h2.next;  // 如果 h2 为空，则将 h2 指向链表 headA 的头节点，否则将 h2 指向 h2 的下一个节点
        }

        return h1;  // 返回 h1，即链表 headA 和 headB 的交点（如果存在），否则返回 null
    }

    // 定义链表节点类
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
