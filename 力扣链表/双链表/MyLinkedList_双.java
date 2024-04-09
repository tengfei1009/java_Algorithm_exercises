package 力扣链表.双链表;

//双链表
class ListNode{
    int val;
    ListNode next,prev;
    ListNode() {};
    ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList_双 {
    //记录链表中元素的数量
    int size;
    //记录链表的虚拟头结点和尾节点
    ListNode head,tail;

    //空参构造,长度为0的链表
    public MyLinkedList_双 (){
        //初始化操作
        this.size = 0;
        this.head = new ListNode(0);
        this.tail = new ListNode(0);

        //这一步非常关键，否则在加入头结点的操作中会出现null.next的错误！！！
        head.next =tail;
        tail.prev = head;
    }
    public int get (int index){
        //判断index是否有效
        if(index < 0 || index >=size){
            return -1;
        }
        //获取临时指针,获取到的是虚拟头节点
        ListNode cur = this.head;
        //判断是哪一边遍历的时间更短
        if(index >= size / 2){
            //tail开始.tail是虚拟尾节点
            cur = tail;
            //i最大获取到
            //从最后虚拟尾节点移动几个元素到目标元素,假设是最后一个元素,就移动一次 因为索引永远比长度小1,循环执行一次
            for(int i =0;i<size-index;i++){
                //虚拟尾节点的前一个节点就是最后一个节点
                cur = cur.prev;
            }
        }else {
            for(int i = 0 ;i<=index;i++){
                cur = cur.next;
            }
        }
        return cur.val;
    }
    public void addAtHead (int val){
        //等价于在第0个元素前添加
    }
    public void addAtTail (int val){
        //等价于在最后一个元素(null)前添加,size对应的就是null,相当于在size的前面添加,那个区间

    }
    public void AddAtIndex (int index,int val) {
        //如果index = size,也就是说在最后一个指向null,在null之前添加,也就是最后一个的后面插入一个节点

        //index大于链表长度
        if(index>size){
            return;
        }
        //index小于0
        if(index<0){
            index = 0;
        }
        size++;
        //找到前驱
        ListNode pre = this.head;
        for(int i =0 ;i<index;i++){
            pre = pre.next;
        }
        //新建结点
        ListNode newNode = new ListNode(val);
        //妙啊!!!
        newNode.next = pre.next;
        pre.next.prev = newNode;
        pre.next = newNode;
        newNode.prev = pre;
    }
    public void deleteAtIndex (int index){
        //判断索引是否有效
        if(index<0 || index>=size){
            return;
        }
        //删除操作
        size--;
        //获取虚拟头结点
        ListNode pre = this.head;
        for(int i =0 ;i<size;i++){
            pre = pre.next;
        }
        pre.next.next.prev = pre;
        pre.next = pre.next.next;

        //爽极了,又简单又难!!!
    }
}
