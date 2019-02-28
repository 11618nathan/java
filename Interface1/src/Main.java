//=====================================================
//  -
//=====================================================


























//================================================
// 1) ������ !!   
//================================================

//================================================
//  �������̽� ( interface )
//	 ex)  -  UI ( User Interface)  
//		  -   ���ں�ǰ�� ������ 
//	  -  Ŭ������ Ŭ���� ���̿��� ���ü� �ִ� ����... 
//	  -  ��ü�� ��ü�� �������̽��� ���ؼ��� ���� ���� !! 
//	  -  ��ü������ ���յ��� ���� !! 
//	  - Ư�� Ŭ������ �ٸ� Ŭ������ �ڵ忡 ���� ���� ���� ���ϵ��� �Ѵ�.  
//================================================
//  ��ȭ ,  mp3 , ī�޶�, ���� , �׺�,  ���� !! 
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
// �������̽� 
// - �ʵ尡 �������� �ʰ�.. �߻� �޼��常 �����ϴ� Ư���� ������ Ŭ���� !! 
// - �ൿ�� ���ɼ����� ��ӽ����ش� !!
// - public abstract �޼��常 ���� �����ϴ� !! 
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
	public void mp3Play()     {} // ����  
	public void accounting() {}  // ����
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
	// ����Ʈ���� ���� �޾Ƽ� ���� ���� !! 
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












