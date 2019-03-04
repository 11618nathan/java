abstract class Unit 
{
	private int hp; 
	
	public abstract void move();
	public abstract void attack();
}

class Marin extends Unit
{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("GOGOGO");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("µûµûµûµûµûµû");
	}
}

class Tank extends Unit
{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("¿¹½ä~~");
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("ÅüÅüÅü~~ÅüÅü ~~");
	}
}

class battleCruzer extends Unit
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("¾Å~~~~~~");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("»È »È »È »È !!!");
	}
}

class Camp
{
	private Unit [] Units =  new Unit[12];
	
	public void move()
	{
		for (Unit unit : Units) {
			unit.move(); //?? 
		}
	}
	public void attack()
	{
		for (Unit unit : Units) {
			unit.attack(); //?? 
		}
	}
}




public class TerranMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
