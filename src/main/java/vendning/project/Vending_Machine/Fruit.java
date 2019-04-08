package vendning.project.Vending_Machine;

public class Fruit extends Product {

	public Fruit(String Name, double Price, Section Fruit) {
		super(Name, Price);
		this.section = Section.Fruit;
	}

	public void Info() {
		System.out.println("\n Section " + section + "\n Name " + name + "\n Price " + price);
	}

	@Override
	public void toUse() {
		System.out.println("You eat " + getName() + ".\n");
		
	}
}

class Confection extends Product {

	public Confection(String Name, Double Price, Section Confection) {
		super(Name, Price);
		this.section = Section.Confection;
	}

	public void Info() {
		System.out.println("\n Section " + section + "\n Name " + name + "\n Price " + price + ": SEK");

	}

	@Override
	public void toUse() {
		System.out.println("You eat " + getName() + ".\n");
	}
}

class Phone extends Product {

	public Phone(String Name, double Price, Section Phone) {
		super(Name, Price);
		this.section = Section.Phone;
	}

	public void Info() {
		System.out.println("\n Section " + section + "\n Name " + name + "\n Price " + price + ": SEK");

	}

	@Override
	public void toUse() {
		System.out.println("You call with your " + getName() + ".\n");
		
	}
}

class Juice extends Product {

	public Juice(String Name, Double Price, Section Juice) {
		super(Name, Price);
		this.section = Section.Juice;
	}

	public void Info() {
		System.out.println("\n Section " + section + "\n Name " + name + "\n Price " + price + ": SEK");
	}

	@Override
	public void toUse() {
		System.out.println("You drink a " + getName() + ".\n");
		
	}

}