package Math1;

public class Math05P480 {

	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요.
		// 주사위 게임은 내 값은 myValue에,
		// 컴퓨터값은 comValue 변수에 값을 난수발생으로 1~6번으로 부여한 뒤
		// 값이 같다면 무승부, 아니면 나, 혹은 컴퓨터 중 승자가 누구인지 알려주는 방식입니다.
		
		int myValue = (int)(Math.random() * 7);
		int comValue = (int)(Math.random() * 7);
		
		if (myValue == comValue)	{System.out.println("무승부입니다.");}
		else if (comValue < myValue) {System.out.println("컴퓨터에게 승리하였습니다.");}
		else if (myValue < comValue)  {System.out.println("컴퓨터가 승리하였습니다.");}
		
		System.out.println("내 값" + myValue);
		System.out.println("컴퓨터 값" + comValue);
	}
}
