//=============================================
// 3���� ���� !! 
//=============================================
// 1) ������ǰ�̶�� Ŭ������ ��ӹ޴�..
//   TV ,  ������, ��ǻ�� Ŭ������ �ۼ��ϼ���. 
// 2) ��Ÿũ����Ʈ�� ����, ��ũ, ���̽��� �����ϼ���. 
// 3) ��ȭŬ������ ��ӹ޾Ƽ�. 
//	  - ����ȭ, ����Ʈ���� �����ϼ���. 
// 4) ��������� Ŭ������ ��ӹ޾Ƽ�.. 
//		�౸, �״Ͻ�, Ź���� �����ϼ���. 
// 5) �ڵ��� Ŭ������ ��ӹ޾Ƽ�. 
//		���� ,  �ý�,  ������ �����ϼ���. 
//=============================================

package ���1;
// �Ϲ�ȭ�� ���� !! 

// ��� ���� ���α׷� !! 
//  ������, ��������, �ӿ� !! 
class Emp 
{
	private int empNo;	
	private String hireDate;
	public int getEmpNo() {
		return empNo;
	}
	public String getHireDate() {
		return hireDate;
	}
	public Emp(){}
	public Emp(int empNo) {
		
		this.empNo = empNo;
	} 
}

// �Ϲ� ��� 
class NormalEmp extends Emp
{
	private int empSalary;	 // ���� !! 
	
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public NormalEmp(int empNo, int empSalary)
	{
		
		this.empSalary = empSalary;
	}
}	
// �˹�  
class PartTimeEmp extends Emp
{
	public PartTimeEmp(int empNo, int pay) {
		
		this.empNo = empNo;
		this.pay = pay;
	}

	private int pay; 
	private int workTime;
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	

}











public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
