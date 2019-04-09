package vendning.project.Vending_Machine.Model;

import vendning.project.Vending_Machine.util.Section;

public class Juice extends Product{
	
	public Juice(String Name, int Price, Section Juice) {
		super(Name, Price,Juice);
	}

	public void Info() {
		System.out.println("\n Section " + getSection() + "\n Name " + getName() + "\n Price " + getPrice() + ": SEK");

	}
	
	@Override
	public void toUse() {
		System.out.println("You drink a " + getName() + ".\n");
		
	}

}
