package 多态;

public class teacher extends person{

	//非静态成员方法
	@Override
	public void show() {
		System.out.println("老师的信息为"+getName()+","+getAge());
	}

}
