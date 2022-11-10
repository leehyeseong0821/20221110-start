package pro1;

public class 변수 {
   
	public static void main(String[] args) {
		
//		영어로는 Variable로 (문자나 숫자 같은) 데이터를 담는 컨테이너다. 
//		여기에 담겨진 데이터는 다른 데이터로 바꿀 수 있다. 변수는 마치 (사람이 쓰는 언어인) 자연어에서 대명사와 비슷한 역할을 한다.
		 int a;
		 a=1;
		 System.out.println(a);
		 a=4;
		 System.out.println(a+1);
		 double b=1.1;
		 System.out.println(b+1.1);
		 System.out.println(b+2);
		 
		 String first = "coding";
		 System.out.println(first);
		 
		 String c="안녕";
		 String d="하세요";

		 System.out.println(c+d);
		 
		 String e,f;
		 e="코딩";
		 f="공부";
		 System.out.println(e+f);
		 
		 System.out.println((100+10)/10);
		 System.out.println(((100+10)/10)+10);
		 System.out.println(100+10/10+10);
		 
		 int j=100;
		 System.out.println(j+10);
		 System.out.println((((j-10)/10)+10)*10);
		
	}

}
