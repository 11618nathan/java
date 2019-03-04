//=============================================
// 3가지 선택 !! 
//=============================================
// 1) 전자제품이라는 클래스를 상속받는..
//   TV ,  에어컨, 컴퓨터 클래스를 작성하세요. 
// 2) 스타크래프트의 마린, 탱크, 레이스를 구현하세요. 
// 3) 전화클래스를 상속받아서. 
//	  - 집전화, 스마트폰을 구현하세요. 
// 4) 스포츠라는 클래스를 상속받아서.. 
//		축구, 테니스, 탁구를 구현하세요. 
// 5) 자동차 클래스를 상속받아서. 
//		경차 ,  택시,  버스를 구현하세요. 
//=============================================

package 상속1;
// 일반화의 개념 !! 

// 사원 관리 프로그램 !! 
//  정규직, 비정규직, 임원 !! 
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

// 일반 사원 
class NormalEmp extends Emp
{
	private int empSalary;	 // 연봉 !! 
	
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
// 알바  
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
