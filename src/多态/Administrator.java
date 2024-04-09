package 多态;

public class Administrator extends person{
	@Override
	public void show() {
		System.out.println("管理员的信息为"+getName()+","+getAge());
		
	}

}
