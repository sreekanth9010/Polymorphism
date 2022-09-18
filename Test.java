package polymorphism;

class Plane
{
	public void fly()
	{
		System.out.println("Plane is flying..!");
	}
	public void takeOff()
	{
		System.out.println("Plane takesOff..!");
	}
}

class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("Cargo palne flies at low height..!");
	}
	public void takeOff()
	{
		System.out.println("Cargo palne takesoFF at long runway");
	}
}

class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("fighter plane flies at high height..!");
	}
	public void takeOff()
	{
		System.out.println("Fighter plane takesOff at less runway...!");
	}
}
class Airport
{
	public void Permit(Plane p)
	{
		p.fly();
		p.takeOff();
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CargoPlane cp = new CargoPlane();
		
		FighterPlane fp = new FighterPlane();
		
		Plane p;
		
		p=cp;
		p.fly();
		p.takeOff();
		
		p=fp;
		p.fly();
		p.takeOff();

	}

}
