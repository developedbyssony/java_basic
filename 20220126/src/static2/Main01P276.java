package static2;

public class Main01P276 {

	public static void main(String[] args) {
	    // Asean 조원 생성 없이 발표 점수를 콘솔에 찍어보세요.
		// System.out.println(Asean.presentationScore);
		/// Asean.presentationScore(); 이렇게 쓰는 건 메소드
		System.out.println(Asean.getPresentationScore());

		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요.
		Asean a1 = new Asean(10,20,30);
		Asean a2 = new Asean(9,20,30);
		Asean a3 = new Asean(8,20,30);
		Asean a4 = new Asean(7,20,30);
		
		
		// Asean a1 = new Asean(10,20,30);
		System.out.println("[a1의 성적]");
		a1.showAseanInfo();
		System.out.println("----------------------");
		System.out.println("[a2의 성적]");
		a2.showAseanInfo();		
		System.out.println("----------------------");
		System.out.println("[a3의 성적]");
		a3.showAseanInfo();		
		System.out.println("----------------------");
		System.out.println("[a4의 성적]");
		a4.showAseanInfo();		
	}

}
