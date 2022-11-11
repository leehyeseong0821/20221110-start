package pro2;

public class 비교와Boolean {

	public static void main(String[] args) {
		
		System.out.println(1==2);
		System.out.println(1==1);
		System.out.println("one"=="two");
		System.out.println("one"=="one");
		System.out.println(10>20);
		System.out.println(10<20);
		System.out.println(10>=10);
		System.out.println(10>=20);
		
		String a="hello";
		String b= new String("hello");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		

	}

}
