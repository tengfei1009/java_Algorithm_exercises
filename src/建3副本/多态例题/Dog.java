package 建3副本.多态例题;

public class Dog extends Animal{
	//写构造方法
	public Dog() {
		
	}
	public Dog(String Color,int age) {
		super(Color,age);//继承顺序不能反

	}
	@Override
	public void eat(String something) {
		System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住骨头猛吃");
	}
	public void lookHome() {
		System.out.println("狗在看家");
		
	}

}
