// ������ �߻�ȭ�ϰ� Ŭ������ �ۼ��ϼ���. (3~4) 

// 1.  ��Ÿũ����Ʈ�� ���� !

class Marin
{
	public int hp; // ü�� 
	public int att; // ���ݷ� 
	public int def; // ���� 
	public int price;// 50�� 
	public int x; 	// ��ǥ !! 
	public int y; 
	
	public void Move(){} //�̵� 
	public void Attack(){} // ���� 
	public void Patroll(){}  //����  
	public void Hold(){} 	// Ȧ�� 
	public void Stop(){}   // ���� 
}


// 2.  ����� ������ ���� 

class City
{
	public String cityName; //�����̸�  
	public int price;	      	// ���� 
	public int pos;		    // ��ġ !
	public int fee;			// ����� !! 
	public boolean hotel;
	public boolean villa;	 
	public String player;	// ���� !! 
	
	public void buildingHotel() {} // �ǹ�
	public void buildingVilla() {} // �ǹ�
	
	
}






// 3.  īƮ���̴��� ī�� 
// 4.  ��Ʈ������ ��ũ 
// 5.  �������� �ϳ��� ����
// 6.  ��Ʈ������ ���� 
// 7.  ����ã���� �� 
// 8.  ����������� ĳ���� 


// ��� !! 
//  �Ӽ� : �����ȣ, �̸� , ���� , ����  
//  �ൿ : ���ϴ�. �����. ȸ��. ��� ... 

public class Emp 
{
	// �ʵ� 
	public int empNo;
	public String empName; 
	public int empSalary; 
	// �޼ҵ�  
	public void work() {} // ���ϴ�. 
	public void getSalary(){} // ���� �޴�.
	
}
