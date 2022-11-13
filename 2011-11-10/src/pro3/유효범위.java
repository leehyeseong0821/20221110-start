package pro3;

public class 유효범위 {
	
	static int i;
	
	static void a() {
	  int i=0;
	}
	

	public static void main(String[] args) {
		
		for (i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
	}

}
