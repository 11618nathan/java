package parking;

import java.util.Calendar;
import java.util.Date;


public class CarInfo
{
	private int carNo;	//������ȣ 
	private Date inputTime; // ���� �ð� !! 
	private String carGrade;
	
	public int getCarNo() {
		return carNo;
	}
	public Date getInputTime() {
		return inputTime;
	}
	public String getCarGrade() {
		return carGrade;
	}
	
	public CarInfo() {}
	public CarInfo( int carNo , String carGrade ) 
	{
		this.carNo = carNo; 
		this.carGrade = carGrade;
		
		inputTime = Calendar.getInstance().getTime();
		System.out.println( inputTime.toString());
			
	}
	
	public void show() 
	{
		System.out.println("������ȣ: " + carNo + 
			"�����ð� : " + inputTime.toLocaleString());
	}
}











