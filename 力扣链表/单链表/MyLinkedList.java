package 力扣链表.单链表;
//初始化链表
class MyLinkedList {
    //size存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode head;

    //初始化链表
    public MyLinkedList() {
        size = 0;
        //初始化头节点
        head = new ListNode(0);
    }

    //链表.get();
    //获取链表中下标为index的节点的值
    public int get(int index) {
        //先判断非法
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    //将一个值为val的节点插入到链表的第一个元素之前,在插入完成后,新节点会成为链表的第一个节点
    public void addAtHead(int val) {
        //在链表最前面插入一个节点，等价于在第0个元素前添加
        addAtIndex(0, val);
    }

    //将一个值为val的节点追加到链表中作为链表的最后一个元素
    public void addAtTail(int val) {
        //在链表的最后插入一个节点，等价于在(末尾+1)个元素前添加
        addAtIndex(size, val);
    }

    //将一个值为val的节点插入到链表中下标为index的节点之前.如果index等于链表长度,该节点就会被追加到链表的末尾
    //如果index比长度更大,就不会插入到链表中
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        //插入下标为负数之前,也就就是插到最前面,0的前面
        if (index < 0) {
            index = 0;
        }
        size++;
        //获取到虚拟头结点
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    //如果下标有效,就删除链表中下标为index的节点
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        //如果等于第一个就直接去掉第一个
        if (index == 0) {
            head = head.next;
        }
        size--;
        ListNode pre = head;
        for(int i = 0 ;i<index;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }
}
