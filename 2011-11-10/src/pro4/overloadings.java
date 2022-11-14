package pro4;



public class overloadings {
	void A(){System.out.println("void A()");}
	void A (int arg1) {System.out.println("void A (int arg1)");}
	void A (String arg1,String arg2) {System.out.println("void A (string arg1)");}
//	int A() {System.out.println("void A()");}

	public static void main(String[] args) {
		overloadings a1= new overloadings();
		a1.A();
		a1.A(1);
		a1.A("coding everybody","coding hi");

	}

}
