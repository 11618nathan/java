
public class Pride  // kia !!  
{	// final == const  --> ���ȭ !! 
	// ��� �ʵ� : �ʱ�ȭ ���� ���� ���� �����ų�� ���� �ǵ� !! 
	
	// ����(static) �ʵ� :  ��ü����̿��� ���� ���� ���� �ʵ� !! 
	// �ϳ��� Ŭ�����κ��� ��������� ��� ��ü���� ���� ���� ���� 
	// �����ؼ� �Բ� ����ؾ��ϴ� �ʵ� !! 
	// --> Ŭ������ 1���� �����ȴ� !! 
	
	private int carNo; 
	private int curSpeed;  // ���� �ӵ� !! 
	private static final int maxSpeed = 180; // �ִ� �ӵ� !! 
	private int price;	   // ���� 
	private static final int cc = 1400;		   // ��ⷮ 
	private int curFuel;    // ���� ���ᷮ 
	private static final int maxFuel = 50;	   // �ִ� ���ᷮ !! 
	
	public Pride(int no) 
	{
		carNo = no; 
		curSpeed = 0; 
		price *=1.1; 
		curFuel = maxFuel/2;
	}
	
}
