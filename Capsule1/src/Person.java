// ���� Ŭ���� !! 
//  1) �ʵ� --> getter/setter --> ������ -->�޼ҵ��... 
// - �¶��μ���
//======================================================
// ����(��ǰ)
// ȸ�� 
// �ֹ�
//======================================================

class Book 
{
	// �ʵ� ( �Ӽ�)   --> private 
	private String bookTitle;   // ���� 
	private String bookWriter; // ���� 
	private int     price;		// ���� 
	// �޼ҵ� ( �ൿ )
	// ������ �ۼ� !! 
	// 1) Ŭ������ �̸��� �����ϴ� !! 
	// 2) ������ ���� !! 
	// 3) �Ϲ����� ��� public���� �ۼ��� �ؾ߸� ��ü ������ ���� !
	//   -->  Ư���� ��� ( �̱��� ) �� �����ϰ�� public 
	// 4) ���α׷��Ӱ� �����ڸ� ������ ������ java���� �ڵ����� 
	//    �ƿ� ���� ����� �ϴ� �����ڸ� �ڵ����� ����� �ش� !! 
	//   �⺻ ������ ( ����Ʈ ������) 
	// 5)  ��ü�� �پ��� ������ ���ؼ� �޼ҵ� �����ε��� ���� !! 
	//	- �޼��� �����ε� !! 
	//	--> ���� �̸��� �޼ҵ�(�Լ�)�� ������ �ۼ��� ���� !! 
	//  --> ��, �Ű����� ���� ( Ÿ��, ����)�� �޶�� �Ѵ� !! 
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

	// Book�� �ൿ��.... 
	
	
	
	
	
	
}// ��ü ���� 
  Book  b1 =  new Book(); 
  b1.bookTitle = "�ﱹ��";
  


// �̸�, ����, ���








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
	// ������ 
	//  -  ��ü�� �����ɶ� �ڵ����� ȣ��Ǿ ��ü�� �ʵ��� �ʱ�ȭ��
	//     ����ϴ� Ư���� ������ �޼ҵ� 
	// �������� Ư¡ !! 
	// 1) Ŭ������ �̸��� �����ϴ� !!  
	// 2) ������ ���� �޼ҵ� !! 
	// 3) �Ϲ����� ���� public�̿��� ��ü ������ ���� !! 
	//	  - �����Ѱ�� private, protected ��� ==>  �̱��� !!
	// 4) ���� ���α׷��Ӱ� �����ڸ� �������� ������ 
	//    �ڹ� �����Ϸ��� �ڵ����� �����ڸ� ���� - �⺻(����Ʈ)������ 
	// 5)  �޼ҵ� �����ε� !! 
	// --> �����̸��� �޼ҵ尡 ������ ���� !! 
	// --> ��, �Ű������� ������ Ÿ���� �޶�� �Ѵ�! 
	
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
		name = "�ڿ�";
		age = 20; 
	}
}




