package pro4;


class V{
	public String x() {return "V.x";}
	
}
class K extends V{
	public String x() {return "K.x";}
	public String y() {return "y";}
}
class K2 extends V{
	public String x() {return "B2.x";}
}

public class 클래스와다형성 {

	public static void main(String[] args) {
		V obj= new K();
		V obj2 =new K2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	
		

	}

}
