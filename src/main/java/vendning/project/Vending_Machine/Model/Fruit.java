package vendning.project.Vending_Machine.Model;

import vendning.project.Vending_Machine.util.Section;

public class Fruit extends Product {

	public Fruit(String Name, int Price, Section Fruit) {
		super(Name, Price,Fruit);
	}

	public void Info() {
		System.out.println("\n Section " + getSection() + "\n Name " + getName() + "\n Price " + getPrice() + ": SEK");

	}

	@Override
	public void toUse() {
		System.out.println("You eat " + getName() + ".\n");
		
	}

}