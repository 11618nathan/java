package ���3;

// ��ȭ !! 
class Phone 
{
	private String phoneNo; // ��ȭ��ȣ 
	private int phoneBill;	 // ��ȭ��� 
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
		this( "0000" ); // ���� Ŭ������ �ٸ� �����ڸ� ȣ�� 
	} 
	public Phone( String phoneNo  )
	{
		this.phoneNo = phoneNo; 
		this.phoneBill = 5000; // �⺻ ��� !!
		
	}
	public void send( String phoneNo ) 
	{
		this.phoneBill++;
	}
}
//
final class  SmartPhone extends Phone 
{
	private int usimId;  // ���� ���̵�  
	private int dataBill;	// ����Ÿ ��� 
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






