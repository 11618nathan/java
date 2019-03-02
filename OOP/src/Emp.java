// 다음을 추상화하고 클래스로 작성하세요. (3~4) 

// 1.  스타크래프트의 마린 !

class Marin
{
	public int hp; // 체력 
	public int att; // 공격력 
	public int def; // 방어력 
	public int price;// 50원 
	public int x; 	// 좌표 !! 
	public int y; 
	
	public void Move(){} //이동 
	public void Attack(){} // 공격 
	public void Patroll(){}  //정찰  
	public void Hold(){} 	// 홀드 
	public void Stop(){}   // 정지 
}


// 2.  모두의 마블의 도시 

class City
{
	public String cityName; //도시이름  
	public int price;	      	// 가격 
	public int pos;		    // 위치 !
	public int fee;			// 통행료 !! 
	public boolean hotel;
	public boolean villa;	 
	public String player;	// 주인 !! 
	
	public void buildingHotel() {} // 건물
	public void buildingVilla() {} // 건물
	
	
}






// 3.  카트라이더의 카드 
// 4.  포트리스의 탱크 
// 5.  에니팡의 하나의 동물
// 6.  테트리스의 도형 
// 7.  지뢰찾기의 맵 
// 8.  스페셜포스의 캐릭터 


// 사원 !! 
//  속성 : 사원번호, 이름 , 연봉 , 직급  
//  행동 : 일하다. 출퇴근. 회식. 등등 ... 

public class Emp 
{
	// 필드 
	public int empNo;
	public String empName; 
	public int empSalary; 
	// 메소드  
	public void work() {} // 일하다. 
	public void getSalary(){} // 월급 받다.
	
}
