package static2;

public class Asean {
	// 출석점수(check), 중간고사(midTerm), 기말고사(finalTerm)
	// 변수를 설정해주세요.
	// 위 변수들은 개별 객체가 따로따로 관리합니다.
	public int check;
	public int midTerm;
	public int finalTerm;

	// 공용 발표점수인 presentaionScore를 static으로 만들어주세요.
	// 이 점수는 19점입니다.
	private static int presentationScore = 19;
	
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만
	// 받아서 수치를 입력해줍니다.
	                 // 9        20            30
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	// 일반 메서드로 showAseanInfo()를 생성해주시되
	// 성적 전체를 콘솔에 조회하게 해주세요.
	public void showAseanInfo() {
		System.out.println("중간고사 :" + this.midTerm);
		System.out.println("기말고사 :" + this.finalTerm);
		System.out.println("출석점수 :" + this.check);
		System.out.println("공용 발표 점수 :" + this.presentationScore);
	}
	
	// presentationScore는 private로 전환될 경우
	// main 지역에서 다이렉트로 조회가 불가능합니다.
	// Asean을 new 키워드로 만들지 않고도
	// private presentationScore를 콘솔에 조회가능하도록
	// 조치를 취해보세요. /// -> 9번줄의 코드
	public static int getPresentationScore() {
		return presentationScore;
	}

	public static void setPresentationScore(int presentationScore) {
		Asean.presentationScore = presentationScore;
	}
	
	
}
