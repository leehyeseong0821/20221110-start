package pro;

public class 배열 {

	public static void main(String[] args) {
			String[] classgroup = {"최진혁","최유빈","한아람","이고잉"};
			
			System.out.println(classgroup[0]);
			System.out.println(classgroup[1]);
			System.out.println(classgroup[2]);
			System.out.println(classgroup[3]);
			
			String [] classgroup1 = new String[4];
			classgroup1[0]="김";
			System.out.println(classgroup1.length);
			System.out.println(classgroup1[0]);
			classgroup1[1]="진";
			System.out.println(classgroup1.length);
			System.out.println(classgroup1[1]);
			classgroup1[2]="영";
			System.out.println(classgroup1.length);
			System.out.println(classgroup1[2]);
			classgroup1[3]="이";
			System.out.println(classgroup1.length);
			System.out.println(classgroup1[3]);
			//배열문의 반복
			
			String [] members = {"이","김","박"};
			for(int i=0;i< members.length;i++) {
				String member = members[i];
				System.out.println(member +"씨가 상담을 받았습니다.");
			}
			//foreach를 사용한 반복
			String [] mems= {"성","해","정"};
			for(String e :mems) {
				System.out.println(e+"씨가 상담을 받았습니다.");
			}
	
			
	}

}
