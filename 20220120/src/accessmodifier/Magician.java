package accessmodifier;

// Commoner�� ����մϴ�.
public class Magician extends Commoner {
	
	// �����ڸ� ������ּ���.
	public Magician(String name) { /// �θ� Ŭ������ �Ķ���͸� ����!
		super(name); /// �θ� Ŭ���� �������� ���� ������ super�� ����
	}
	
	// ��� �޼��带 ����ڽ��ϴ�.
	public void hunt() {
		System.out.println("�����簡 ����� �����մϴ�.");
		// 	hp -= 2; /// private�� �ڽ� �������� ������ ���� ����!
		
		// public�� setter�� ������ setHp()�� ��� Ȱ���մϴ�.
		// setHp(5)�� ���, ������ �� ��� hp ������ 5�� ��ü�ش޶�� ��û�Դϴ�.
		// ���� ���ϴ� ���� ���� hp ������ 2�� ���� ���� ���ο� hp�� ����Ǵ� ���Դϴ�.
		// setter�� getter(setHp(), getHp()�� ������ Ȱ����
		// ������ ������ ü���� 2�� ���̵��� ������ �ۼ����ּ���.
		setHp(getHp() - 2);
		// ����ġ�� ����������
		// exp += 10; �� ���� ������ �� �����Ƿ�
		// setExp()�� Ȱ���մϴ�.
		// ���� ���ϴ� ����, �� exp������ ��ɽø��� 10�� ����ġ�� �����ϴ� ���Դϴ�.
		setExp(getExp() + 10);
	}
	
	public void getInfo() {
		// ������ private�� ������ �ȵǴ°� �ƴ϶� ��ȸ�� �Ұ����մϴ�.
		// ���� getter�� �̿��� ���¸� ��ȸ�� �� �ְ� ���ּ���.
		System.out.println(super.getHp()); /// private ���������� ->  getter �Լ� ��ȸ�� ��ȸ������ �ҷ�����
		System.out.println(super.getExp()); /// private ���������� ->  getter �Լ� ��ȸ�� ��ȸ������ �ҷ�����
		System.out.println("���� ü��" + getHp());
		System.out.println("���� ����"  + getLv());
		System.out.println("���� ����" + getMp());
		System.out.println("���� ����ġ" + getExp());
	}
	
	// fireball ����� �߰����ּ���
	// ������ 3�ٰ�, ����ġ�� 20 �����մϴ�.
	public void fireball() {
		setMp(getMp()-3);
		setExp(getExp()+20);
		System.out.println("�����簡 ȭ������ �����ϴ�.");
	}
	
}