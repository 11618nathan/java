
public class Member 
{
	private String id; 
	private String pw; 
	private String phone; 
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	// ����Ʈ ������ !!
	public Member() {} 
	
	public Member(String newId, String newPw, String newPhone)
	{
		id= newId;
		pw = newPw; 
		phone = newPhone;
	}

}
