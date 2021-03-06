package accessmodifier;

public class Warrior extends Commoner {
	                  // "전사"
	public Warrior (String name) {
		super(name);
	}
	
	public void hunt() {
		setHp(getHp()-1);
		setExp(getExp()+10);
		System.out.println("전사가 사냥을 했습니다.");
	}
	
	public void doubleAttack() {
		setHp(getHp()-4);
		setExp(getExp()+25);
		System.out.println("전사가 두 번 공격합니다.");
	}
	
	public void getInfo() {
		System.out.println("현재 체력" + getHp());
		System.out.println("현재 레벨"  + getLv());
		System.out.println("현재 마나" + getMp());
		System.out.println("현재 경험치" + getExp());
	}

}
