package pr;

public class 클래스와인스턴스그리고객체 {

	 public static void sum(int left,int right) {
		 System.out.println(left +right);
	 }
	
	
	public static void main(String[] args) {
			//아래의 로직이 1000줄짜리의 복잡한 로직이라고 가정하자.
			System.out.println(10+20);
			System.out.println(20+20);
			
			sum(10,20);
			sum(20,20);
			
	}

}
