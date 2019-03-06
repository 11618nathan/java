package 상속3;

// 전화 !! 
class Phone 
{
	private String phoneNo; // 전화번호 
	private int phoneBill;	 // 전화요금 
	public int getPhoneBill() {
		return phoneBill;
	}
	public void setPhoneBill(int phoneBill) {
		this.phoneBill = phoneBill;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public Phone() 
	{
		this( "0000" ); // 같은 클래스의 다른 생성자를 호출 
	} 
	public Phone( String phoneNo  )
	{
		this.phoneNo = phoneNo; 
		this.phoneBill = 5000; // 기본 요금 !!
		
	}
	public void send( String phoneNo ) 
	{
		this.phoneBill++;
	}
}
//
final class  SmartPhone extends Phone 
{
	private int usimId;  // 유심 아이디  
	private int dataBill;	// 데이타 요금 
	public int getDataBill() {
		return dataBill;
	}
	public void setDataBill(int dataBill) {
		this.dataBill = dataBill;
	}
	public int getUsimId() {
		return usimId;
	}
	
	public SmartPhone() {} 
	public SmartPhone(String phoneNo, int usimId)  
	{
		super(phoneNo);
		this.usimId  = usimId; 
		this.dataBill = 0;
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone p =  new SmartPhone( "4885", 1 );
		System.out.println(  p.getPhoneNo());
	}

}






