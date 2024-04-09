package 入门六;

import java.util.ArrayList;
import java.util.Scanner;

public class 培训 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Train>array =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            int grade = sc.nextInt();
            Train tr = new Train(name,age,grade);
            change(tr);
            array.add(tr);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("%s %d %d", array.get(i).name,array.get(i).age,array.get(i).grade);
            System.out.println();
        }
    }
    public static void change (Train tr){
        tr.age = tr.age+1;
        tr.grade = (int)(tr.grade*1.2);
        if(tr.grade>=600){
            tr.grade = 600;
        }
    }
}
