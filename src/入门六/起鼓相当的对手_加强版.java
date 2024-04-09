package 入门六;

import java.util.ArrayList;
import java.util.Scanner;

public class 起鼓相当的对手_加强版 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList <Student> array =new ArrayList<>();
        Student[] stu = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();
            Student st =new Student(name,c,m,e);
            stu[i]=st; //存入每个学生对象
        }
        for (int i = 0; i < stu.length; i++) {
            for (int j = i+1; j < stu.length; j++) {
                int sum = stu[i].getTotal();
                int sum2 =stu[j].getTotal();
                //多少对旗鼓相当的对手
                if(Math.abs(sum-sum2)<=10 && Math.abs(stu[i].getC()-stu[j].getC())<=5 && Math.abs(stu[i].getM()-stu[j].getM())<=5 && Math.abs(stu[i].getE()-stu[j].getE())<=5){
                    // 判断,名字中,字母顺序小的排前面
                    if (stu[i].getName().compareTo(stu[j].getName()) < 0) {
                        array.add(stu[i]);
                        array.add(stu[j]);
                    } else {
                        array.add(stu[j]);
                        array.add(stu[i]);
                    }
            }
        }
    }
        // 输出结果,每两个换一下行
        int count = 0; // 计数器
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).getName() + " ");
            count++;
            if (count == 2) {
                System.out.println();
                count = 0; // 重置计数器
            }
        }
    }
}
