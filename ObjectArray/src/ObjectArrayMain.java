//===========================================
//  java ��ü �迭 !!
//	--> ��ü�� ������ ���ִ� ���� !! 
//	--> C��� == ����ü �迭 
//===========================================
class Member // ȸ�� !! 
{
	private String memId; 
	private String memPw;
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		if( memPw.length() >= 6 && memPw.length() <=10)
			this.memPw = memPw;
	}
	public String getMemId() {
		return memId;
	} 
	
	public  Member()
	{
		System.out.println("Member() ȣ�� ");
	}
	public  Member(String memId, String memPw)
	{
		this.memId = memId;
		this.memPw = memPw;
		System.out.println("Member(String memId, String memPw) ȣ��");
		
	} 
	
	public void show() 
	{
		System.out.println(
		"id : " + this.memId + " pw :" + this.memPw);
	}

}

public class ObjectArrayMain {

	public static void main(String[] args) {
	//	Member newMember; //? 
	//	newMember = new Member(); // �⺻ ������ !! 
	//  - �������� ��ü�� ���� !! 
	 Member []  Members;  //?? Member��ü �?? 0�� 
	 // Member��ü�� �����Ҽ� �ִ� ���������� 5�� !! 
	 Members = new Member[5]; //?? Member ��ü �??
	 // ��� ��ü ���� !! 
	 Members[0] = new Member("bit","123456"); 
	 Members[1] = new Member("bit","123456"); 
	 Members[2] = new Member("bit","123456"); 
	 Members[3] = new Member("bit","123456"); 
	 Members[4] = new Member("bit","123456"); 
	 // ��� !!  foreach :  �迭, �÷��� !! 
	// for( Member m : Members)
	// {
	//	 m.show(); 
	// }
	 
	 for( int i = 0; i< Members.length; i++) 
	 {
		 Members[i].show();
	 }
	 
	 
	 
	 
	 
	}

}










