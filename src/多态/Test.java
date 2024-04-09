package 多态;

public class Test {
	public static void main(String[]args) {
		
		Student s =new Student();
		s.setName("张三");
		s.setAge(18);
		
		teacher t=new teacher();
		t.setName("王建国");
		t.setAge(30);
		
		
		Administrator admin=new Administrator();
		admin.setName("管理员");
		admin.setAge(35);
		
		register(s);
		register(t);
		register(admin);
	}
	//这个方法既能接收老师,又能接收学生,还能接收管理员
	//只能把参数写成这三个类型的父类
	public static void register(person p) {
		p.show();
		
	}


}
