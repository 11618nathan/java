import java.util.Scanner;

// 추상 클래스 !! 
// - 1개 이상의 추상 메소드를 갖는 클래스 !! 
// - 직접 객체 생성 불가능 !! 
// - 상속만을 위해서 존재하는 클래스 !! 
abstract class Emp 
{
	private int empNo; 
	
	public int getEmpNo() {return empNo;}
	
	public Emp() {       }
	public Emp(int empNo) { this.empNo = empNo;} 
	// 추상메스드 !! 
	//	 - > 부모에서 구현할순 없지만.. 부모의 자식을 반드시 갖어야할 함수 !!
	//   -->  자식클래스에서 반드시 재정의  
	public abstract void getSalary();
}

class NormalEmp extends Emp 
{
	private int salary; // 연봉 !! 

	public NormalEmp( int empNo, int salary )
	{
		super(empNo);
		this.salary = salary;
	}
	public void getSalary() { System.out.println( "NormalEmp :" + salary/13); }
}
class PartTimeEmp extends Emp
{
	private int time; 
	private int wage;
	public PartTimeEmp(int empNo ,  int time,  int wage) {
		super(empNo);
		this.time = time;
		this.wage = wage; 
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getSalary() {
		System.out.println( "PartTime: " + time * wage );
		
	}	
}

class Company // 사원 관리 ( 회사) 
{
	private static int gEmpno = 1;
	private  Emp [] emps; 
	private Scanner scan = new Scanner(System.in);
	
	public Company() 
	{
		emps =  new Emp[10];
	}
	// 1) 사원 추가 
	public void addEmp()
	{
		Emp newEmp = null;
		System.out.println( "1.  일반 사원  2.  알바 "); 
		int input =  scan.nextInt(); 
		if( input == 1) 
		{//일반 사원 추가 
			int sal  =  scan.nextInt();
			newEmp =  new NormalEmp(++gEmpno , sal );
		}
		else if( input == 2 )
		{// 알바 사원 추가 !!
			int time = scan.nextInt();
			int wage = scan.nextInt(); 
			
			newEmp =  new PartTimeEmp(++gEmpno, time, wage );
		}
		else 
		{
			System.out.println("오류 !! ");
		}
		// Emps배열에 null인곳을 찾아서 삽입 !! 
		for (int i = 0; i < emps.length; i++) {
			if( emps[i] == null) 
			{
				emps[i] = newEmp;
				break;
			}
		}
	}	
	// 2) 월급계산 
	public void showEmpSalary() 
	{
		for (Emp emp : emps) {
			if( emp != null)
				emp.getSalary();
		}
		
	}
	
	
	/* Upcating 개념 없이 구현한 경우 !! 
	private NormalEmp []   NormalEmps;
	private PartTimeEmp[]  PartTimeEmps;
	
	public Company() 
	{
		NormalEmps    = new NormalEmp[10];
		PartTimeEmps =  new PartTimeEmp[10];
	}
	
	public void monthPay() 
	{
		// 일반 사원 월급주기 !!
		for (NormalEmp normalEmp : NormalEmps) {
			normalEmp.getSalary();
		}
		// 알바 사원 월급주기 !! 
		for( PartTimeEmp pEmp :  PartTimeEmps)
		{
			pEmp.getSalary();
		}
			
	}
	*/
	
}

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company =  new Company(); 
		company.addEmp();
		company.showEmpSalary();
		company.addEmp();
		company.showEmpSalary();
		company.addEmp();
		company.showEmpSalary();
		company.addEmp();
		company.showEmpSalary();
		company.addEmp();
		company.showEmpSalary();
	}

}
















