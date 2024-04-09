package 方法的重写2;

public class 学生对象 {
	public static void main(String[]args){
		//创建学生对象
		Student s =new Student();//访问构造
		Student d=new Student("zhangsan",23);
		System.out.println(d.name+","+d.age);
	}
	

}
