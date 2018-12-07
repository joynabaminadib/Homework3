package homework3;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal ("Chicken","Woodpecker");
		Animal a2 = new Animal ("Duck", "Sparrow");
		System.out.println(a1.getFlightlessBird() +" "+ a1.getInsectEatingBird());
		System.out.println(a2.getFlightlessBird() +" "+ a2.getInsectEatingBird());
		a1.Fish();
		a1.fly();
		a1.Swim();
		a1.walk();
		a1.birdSpecies(10000);
		a1.birdSpecies(9000,10000);
		
		a2.Fish();
		a2.fly();
		a2.Swim();
		a2.walk();
		a2.birdSpecies(10000);
		a2.birdSpecies(9000,10000);
		
	}

}
