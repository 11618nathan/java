package parking;

import java.util.Calendar;
import java.util.Date;


public class CarInfo
{
	private int carNo;	//차량번호 
	private Date inputTime; // 입차 시간 !! 
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
		System.out.println("차량번호: " + carNo + 
			"입차시간 : " + inputTime.toLocaleString());
	}
}











