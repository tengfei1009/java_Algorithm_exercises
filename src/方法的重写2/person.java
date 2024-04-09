package 方法的重写2;

public class person {
	String name;
	int age;
	public person() {
	System.out.println("父类的无参构造");
	}
	public person(String name,int age) {
		this.name=name;
		this.age=age;//就近原则
	}

}
