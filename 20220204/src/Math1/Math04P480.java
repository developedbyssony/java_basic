package Math1;

public class Math04P480 {

	public static void main(String[] args) {
		// Math.random()은 0이상 1미만인 난수를 구해줍니다.
		// 난수란? 정의된 범위 내에서 무작위로 추출된 수
		// double a = Math.random();
		// System.out.println(a);
		
		
		for (int i = 0; i < 20; i++) {
			double b = Math.random();
			if (b <= 0.15) {System.out.println("강화에 성공하였습니다.");}
			else {System.out.println("강화에 실패하였습니다.");}
		}
		
		int c = (int)(Math.random() * 6); /* 0 이상 6 미만으로 범위 제한 */
		System.out.println(c);
		
		}
	}