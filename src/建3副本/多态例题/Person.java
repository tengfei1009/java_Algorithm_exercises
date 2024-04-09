package 建3副本.多态例题;

public class Person {
	private String name;
	private int age;
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name=name;//有参初始化
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;//调用者(对象)中age成员变量被(形参)赋值
	}
	
	//-----------------------------------------------------------------------------------------------------
//	public void keepPet(Dog dog,String something) {
//		System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
//		//System.out.println(dog.getAge()+"岁的"+dog.getColor()+"颜色"+"的狗两只前腿死死抱住骨头猛吃");
//		dog.eat(something);
//	}
//	//@Override
//	public void keepPet(Cat cat,String something) {
//		System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");	
//         cat.eat(something);
//	}
//	
	
	//---------------------------------------------------------------------------------------------------
	//方法2
	
	//System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
	//创建一个方法,包括猫,包括狗
	//方法的形参,可以写,这些类的父类
	public void keepPet(Animal a,String something) {
		if(a instanceof Dog d) {
		System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的狗");
		d.eat(something);
		}else if(a instanceof Cat c) {
			System.out.println("年龄为"+age+"岁的"+name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");//本类成员方法会覆盖父类中成员方法
			c.eat(something);
		}else {
			System.out.println("没有这种动物");
		}
	}
}
