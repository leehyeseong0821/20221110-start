package pro3;

public class 메소드7 {
	
	
	public static String getMember1() {
		return "최진혁";
	}
	public static String getMember2() {
		return "최유빈";
	}
	public static String getMember3() {
		return "한이람";
	}
	
	
	public static String[] getMembers() {
		String []members= {"최진혁","최유빈","한아람"};
		
		return members;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
		
		String[] members= getMembers();
		System.out.println(members[0]);
		System.out.println(members[1]);
		System.out.println(members[2]);
	}

}
