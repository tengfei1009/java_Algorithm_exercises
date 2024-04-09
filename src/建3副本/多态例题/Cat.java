package 建3副本.多态例题;

public class Cat extends Animal {
	public Cat() {
		
	}
	public Cat(String color,int age) {
		super(color,age);
	}
	/*@Override
	public void eat(String something) {
		System.out.println(getAge()+"岁的"+getColor()+"颜色的猫咪着眼睛侧着头吃鱼");
	}*/
	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}

}
