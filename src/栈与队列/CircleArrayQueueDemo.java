package 栈与队列;

import java.util.Scanner;

//数组模拟环形队列
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        System.out.println("测试数组模拟环形队列的案例~~~");


        //创建一个环形队列
        CircleArray queue = new CircleArray(3); //其队列的有效数据最大为2
        char key = ' ';//接收用户输入
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列头的数据");
            key = sc.next().charAt(0); //接收第一个字符
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = sc.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        //如果出现异常信息,直接打印异常信息,就是exception()里面的文字
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':  //查看队列头的数据
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e': //退出
                    sc.close();
                    loop = false;
                default:
                    break;
            }
        }
        System.out.println("程序退出~~");
    }
}

class CircleArray {
    /**
     * 类中定义的变量的默认值为0
     */

    private int maxSize; //表示数组的最大容量
    //front 变量的含义做一个调整: front就指向队列的第一个元素,也就是说arr[front]
    //front 的初始值 =0
    private int front; //队列头
    //rear 变量的含义做一个调整: rear 指向队列的最后一个元素的后一个位置,因为希望空出
//    rear的初始值 = 0
    private int rear;  //队列尾
    private int[] arr; //该数据用于存放数据,模拟队列

    public CircleArray(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull() {
        // 当队列尾的下一个位置等于队列头时，表示队列已满
        return (rear + 1) % maxSize == front;
    }


    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;  //相等为空
    }

    //添加数据到队列
    public void addQueue(int n) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("队列已满,不能加入数据");
            return;
        }
        //因为rear 就是一个空位，所以直接赋值
        arr[rear] = n;
        //在将rear后移，这里必须考虑取模(超不出maxSize,最大为maxSize-1)
        rear = (rear + 1) % maxSize;
    }

    //获取队列的数据,出队列
    public int getQueue() {
        //判断队列是否空
        if (isEmpty()) {
            throw new RuntimeException("队列为空,不能读取数据"); //运行时异常
        }
        //front是指向队列的第一个元素
        //将front对应的值保存到一个临时变量(不能直接返回front吧，那样就无法继续移动front了)
        //将front后移，考虑取模
        //将临时保存的变量返回
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    //显示队列的所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列空的,没有数据~~");
            return;
        }
        //从front开始遍历,遍历多少个元素
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i %  maxSize]);
            System.out.println(front);
        }
    }

    //当前队列有效数据的个数
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    //显示队列的头数据,注意不是取出数据
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空的,没有数据");
        }
        return arr[front];
    }
}