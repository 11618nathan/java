//============================================
// 상속 ( extends : 확장 ) 
//	 - 확장 :  기존 클래스로부터 물려 받아서 새로운 클래스를 작성 !!
//	 - 일반화 :  여러개의 클래스사이의 공통적인 부분을 1개로 
//	   			 만들어서 일반화 시키는 개념 !! 
// 상속 관계 !! 
//============================================
//  is -  a관계 
//============================================
//	~~은 ~~이다.. 
//  ex) 버스는 자동차 이다.  마린은 유닛이다. 
//		 고양이는 동물이다.  학생은 사람이다. 
//============================================
//  has - a관계 
//============================================
//	~~은 ~~을 갖고 있다. 
//	ex) 자동차는 엔진을 갖고있다.  스마트폰은 카메라기능을 갖고 있다. 
//		 군인은 총을 갖고 있다.   컴퓨터는 마우스를 갖고 있다. 
//============================================


package 상속1;
// 부모클래스 : 상속을 시켜주는 상위의 클래스 !! 
// ->상위, 기본, 기반, base, super,  classic  
class Animal  // 모든 동물에 공통적인 속성, 행동 !! 
{
	private int age; // 나이 !! 
	
	public int getAge() { return age;}
	// 생성자  
	public Animal() { age = 1; }
	// 행동을... 
	public void move() 	 {}
	public void feeding() {} 
}
// 자식 클래스 : 다른 클래스로부터 상속을 받는 클래스 !! 
// 하위 , 파생, 확장
class Cat  extends Animal
{	
	private int tail; 
	
	private void Crying() { System.out.println("야옹"); }
	
}
// 자식클래스 
class Egles extends Animal 
{
	
	public void flying() { System.out.println("훨~ 훨~");}
	
}

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.feeding();
		cat.move();
	}

}









