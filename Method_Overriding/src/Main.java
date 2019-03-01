//===============================================
//  �ݰ����б��л��� 
//  ��ǻ�� �л��� �ұ��а� �л��� �����Ѵ�.. 
//  �Ѵ� ���θ� �ϴµ�... ���� �Ұ���ο� �ڵ��� �Ѵ�. 
//===============================================
//  �׸��ǿ��� �׸��� �ִ� ������... 
//  �簢��, ��, �����̴�..  
//===============================================
//  CGV���忡�� 
//  VIP ȸ�� ��ȸ���� ���Ÿ� �Ҽ� �ְ�... 
//  - VIP�� 10%�� ���ΰ� 20%�� ���ϸ��� ���� 
//	- ȸ���� 10%�� ���ϸ��� ���� 
//	- ��ȸ���� ©����.
//===============================================
//  ����������... 
//  -  ���ĸ�, ������, ������(����)�� �ִ�... 
//===============================================




//===============================================
// Method Overriding ( �޼ҵ� ������) 
//	 - Overloading VS Overriding !! 
//     - �����ε� : ���� �̸��� �޼ҵ带 ������ ����
//		  		   ��, �Ű���������(����,Ÿ��)�� �޶���Ѵ�. 
//	 - Overriding ( ������) 
//		- �θ�Ŭ�������� ���ǵ� �޼ҵ带 �ڽ�Ŭ�������� ���Ӱ� ���� !!
//		- �θ��� �ൿ�� �״�� �������� �ʰ� �ڽ��� �ൿ�� �ٽ� ���� !! 
//		- �ڽ��� �ൿ�� �ڽ�Ŭ�������� ��üȭ !! 
//===============================================
class Animal 
{
	private int age; 
	
	public void Crying() { System.out.println(" �ϰ� ���");}
}
class Cat extends Animal
{
	public void Crying() { 
		System.out.println("�߿�~~"); 
		super.Crying();  //  
	}
}
//=====================================================
class Emp 
{
	private int empNo; 
	
	public void work() {System.out.println("������ ���� �մϴ�.")} 
	public void getSalary(){}
}
class NormalEmp extends Emp 
{
	private int salary;	// ���� !! 
	
	public void work() 
	{ 
		System.out.print("�� 40�ð� ���� "); 
		super.work(); 
	}
	public void getSalary(){System.out.println(salary/13); }
	
}
class PartTimeEmp extends Emp 
{	
	private int time; 
	private int wage;
	
	public void work() 
	{
		System.out.println(time + "�ð� ����");
		super.work();
	}
	public void getSalary(){System.out.println( time * wage );}
	
	
}

class Unit
{
	private int hp; //ü��!! 
	private int x;
	private int y;	
	
	public void move( int newX, int newY ) 
	{
		x = newX;
		y = newY;
	} 
	public void attack() {} //?? 
}

class Marin extends Unit
{
	public void move(int newX,  int newY)
	{
		System.out.println("GOGOGO~~"); 
		super.move(newX, newY);
	}
	public void attack() {System.out.println("������������");} 
	
}

class Tank extends Unit
{
	public boolean bSiege = false;
	
	@Override
	public void move( int newX,  int newY)
	{
		System.out.println("���� ~~ ");
		super.move(newX, newY);
	}
	@Override
	public void attack() 
	{
		if(bSiege)
			System.out.println("��~~ 3�ʴ��  �� ~ 3�ʴ�� ~");
		else 
			System.out.println("������~~~ ������������~!");
	}
}	








public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.Crying();
	}

}










