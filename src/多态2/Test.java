package 多态2;

public class Test {//这个是类
	public static void main(String[]args) {
		Animal a=new Dog();
		System.out.println(a.name);
		a.show();
	}
	
	

}
class Animal{
	String name="动物";
	//成员方法,不是测试类中的不用写static
	public void show() {
		System.out.println("Animal---show方法");
	}
}
class Dog extends Animal{
	String name="狗";
	@Override
	public void show() {
		System.out.println("Dog---show方法");
	}
}
class Cat extends Animal{
	String name="猫";
	@Override
	public void show() {
		System.out.println("Cat---show方法");
	}
	}
