package 力扣链表.简单;

//java定义链表
public class ListNode {
    //类中默认的访问范围是private

    //结点的值
    int val;

    //下一个节点
    ListNode next;

    //无参构造
    public ListNode () {

    }
    //有一个参数的构造
    public ListNode (int val){
        this.val = val;
    }
    //有两个参数的构造
    public ListNode (int val,ListNode next) {
        this.val = val;
        this.next = next;
    }
}
