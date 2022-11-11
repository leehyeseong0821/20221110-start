package pro2;

public class 배열 {

	public static void main(String[] args) {
		// T배열 Array 그룹핑
		String[] ClassGroup = {"김","이","성","전"};
		System.out.println(ClassGroup[0]);
		System.out.println(ClassGroup[1]);
		System.out.println(ClassGroup[2]);
		System.out.println(ClassGroup[3]);
		
		String[] classgroup = new String[8];
		classgroup[0] ="김";
		System.out.println(classgroup.length);
		classgroup[1]="이";
		System.out.println(classgroup.length);
		classgroup[2]="전";
		System.out.println(classgroup.length);
		classgroup[3]="현";
		System.out.println(classgroup.length);
		
		String[]members= {"최진혁","최유빈","김진철"};
		for(int i=0; i<members.length;i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
	}

}
