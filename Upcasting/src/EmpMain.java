import java.util.Scanner;

// �߻� Ŭ���� !! 
// - 1�� �̻��� �߻� �޼ҵ带 ���� Ŭ���� !! 
// - ���� ��ü ���� �Ұ��� !! 
// - ��Ӹ��� ���ؼ� �����ϴ� Ŭ���� !! 
abstract class Emp 
{
	private int empNo; 
	
	public int getEmpNo() {return empNo;}
	
	public Emp() {       }
	public Emp(int empNo) { this.empNo = empNo;} 
	// �߻�޽��� !! 
	//	 - > �θ𿡼� �����Ҽ� ������.. �θ��� �ڽ��� �ݵ�� ������� �Լ� !!
	//   -->  �ڽ�Ŭ�������� �ݵ�� ������  
	public abstract void getSalary();
}

class NormalEmp extends Emp 
{
	private int salary; // ���� !! 

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

class Company // ��� ���� ( ȸ��) 
{
	private static int gEmpno = 1;
	private  Emp [] emps; 
	private Scanner scan = new Scanner(System.in);
	
	public Company() 
	{
		emps =  new Emp[10];
	}
	// 1) ��� �߰� 
	public void addEmp()
	{
		Emp newEmp = null;
		System.out.println( "1.  �Ϲ� ���  2.  �˹� "); 
		int input =  scan.nextInt(); 
		if( input == 1) 
		{//�Ϲ� ��� �߰� 
			int sal  =  scan.nextInt();
			newEmp =  new NormalEmp(++gEmpno , sal );
		}
		else if( input == 2 )
		{// �˹� ��� �߰� !!
			int time = scan.nextInt();
			int wage = scan.nextInt(); 
			
			newEmp =  new PartTimeEmp(++gEmpno, time, wage );
		}
		else 
		{
			System.out.println("���� !! ");
		}
		// Emps�迭�� null�ΰ��� ã�Ƽ� ���� !! 
		for (int i = 0; i < emps.length; i++) {
			if( emps[i] == null) 
			{
				emps[i] = newEmp;
				break;
			}
		}
	}	
	// 2) ���ް�� 
	public void showEmpSalary() 
	{
		for (Emp emp : emps) {
			if( emp != null)
				emp.getSalary();
		}
		
	}
	
	
	/* Upcating ���� ���� ������ ��� !! 
	private NormalEmp []   NormalEmps;
	private PartTimeEmp[]  PartTimeEmps;
	
	public Company() 
	{
		NormalEmps    = new NormalEmp[10];
		PartTimeEmps =  new PartTimeEmp[10];
	}
	
	public void monthPay() 
	{
		// �Ϲ� ��� �����ֱ� !!
		for (NormalEmp normalEmp : NormalEmps) {
			normalEmp.getSalary();
		}
		// �˹� ��� �����ֱ� !! 
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
















