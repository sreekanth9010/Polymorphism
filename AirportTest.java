package polymorphism;
class Crash
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

class CargoPlane1 extends Crash
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

class FighterPlane1 extends Crash
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
class AirportA
{
	public void Permit(Crash p)
	{
		p.fly();
		p.takeOff();
	}
}

public class AirportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane1 cp = new CargoPlane1();
		
		FighterPlane1 fp = new FighterPlane1();
		AirportA a = new AirportA();
		a.Permit(cp);
		a.Permit(fp);

	}

}
