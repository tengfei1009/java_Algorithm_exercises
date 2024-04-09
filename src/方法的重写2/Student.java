package 方法的重写2;

public class Student extends person{
	public Student() {//子类的构造方法
		super();//访问父类的空参
		System.out.println("子类的无参构造");
	}
	//子类的有参构造
	public Student(String name,int age) {
		super(name,age);
	}

}
