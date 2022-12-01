package pr;

public class 유효범위1 {
	static int i; //전역 변수
	
	static void a() {
		
//		int i=0;지역 변수
	}

	public static void main(String[] args) {
		for(i=0;i<5;i++) {
			a();
			System.out.println(i);
		}

	}

}
