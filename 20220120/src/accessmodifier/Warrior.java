package accessmodifier;

public class Warrior extends Commoner {
	                  // "����"
	public Warrior (String name) {
		super(name);
	}
	
	public void hunt() {
		setHp(getHp()-1);
		setExp(getExp()+10);
		System.out.println("���簡 ����� �߽��ϴ�.");
	}
	
	public void doubleAttack() {
		setHp(getHp()-4);
		setExp(getExp()+25);
		System.out.println("���簡 �� �� �����մϴ�.");
	}
	
	public void getInfo() {
		System.out.println("���� ü��" + getHp());
		System.out.println("���� ����"  + getLv());
		System.out.println("���� ����" + getMp());
		System.out.println("���� ����ġ" + getExp());
	}

}