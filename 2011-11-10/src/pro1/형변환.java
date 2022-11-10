package pro1;

public class 형변환 {

	public static void main(String[] args) {
		int a=3;
		float b =1.0f;
		double c = a+b;
		System.out.println(c);
		
		//명시적 형변환.
//		float d =100.0;
//		int e = 100.0f;
		
		float f=(float)100.0;
		int e =(int)100.0f;
		
		System.out.println(f);
		System.out.println(e);

	}

}
