package pro;

public class 연산자 {

	public static void main(String[] args) {
	  int a= 1+2;
	  System.out.println(a);
//	  3이 나온다.
	  
	  a = a-1;
	  System.out.println(a);
//	  2가 나온다.
	  a = a*2;
	  System.out.println(a);
//    4가 나온다.
	  a = a/2;
	  System.out.println(a);
//	  2가 나온다.
	  a= a+8;
	  System.out.println(a);
//	  10이 나온다.
	  a= a%7;
	  System.out.println(a);
//	  10에서 7을 나누면 1이고 나머지가 3이기 때문에 3이나온다.
	  System.out.println();
	  int b=3;
	  System.out.println(0%b);
	  System.out.println(1%b);
	  System.out.println(2%b);
	  System.out.println(3%b);
	  System.out.println(4%b);
	  System.out.println(5%b);
	  System.out.println(6%b);
	  
	  
	  String c="코딩";
	  String d="연습";
	  String e=c+d;
	  System.out.println(e);
//	  연산자 형변환
	  int aa=10;
	  int bb=3;
	  float cc=10.0f;
	  float dd=3.0f;
	  System.out.println(aa/bb);
	  System.out.println(cc/dd);
	  System.out.println(aa/dd);
	  System.out.println(cc/bb);
	  System.out.println();
	  int f= 3;
	  f++;
	  System.out.println(f); //4출력
	  ++f;
	  System.out.println(f); //5출력
	  System.out.println(++f); //6출력 ++f f라는 변수에 1이란 더한값을 프린트 ln에주는 것이고
	  System.out.println(f++); //6출력 f++ f는 1이 더해지는데 맥락이 끝나야 1이 증가한다.
	  System.out.println(f); //7출력

	  
	  
	}

}
