//=====================================================
//  -
//=====================================================


























//================================================
// 1) 수족관 !!   
//================================================

//================================================
//  인터페이스 ( interface )
//	 ex)  -  UI ( User Interface)  
//		  -   전자부품의 연결점 
//	  -  클래스와 클래스 사이에서 나올수 있는 접점... 
//	  -  객체와 객체는 인터페이스를 통해서만 서로 접근 !! 
//	  -  객체사이의 겹합도의 문제 !! 
//	  - 특정 클래스가 다른 클래스의 코드에 직접 접근 하지 못하도록 한다.  
//================================================
//  전화 ,  mp3 , 카메라, 결제 , 네비,  등등등 !! 
abstract class Phone 
{
	private String phoneNo;

	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public abstract void send();
	public abstract void end();	
}
// 인터페이스 
// - 필드가 존재하지 않고.. 추상 메서드만 존재하는 특수한 형태의 클래스 !! 
// - 행동의 가능성만을 상속시켜준다 !!
// - public abstract 메서드만 존재 가능하다 !! 
interface ICamera
{
	public abstract void Focus();
	public abstract void Shot(); 
	public abstract void Save(); 
	//private  abstract void ZIP();
}
class SmartPhone  extends Phone implements ICamera
{

	public SmartPhone(String phoneNo) {
		super(phoneNo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}
	public void mp3Play()     {} // 실행  
	public void accounting() {}  // 결제
	@Override
	public void Focus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Shot() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Save() {
		// TODO Auto-generated method stub
		
	}
}

class NoteBook  implements ICamera
{

	@Override
	public void Focus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Shot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Main {
	// 스마트폰을 전달 받아서 사진 보기 !! 
	public static void viewCamera(ICamera sp) 
	{
		sp.Focus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp =  new SmartPhone( "010"); 
		viewCamera( sp );
		NoteBook b =  new NoteBook();
		viewCamera(b);
	}

}












