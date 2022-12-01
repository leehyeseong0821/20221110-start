package pr;

public class 메소드출력값 {

	public static String numberning(int init,int limit) {
		int i = init;
		 // 만들어지는 숫자들을 out이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String out="";
		while(i<limit) {
			// 숫자를 화면에 출력하는 대신 변수 out에 담았다.
			out +=i;
			i++;
		}
		return out;
		
	}
	// 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
    // 배치하면 된다.
	public static void main(String[] args) {
		String result = numberning(1,5);
		System.out.println(result);

	}

}
