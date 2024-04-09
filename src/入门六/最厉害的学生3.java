package 入门六;

import java.util.Scanner;

public class 最厉害的学生3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int beststu = 0;
        int maxScore = 0;

        Student[] stu = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();

            stu[i] = new Student(name, c, m, e);
            int sum = stu[i].getTotal();
            if (sum > maxScore) {
                maxScore = sum;
                beststu = i;
            }
        }

        System.out.println(stu[beststu].getName() + " " +
                stu[beststu].getC() + " " +
                stu[beststu].getM() + " " +
                stu[beststu].getE());

        sc.close();
    }
}


