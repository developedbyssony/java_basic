package classreview;

public class BasketballPlayer {
	public int height;
	public int jumpHeight;
	
	public BasketballPlayer(int h, int j) { // 멤버 변수를 초기화해주는 생성자
		height = h;
		jumpHeight = j;
		System.out.println("농구 선수의 키는" + height + "농구 선수의 점프력은" + jumpHeight);
	}
}
