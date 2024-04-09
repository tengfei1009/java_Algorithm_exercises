package 建3副本.多态例题;

public class Test {
	public static void main(String[]args) {
		
//----------------------------------------------------------------------------------------------
	/*	Person p1=new Person("老王",30);
		Dog d=new Dog("黑",2);//狗类型有两个有参构造,赋值
		p1.keepPet(d,"骨头");//调用person中方法,一个Dog类型,一个String(吃的)类型
		Person p2=new Person("老李",25);
		Cat c=new Cat("灰",3);
		p2.keepPet(c,"鱼");//前面注释了一个东西,取掉看看,就懂了
		//还有就是,如果用第二种方法,a.getColor也可以是d.getColor或者c.getColor,因为是两个不同的空间 new出来的  所以互不影响,先去子类本类中找,发现是继承
		//的是父类的,所以一样.     */

//--------------------------------------------------------------------------------------------------
		//方法2
		//创建饲养员的对象
		Person p =new Person("老王",30);
		Dog d =new Dog("黑",2);
		Cat c=new Cat("灰",3);
		p.keepPet(d,"骨头");
		p.keepPet(c, "鱼");
		
	}
	

}
