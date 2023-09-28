package learning.classes_and_objects;


class Demo{
	
	 int id;
	String name;
	int age;
	
	public Demo(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public void print() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		
	}
	public void print(int id,String name,int age) {
		
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(apply(age));
			
	}
	
	public String apply(int age) {
		
		String result=  age>18?"you apply":"your not eligble";
		
		return result;
	}
}
public class ClassAndObjects {
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo(101,"mathi",25);
		d1.print();
		d1.print(102, null, 20);
		

	}

}
