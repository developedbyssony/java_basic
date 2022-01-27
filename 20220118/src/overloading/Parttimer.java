package overloading;

public class Parttimer {
	// ��ƮŸ�̸��� ����
	// ��������(afternoon), �ñ�(pay), ���Ը�(shopName), �����̸�(name)
	private boolean afternoon; // true�� ����, �ƴϸ� ����
	private int pay; // �ñ�
	private String shopName; // ���Ը�
	public String name; // �����̸�
	
	// ������ �����ε���, �����ڵ� �޼����̴� �����ڸ� ���� �� �����ε� �������� ����� ���Դϴ�.
	// afternoon, pay, shopName, name�� ��� �޴� �����ڸ� ������ּ���.
	// ���� �����ڴ� public�Դϴ�.
	public Parttimer(boolean a, int p, String s, String n) {
		// �ñ��� 9160�� �̸��̶�� ������ 9160�� ����ְ�
		// �ƴϸ� �Է¹��� �ݾ��� �״�� �Է��ϵ��� �����غ�����.
		if (p < 9160) { p = 9160; }
		else { pay = p;} //������ ���� ���� �Ʒ��ʿ� �ش� if�� ���ָ� ������ �� �Դ´�.. ���� "�ѹ��� �����ؾ���"
		
		afternoon = a;
		shopName = s;
		pay = p;
		name = n;
		
		
		// ���� ������ Ȯ��
		System.out.println("�˹ٰ� �����Ǿ����ϴ�.");
		System.out.println("���ľ˹� :" + afternoon);
		System.out.println("�ñ� :" + pay);
		System.out.println("���Ը� :" + shopName);
		System.out.println("�˹ٻ��̸� :" + name);
	} 
	
	// �����ε��� �̸��� ������ �Ķ���Ͱ��� ������ ������ �ٸ��� �ߺ� �ۼ��� ����մϴ�.
	// afternoon, shopName, name�� �Է¹޴� �����ڸ� �ϳ� �� �ߺ��ۼ� ���ּ���
	// pay�� �Է¹��� �ʰ� �ٷ� �����ñ����� �ֽ��ϴ�.
	public Parttimer(boolean a, String s, String n) {
		afternoon = a;
		shopName = s;
		name = n;
		pay = 9160;
		// ���� ������ Ȯ��
		System.out.println("�˹ٰ� �����Ǿ����ϴ�.");
		System.out.println("���ľ˹� :" + afternoon);
		System.out.println("�ñ� :" + pay);
		System.out.println("���Ը� :" + shopName);
		System.out.println("�˹ٻ��̸� :" + name);
	}
}