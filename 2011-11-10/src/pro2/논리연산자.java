package pro2;

public class 논리연산자 {

	public static void main(String[] args) {
		if(true &&true) {
			System.out.println(1);
		}
		if(true &&false) {
			System.out.println(2);
		}
		if(false && true) {
			System.out.println(3);
		}
		if(false && false) {
			System.out.println(4);
		}
		
		if(true||false) {
			System.out.println(1);
		}
		if(true||true) {
			System.out.println(2);
		}
		if(false||false) {
			System.out.println(3);
		}
		if(!true){
			System.out.println(1);
		}
		if(!false) {
			System.out.println(10);
		}
			
	}

}
