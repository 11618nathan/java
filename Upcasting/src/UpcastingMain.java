import java.util.Scanner;

//====================================================
//  Upcasting  
//  Downcasting 
//====================================================
//	--> ������ ���� !! 
//====================================================
//  Upcasting  !! 
//	up + casting = upcasting !! 
//  casting ==> ����ȯ !! 
//	���� ����ȯ : ������ �������� Ÿ���� ���� ?? 
//====================================================
//   int a = (int)3.14;  double --> int 
//====================================================
//  �ڽİ�ü�� �θ��� Ÿ������ ���� ���� 
//    
//  ��Ӱ��迡�� �θ�Ŭ������ Ÿ���� �ڽ�Ŭ������ ��ü ���� ���� 

class Animal 
{
	private int age; 
	
	public void feeding() {}
}

class Tiger extends Animal
{
	@Override
	public void feeding(){ System.out.println("ȣ���� :  �߰��"); }
}

class Lion extends Animal
{
	@Override 
	public void feeding() { System.out.println("���� : ����");  }
	
}

public class UpcastingMain {
	public static void main(String[] args) {
	//  �Ϲ����� ��ü ���� �� ���� !! 
	//	Tiger tiger =  new Tiger(); 
	//	tiger.feeding();
	//  Upcasting�� �̿��� ��ü�� ������ ��� !! 
		Animal [] Zoo =  new Animal[5]; 
		Scanner scan =  new Scanner(System.in);
		int value;
		for (int i = 0; i < Zoo.length; i++) {
			System.out.println("1. ȣ����  2. ���� ");
			value = scan.nextInt(); 
			if( value == 1) 
				Zoo[i] = new Tiger();
			else 
				Zoo[i] =  new Lion();

		}
		
		// feeding !! 
		for(Animal ani : Zoo)
		{
			ani.feeding();
		}
		

	}

}
















