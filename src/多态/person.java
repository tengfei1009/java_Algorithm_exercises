package 多态;

public class person {
	private String name;
	private int age;
	public person(){
		
	}
	public person(String name,int age){
		this.name=name;//调用成员变量
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public  void setName(String name){
		this.name=name;
	}
	public int getAge() {
		return age;//返回值是age
	}
	public void setAge(int age){
		this.age=age;
	}
	public void show(){
		System.out.println(name+","+age);
		
	}

}
