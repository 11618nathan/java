//===========================================
//  java 객체 배열 !!
//	--> 객체가 여러개 모여있는 집합 !! 
//	--> C언어 == 구조체 배열 
//===========================================
class Member // 회원 !! 
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
		System.out.println("Member() 호출 ");
	}
	public  Member(String memId, String memPw)
	{
		this.memId = memId;
		this.memPw = memPw;
		System.out.println("Member(String memId, String memPw) 호출");
		
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
	//	newMember = new Member(); // 기본 생성자 !! 
	//  - 여러개의 객체를 관리 !! 
	 Member []  Members;  //?? Member객체 몇개?? 0개 
	 // Member객체를 참조할수 있는 참조변수가 5개 !! 
	 Members = new Member[5]; //?? Member 객체 몇개??
	 // 멤버 객체 생성 !! 
	 Members[0] = new Member("bit","123456"); 
	 Members[1] = new Member("bit","123456"); 
	 Members[2] = new Member("bit","123456"); 
	 Members[3] = new Member("bit","123456"); 
	 Members[4] = new Member("bit","123456"); 
	 // 출력 !!  foreach :  배열, 컬렉션 !! 
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










