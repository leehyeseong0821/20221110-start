package pro;

public class 논리연산자 {

	public static void main(String[] args) {
//		Boolean의 값을 결합해서 코드를 좀 더 간결하게 만들 수 있는 논리 연산자(
//		&&는 좌항과 우항의 값이 모두 참(true)일 때 참이 된다. And라고 읽는다. 
//		예제를 보자 
		if (true && true) {
			System.out.println(1);
		}
		if(true && false) {
			System.out.println(2);
		}
		if(false && true) {
			System.out.println(3);
		}
		if(false && false) {
			System.out.println(4);
		}
		
		
		if(true||false) {
			System.out.println(2);
		}
		if(false||true) {
			System.out.println(3);
		}
		if(true||true) {
			System.out.println(4);
		}
		if(false||false) {
			System.out.println(5);
		}
		
		if(!true) {
			System.out.println("실행을 시켜라");
		} 
		if(!false) {
				System.out.println("실행이 된다.");
		}
		
		
		if(!false) {
			System.out.println("실행이 된다.");
		} 
		if(!true) {
			System.out.println("실행을 시켜라");
		}
			
		
		
	}

}
