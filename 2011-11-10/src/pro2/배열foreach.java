package pro2;

public class 배열foreach {

	public static void main(String[] args) {
		 
		String[] members = {"최진혁","김준일","이혜성"};
		for (String e:members) {
			System.out.println(e+"이 상담을 받았다.");
		}
		
		String[] mem=new String[3];
		mem[0] = "최진혁";
		String ms=mem[0];
		System.out.println(ms);
		

	}

}
