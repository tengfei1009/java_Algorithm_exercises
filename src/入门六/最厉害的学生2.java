package 入门六;

import java.util.Scanner;

//class Student {
//    String name;
//    int chinese;
//    int math;
//    int english;
//    int total;
//
//    public Student(String name, int chinese, int math, int english) {
//        this.name = name;
//        this.chinese = chinese;
//        this.math = math;
//        this.english = english;
//        this.total = chinese + math + english;
//    }
//}

//public class 最厉害的学生2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        sc.nextLine();
////        System.out.println(sc.nextLine());  //这个也可以不加,因为下面没有nextline
//
//        Student maxStudent = null;
//        int maxTotal = 0;
//
//        for (int i = 0; i < N; i++) {
//            String name = sc.next(); //其实也读取不到换行符,所以最后那个nextline也可以不加,防止穿透
//            int chinese = sc.nextInt();
//            int math = sc.nextInt();
//            int english = sc.nextInt();
//            sc.nextLine();
//
//            Student st = new Student(name, chinese, math, english);
//            if(st.total>maxTotal){
//                maxTotal = st.total;
//                maxStudent = st;
//            }
//        }
//        System.out.println(maxStudent.name+" "+ maxStudent.chinese +" "+maxStudent.math+" "+maxStudent.english);
//        sc.close();
//    }
//}
