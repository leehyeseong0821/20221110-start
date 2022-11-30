package pro;

public class 반복문제어 {

	public static void main(String[] args) {
		for (int i=0; i<10;i++) {
			if(i==5) 
//				break; break를쓰면 5를 만나면 멈추지만 continue를쓰면 5만 멈추고 나머지 값들은 실행된다.
				continue;
				System.out.println("coding"+i);
			
		}

	}

}
