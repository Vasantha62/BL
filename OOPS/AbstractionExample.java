interface Vehicle
{
	void engineDetails();
}
class Bike implements Vehicle
{
	public void engineDetails()
		{
			System.out.println("2017 model");
			System.out.println("petrol engine");}	  
}
class Main 
{
public static void main(String args[])
{
	Vehicle v = new Bike();
		v.engineDetails();
}
}