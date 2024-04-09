package 力扣链表.单链表;

public class MyLinkedList_3 {
    //定义单链表
    //初始化,定义长度
    int size;
    //定义虚拟头结点
    ListNode head;

    //初始化链表
    public MyLinkedList_3 () {
        size = 0;
        head = new ListNode(0);
    }
    //获取第index个节点的数值,注意index是从0开始的,第0个节点就是头结点
    public int get(int index){
        //判断是否合法
        if(index<0 || index>=size){
            return -1;
        }
        ListNode cur = head;
        for(int i = 0 ;i<=index;i++){
            cur = cur.next;
        }
        return cur.val;
    }
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    public void addAtTail (int val){
        addAtIndex(size, val);
    }
    public void addAtIndex (int index,int val) {
        if(index >size) {
            return;
        }
        if(index < 0) {
            index=0;
        }
        size++;
        //找到插入节点的前驱
        ListNode pred = head;
        for(int i = 0; i<index;i++){
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    //删除第index个节点
    public void deleteAtIndex (int index) {
        if(index < 0 ||index>= size){
            return;
        }
        size--;
        if(index == 0){
            head = head.next;
            return;
        }
        //创建临时结点
        ListNode pred = head;
        for(int i = 0;i<index;i++){
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}