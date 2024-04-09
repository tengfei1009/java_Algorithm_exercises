package 力扣链表.单链表;

import java.util.List;

//class ListNode {
//    //结点的值
//    int val;
//
//    //下一个结点
//    ListNode next;
//
//    //无参构造
//    public ListNode (){}
//    //有参构造(单个参数)
//    public ListNode (int val){
//        this.val = val;
//    }
//}
class MyLinkedList_2 {
    //size存储链表元素的个数
    int size;
    //定义虚拟头结点
    ListNode head;

    //初始化链表,只有虚拟头结点的链表
    //其实在外面直接给变量赋值也是可以的,但是如果有有参构造,则必须要写无参构造,无参构造必须要写,在这个里面初始化也是可以的
    public MyLinkedList_2 (){
        size = 0;
        //单链表的有参构造(单个)
        head = new ListNode(0);
    }
    public int get(int index){
        //判断是否合法
        if(index<0 || index>=size){
            return -1;
        }
        //合法了
//        创建一个临时结点.进行判断
        ListNode cur = head;
        //遍历链表,从头结点开始
        for(int i= 0 ;i<=size;i++){
            cur =cur.next;
        }
        return cur.val;
    }
    //添加结点
    public void addAtTail (int index,int val){
        //判断是否合法
        if(index>size){
            return;
        }
        size++;
        //定义插入结点的前驱
        ListNode pred =head;
        for(int i = 0;i<index;i++){
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }
    //删除索引结点
    public void deleteAtIndex (int index){
        //判断是否合法
        if(index<0 || index>=size){
            return;
        }
        size--;
        if(index == 0){
            head= head.next;
        }
        ListNode pred = head;
        for(int i =0 ;i<index ;i++){
            pred = pred.next;
        }
        pred.next =pred.next.next;
    }
}
