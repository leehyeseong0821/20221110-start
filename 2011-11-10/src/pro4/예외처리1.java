package pro4;

class s{
	private int[] arr= new int[3];
	s() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=100;
	}
	public void z(int first, int second) {
		try {
		System.out.println(arr[first] /arr[second]);
	} catch(ArithmeticException e) {
		System.out.println("ArithmeticException e");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException e");
	} catch(Exception e) {
		System.out.println("e");
	} finally {
		System.out.println("finally");
	}
	}
}


public class 예외처리1 {

	public static void main(String[] args) {
		s a = new s();
		a.z(10,0);
		a.z(1, 0);
		a.z(2, 0);
		a.z(2, 2);

	}

}
