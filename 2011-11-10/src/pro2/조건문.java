package pro2;

public class 조건문 {

	public static void main(String[] args) {
		 
		if(true) {
			System.out.println("result : true");
		
		}
		//조건문 시작 false로 바꾸면 실행 X
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
		//if  뒤에 따라 붙은 값이 false면 else가 이끄는 2로 실행이 된다.
		if(true) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		System.out.println();
		if (false) {
			System.out.println(1);
		}else if (true) {
			System.out.println(2);
		}else if (true) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
		
	}
	
	  


}
