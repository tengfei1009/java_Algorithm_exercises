package 建3副本.多态例题;

public class Animal {
	private String color;
	private int age;
	public Animal() {
		
	}
	public Animal(String color,int age) {
		this.age=age;
		this.color=color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		 this.color=color;//只需要赋值不需要返回值
	}
	public void eat(String something) {
		System.out.println("动物在吃"+something);
	}

}
