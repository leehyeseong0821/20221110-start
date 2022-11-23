package pro;

public class switch문 {

	public static void main(String[] args) {
		switch(3) {             //스위치안에 숫자1이 들어가면 1,2,3으로 실행이되고  2였으면 1을 제외하고 2,3만 실행 3만넣었으면 3만 실행된다.
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
	 System.out.println();
	
		switch(1) {
		case 1:
			System.out.println("하나");
		case 2:
			System.out.println("둘");
		case 3:
			System.out.println("셋");
		}
		System.out.println();
		switch(4) {
		case 1:
			System.out.println("넷");
			break;
		case 2:
			System.out.println("다섯");
			break;
		case 3:
			System.out.println("여섯");
			break;
		default :
			System.out.println("답이 없습니다.");
		}
	}
}
