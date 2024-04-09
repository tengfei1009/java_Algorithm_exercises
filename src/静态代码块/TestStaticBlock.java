package 静态代码块;

public class TestStaticBlock {
	static String name;
	static {
		System.out.println(name+"静态代码块");
	}
	
	
	
	{
		System.out.println(name+"非静态代码块");
	}
	
	
	public TestStaticBlock(String a) {//构造方法名要和类名一样
		name=a;
		System.out.println(name+"构造方法");
	}
	
	
	
	public void method() {
		System.out.println(name+"成员方法");
	}
	
	
	
	public static void main(String[]args) {
		TestStaticBlock s1;//只加载静态代码块
		
		//s2时先加载非静态代码块,此时name的值还是为null
		//然后加载构造方法   在构造方法中给name赋值为s2,此时输出s2构造方法
		TestStaticBlock s2=new TestStaticBlock("s2");
		
		
		//s3时先加载非静态代码块,此时name的值还为s2
		//然后加载构造方法    在构造方法中给name赋值为s3,此时输出s3构造方法
		//然后加载成员方法
		TestStaticBlock s3=new TestStaticBlock("s3");
		s3.method();
	}
}
//静态代码块最先执行,并且只会执行一次,非静态代码块在每次调用构造方法前都会执行.
//因此,静态代码块和非静态代码块中的name变量的值都为null.构造方法在使用new关键字创建对象时执行.
//由于name是静态成员变量,因此在创建s2对象时,name变量被赋值为s2,在创建s3对象时,先调用了非静态代码块(此时name的值已经成为s2,且被共享)
//还没有调用构造方法改变name的值,所以输出"s2非静态代码块"