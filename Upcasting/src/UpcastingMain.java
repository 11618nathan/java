import java.util.Scanner;

//====================================================
//  Upcasting  
//  Downcasting 
//====================================================
//	--> 다형성 구현 !! 
//====================================================
//  Upcasting  !! 
//	up + casting = upcasting !! 
//  casting ==> 형변환 !! 
//	상향 형변환 : 상위의 개념으로 타입을 변경 ?? 
//====================================================
//   int a = (int)3.14;  double --> int 
//====================================================
//  자식객체를 부모의 타입으로 찹조 가능 
//    
//  상속관계에서 부모클래스의 타입이 자식클래스의 객체 참조 가능 

class Animal 
{
	private int age; 
	
	public void feeding() {}
}

class Tiger extends Animal
{
	@Override
	public void feeding(){ System.out.println("호랑이 :  닭고기"); }
}

class Lion extends Animal
{
	@Override 
	public void feeding() { System.out.println("사자 : 양고기");  }
	
}

public class UpcastingMain {
	public static void main(String[] args) {
	//  일반적인 객체 생성 및 참조 !! 
	//	Tiger tiger =  new Tiger(); 
	//	tiger.feeding();
	//  Upcasting을 이용한 객체의 참조와 사용 !! 
		Animal [] Zoo =  new Animal[5]; 
		Scanner scan =  new Scanner(System.in);
		int value;
		for (int i = 0; i < Zoo.length; i++) {
			System.out.println("1. 호랑이  2. 사자 ");
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
















