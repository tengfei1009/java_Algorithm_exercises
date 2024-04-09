package 力扣链表;

//环形链表,约瑟夫问题
public class Josepfu {
    public static void main(String[] args) {
        //构建环形链表,和遍历
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.showBoy();

        //测试一把小孩出圈是否正确
        //出圈的顺序 2 4 1 5 3
        circleSingleLinkedList.countBoy(1,2,5);
    }
}

class CircleSingleLinkedList {
    //创建一个first节点,当前没有编号
    private Boy first = new Boy(-1);

    //添加小孩节点,构成一个环形的链表
    public void addBoy(int nums) {
        //nums 做一个数据校验
        if (nums < 1) {
            System.out.println("nums的值不正确");
            return;
        }
        Boy curBoy = null; //辅助指针,帮助构建环形链表
        //使用for循环来创建环形链表
        for (int i = 1; i <= nums; i++) {
            //根据编号,创建小孩节点
            Boy boy = new Boy(i);
            //如果是第一个小孩
            if (i == 1) {
                first = boy;
                first.setNext(first);//指向自己,构成第一个环
                curBoy = first; //让curBoy指向第一个(辅助指针)
            } else {
                curBoy.setNext(boy); //指向下一个节点
                boy.setNext(first); //下一个节点的下一个指向前一个
                //挪动使得辅助指针指向下一个节点
                curBoy = boy;
            }
        }
    }

    //遍历当前环形链表
    public void showBoy() {
        if (first == null) {
            System.out.println("没有任何小孩~~");
            return;
        }
        //因为first不能动,因此我们仍然使用一个辅助指针完成遍历
        Boy curBoy = first;
        while (true) {
            System.out.printf("小孩的编号%d \n", curBoy.getNo());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }
    //根据用户的输入,计算出小孩出圈的顺序

    /**
     * startNo 表示从第几个小孩开始数数
     * countNum 表示数几下
     * nums 表示最初有多少小孩在圈中
     */
    public void countBoy(int startNo, int countNum, int nums) {
        //先对数据进行效验
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入有误,请重新输入");
            return;
        }
        //创建要给辅助指针,帮助完成小孩出圈
        Boy helper = first;
        //需求创建一个辅助指针(变量)helper,事先应该指向环形链表的最后这个节点
        while (true) {
            if (helper.getNext() == first) { //说明helper指向最后的小孩节点(也就是第一个节点的前一个节点)
                break;
            }
            helper = helper.getNext();
        }
        //报数前,先让first 和 helper移动到startNo(起始报数小孩的位置)
        //这里以first == 1为例,helper 必须移动到first的前一位
        for (int j = 0; j < startNo - 1; j++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        //当小孩报数时,让first 和 helper 指针同时的移动 m -1 次 ,然后出圈
        //循环操作,直到圈中只有一个节点
        while (true) {
            if (helper == first) {
                break;
            }
            //让first 和helper 指针同时的移动countNum -1
            for (int i = 0; i < countNum - 1; i++) {
                //向下移动first
                first = first.getNext();
                //向下移动helper
                helper = helper.getNext();
            }
            //这时first指向的节点,就是要出圈的小孩节点
            System.out.printf("小孩%d出圈", first.getNo());
            //这时将first指向的小孩节点出圈
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的小孩编号%d\n",first.getNo());
    }
}


//创建一个Boy类,表示一个节点
class Boy {
    private int no; //编号
    private Boy next; //指向下一个节点,默认null

    //传递一个编号
    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
