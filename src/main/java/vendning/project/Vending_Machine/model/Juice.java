package vendning.project.Vending_Machine.model;

import vendning.project.Vending_Machine.util.Section;

public class Juice extends Product{
	
	public Juice(String name, int price, Section section) {
		super(name, price, section);
	}

	public void Info() {
		System.out.println("\n Section " + getSection() + "\n Name " + getName() + "\n Price " + getPrice() + ": SEK");

	}
	
	@Override
	public void toUse() {
		System.out.println("You drink a " + getName() + ".\n");
		
	}

}
