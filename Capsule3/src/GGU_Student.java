









public class GGU_Student 
{ 
	private String sNo; 		// 학번 
	private String sName;	// 이름 
	private int sGrade;		// 학년 
	private String sMajor;	// 전공 
	private static String presidentName = "한광수"; //  총장님 !! 
	private final static String schoolAnniversary = "10월 10일"; 
	
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
		presidentName  = "한광수"; 
	}
	
	public GGU_Student(){} 
	public GGU_Student(String no , String name , int grade, String Major)
	{
		sNo = no; 
		sName = name; 
		sGrade = grade;
		sMajor = Major;
	}
	
	// 메소드들.... 
	public void study()   {}
	public void exm()     {} 
	public void vacation(){} 
	public void newYear(){ sGrade++; }
	
	
}












