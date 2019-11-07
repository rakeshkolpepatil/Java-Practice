/*
 * Encapsulation is a way of binding data to methods.
 * So that data can be accessed only through the methods of a class.
 * 
 */

class Teacher{
	private int age;
	private String name;
	
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		Teacher t = new Teacher();
		t.setAge(29);
		t.setName("Rakesh");
		System.out.println("The name of teacher is "+ t.getName());
		System.out.println("The age of teacher is " + t.getAge());
	}
}
