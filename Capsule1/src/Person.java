// 다음 클래스 !! 
//  1) 필드 --> getter/setter --> 생성자 -->메소드들... 
// - 온라인서점
//======================================================
// 도서(상품)
// 회원 
// 주문
//======================================================

class Book 
{
	// 필드 ( 속성)   --> private 
	private String bookTitle;   // 제목 
	private String bookWriter; // 저자 
	private int     price;		// 가격 
	// 메소드 ( 행동 )
	// 생성자 작성 !! 
	// 1) 클래스와 이름이 동일하다 !! 
	// 2) 리턴이 없다 !! 
	// 3) 일반적인 경우 public으로 작성을 해야만 객체 생성이 가능 !
	//   -->  특수한 경우 ( 싱글턴 ) 를 제외하고는 public 
	// 4) 프로그래머가 생성자를 만들지 않으면 java에서 자동으로 
	//    아와 같은 기능을 하는 생성자를 자동으로 만들어 준다 !! 
	//   기본 생성자 ( 디폴트 생성자) 
	// 5)  객체의 다양한 생성을 위해서 메소드 오버로딩을 지원 !! 
	//	- 메서드 오버로딩 !! 
	//	--> 같은 이름의 메소드(함수)를 여러개 작성이 가능 !! 
	//  --> 단, 매개변수 정보 ( 타입, 갯수)가 달라야 한다 !! 
	public Book() 
	{
		bookTitle = "";
		bookWriter = "";
		price = 0;
	}
	public Book( String title,  String writer , int p )
	{
		bookTitle = title; 
		bookWriter = writer; 
		price = p;
	}

	public String getTitle() {  return bookTitle;   } 
	public String getWriter(){ return bookWriter; }
	public int     getPrice()  { return price;       }
	public void  setPrice( int newPrice )
	{
		if( newPrice > 0 )
		    price = newPrice; 
	}

	// Book의 행동들.... 
	
	
	
	
	
	
}// 객체 생성 
  Book  b1 =  new Book(); 
  b1.bookTitle = "삼국지";
  


// 이름, 나이, 재산








public class Person 
{ 
	private String name; 
	private int age;
	// getter/setter 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	} 
	// method 
	// 생성자 
	//  -  객체가 생성될때 자동으로 호출되어서 객체의 필드의 초기화를
	//     담당하는 특수한 형테의 메소드 
	// 생성자의 특징 !! 
	// 1) 클래스와 이름이 동일하다 !!  
	// 2) 리턴이 없는 메소드 !! 
	// 3) 일반적인 경우는 public이여야 객체 생성이 가능 !! 
	//	  - 툭수한경우 private, protected 사용 ==>  싱글턴 !!
	// 4) 만약 프로그래머가 생성자를 구현하지 않으면 
	//    자바 컴파일러가 자동으로 생성자를 구현 - 기본(디폴트)생성자 
	// 5)  메소드 오버로딩 !! 
	// --> 같은이름의 메소드가 여러개 존재 !! 
	// --> 단, 매개변수의 갯수나 타입이 달라야 한다! 
	
	public Person()
	{
		name = "";
		age   = 1;
	}
	public Person( String newName, int newAge)
	{
		name = newName;
		age   = newAge;
	}
	
	
	
	
	
	
	
	
	public void Create() 
	{
		name = "자연";
		age = 20; 
	}
}




