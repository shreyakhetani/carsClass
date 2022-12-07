package cars;

	import static java.lang.System.out;

	public class cars {

		public static void main(String[] args) {

			Car car1 = new Car();
			car1.printData();
			car1.refule(5);
			
			Car car2 = new Car("Fiat", 400, 40);
			car2.printData();
			car2.printData();
			
		}

	}

	class Car
	{
		public boolean accelerate;
		public String brand;
		public int model;
		public int amountOfFuel;
// Default constructor
		public Car()
		{
			accelerate = true;
			brand = "Fiat";
			model = 500;
			amountOfFuel = 50;
		}
//	parameterized constructor
		public Car(String brand, int model, int amountOfFuel)
		{
			accelerate = true;
			this.brand =brand;
			this.model = model;
			this.amountOfFuel = amountOfFuel;
		}
			
		public void brake()
		{
			accelerate = false;
		}
		public void accelerate()
		{
			accelerate = true;
			
		}
		public void refule(int amount)
		{
			out.println("Fuel on the tank: " + amountOfFuel);
			out.println("Refuel: " + amount);
			amountOfFuel = amountOfFuel + amount;
			out.println("Fuel on the tank after the refuel: " + amountOfFuel);
		}
		
		public void printData()
		{
			out.println("Brand: " + brand);
			out.println("Model: " + model);
			out.println("Fuel: " + amountOfFuel);
		
		if(accelerate == true)
		{
			
			out.println("Car is accelerating");
			amountOfFuel--;
			
			if (amountOfFuel <= 0)
			{
			   accelerate = false;	
			   
			}
		}
		else
		{
			out.println("Car is breaking");	
		}
		
		}
	}


