package pro;

public class 비교와boolean {

	public static void main(String[] args) {
		System.out.println(1==2); //거짓 
		System.out.println(1==1); //참
		System.out.println("1"=="1");//참
		System.out.println("2"=="12");//거짓
//	!= !는 부정을 의미하고 같다의 부정은 같지 않다이다 
		System.out.println(1!=2); //참
		System.out.println(1!=1); //거짓 같기때문이다
		System.out.println("1"!="2");//참
		System.out.println("1"!="1");//거짓
		
		System.out.println(1>2);//거짓
		System.out.println(1<2);//참
		
		System.out.println(10>=10);//참 같거나크다
		System.out.println(10>=11);//거짓
		
		String a= "hello";
		String b= new String("hello");
		System.out.println(a==b); //거짓 
		System.out.println(a.equals(b));//참
		// ==은 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해서 사용하는 연산자이기 때문에 b에 담긴 객체와 일치하지 않는 것이다. 
//		이를 보안하는 비교 방법이 equals이고 이를 이용해서 서로 다른 객체들간에 값이 같은지를 비교할 수 있다. 
		
	
	}

}
