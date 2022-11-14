package pro4;

class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	public boolean equlas(Object obj) {
		return true;
	}
}


public class Object {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		
	}

}
