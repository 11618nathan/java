









public class GGU_Student 
{ 
	private String sNo; 		// �й� 
	private String sName;	// �̸� 
	private int sGrade;		// �г� 
	private String sMajor;	// ���� 
	private static String presidentName = "�ѱ���"; //  ����� !! 
	private final static String schoolAnniversary = "10�� 10��"; 
	
	public int getsGrade() {
		return sGrade;
	}

	public void setsGrade(int sGrade) {
		this.sGrade = sGrade;
	}

	public String getsMajor() {
		return sMajor;
	}

	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}

	public static String getPresidentName() {
		return presidentName;
	}

	public static void setPresidentName(String presidentName) {
		GGU_Student.presidentName = presidentName;
	}

	public String getsNo() {
		return sNo;
	}

	public static String getSchoolanniversary() {
		return schoolAnniversary;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	static 
	{
		presidentName  = "�ѱ���"; 
	}
	
	public GGU_Student(){} 
	public GGU_Student(String no , String name , int grade, String Major)
	{
		sNo = no; 
		sName = name; 
		sGrade = grade;
		sMajor = Major;
	}
	
	// �޼ҵ��.... 
	public void study()   {}
	public void exm()     {} 
	public void vacation(){} 
	public void newYear(){ sGrade++; }
	
	
}












