package 入门六;

import java.util.*;


class Node { // 用类来表示学生的各项信息
    String name;
    int chinese, math, english, sum, id;

    Node(String name, int chinese, int math, int english, int sum, int id) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.sum = sum;
        this.id = id;
    }
}

public class 最厉害的学生 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 学生数量
        Node[] student = new Node[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int chinese = sc.nextInt();
            int math = sc.nextInt();
            int english = sc.nextInt();
            int sum = chinese + math + english;
            student[i] = new Node(name, chinese, math, english, sum, i + 1);
        }

        /**匿名内部类*/
//        new出来的对象 前面是创建对象, 后面是没有名字的类, 要重写其中的方法 于() 前面的要么是实现关系, 要么是继承关系,后面没有名字的类,实现接口,并创建了对象
        //表示一个没有名字的类,实现了  Comparator<Node>() 接口


//        在 Java 中，Arrays.sort() 方法用于对数组进行排序。当您提供一个自定义的比较器（Comparator）作为参数时，您需要实现 compare() 方法来定义排序逻辑。
//        在上述代码中，compare() 方法被重写来比较两个 Node 对象 a 和 b。在比较中，首先检查它们的总分 sum 是否相等。
//        如果总分不相等，则根据总分的差值进行降序排序，即 b.sum - a.sum。这是由于在降序排序中，较大的值应该排在前面，所以返回正数表示 b 在前面。
//        如果总分相等，那么根据学生的 ID 进行升序排序，即 a.id - b.id。在升序排序中，较小的值应该排在前面，所以返回负数表示 a 在前面。
//        通过返回不同的值（正数、负数或零），compare() 方法告诉排序算法如何排列元素。具体来说，如果返回负数，则 a 应该排在 b 的前面；
//        如果返回正数，则 b 应该排在 a 的前面；如果返回零，则 a 和 b 的顺序不变。


//        .Arrays.sort() 方法会自动将数组中的元素传递给比较器（Comparator）的 compare() 方法。
//        在 Arrays.sort() 方法中，您需要提供一个比较器对象作为参数，该比较器实现了 Comparator 接口。比较器的 compare() 方法将在排序过程中被多次调用，用于比较数组中的元素。
        Arrays.sort(student, new Comparator<Node>() {
            public int compare(Node a, Node b) {
                if (a.sum != b.sum) {
                    return b.sum - a.sum; // 根据总分降序排序  返回正数,让b排在a的前面
                } else {
                    return a.id - b.id; // 如果总分相同，根据ID升序排序
                }
            }
        });
            System.out.printf("%s %d %d %d",student[0].name,student[0].chinese,student[0].math,student[0].english);
    }
}
