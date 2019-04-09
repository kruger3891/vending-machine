package vendning.project.Vending_Machine.Model;

import vendning.project.Vending_Machine.util.Section;

public class Confection extends Product{

	public Confection(String Name, int Price, Section Confection) {
		super(Name, Price,Confection);
	}

	public void Info() {
		System.out.println("\n Section " + getSection() + "\n Name " + getName() + "\n Price " + getPrice() + ": SEK");

	}

	@Override
	public void toUse() {
		System.out.println("You eat " + getName() + ".\n");
	}

}
