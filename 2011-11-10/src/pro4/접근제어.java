package pro4;

class X{
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}



public class 접근제어 {

	public static void main(String[] args) {
		X a = new X();
		System.out.println(a.y());
		System.out.println(a.x());
//		System.out.println(a.z); 오류가 발생한다 x에 return을 z로 받았기 때문

	}

}
