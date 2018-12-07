package homework3;

public class Animal extends Bird {
	int a = 10000;
	int b = 9000;
	private String FlightlessBird;
	private String InsectEatingBird;
	
	public Animal(String flightlessBird, String insectEatingBird) {
	
		FlightlessBird = flightlessBird;
		InsectEatingBird = insectEatingBird;
	}

	public String getFlightlessBird() {
		return FlightlessBird;
	}

	public String getInsectEatingBird() {
		return InsectEatingBird;
	}

	@Override
	public void Fish() {
		System.out.println("Penguin eats Fish");
		
		
	}

	@Override
	public void Swim() {
		
		System.out.println("Penguin can swim");
	}

	@Override
	public void walk() {
		
		System.out.println("Penguin can walk");
	}

	@Override
	public void fly() {
		
		System.out.println("Birds can fly");
	}
	//overload
	
  public void birdSpecies(int a) { 
	  System.out.println("Species of birds:" + a);
	  
  }
  public void birdSpecies(int a, int b) {
	  System.out.println("Species of birds:" + b +" "+"t0"+" "+ a);
	  
	  
  }
  
  }
	


