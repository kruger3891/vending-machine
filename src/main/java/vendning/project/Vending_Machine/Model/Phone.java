package vendning.project.Vending_Machine.Model;

import vendning.project.Vending_Machine.util.Section;

public class Phone extends Product{
	
	public Phone(String Name, int Price, Section Phone) {
		super(Name, Price,Phone);
	}

	public void Info() {
		System.out.println("\n Section " + getSection() + "\n Name " + getName() + "\n Price " + getPrice() + ": SEK");

	}
	
	@Override
	public void toUse() {
		System.out.println("You call with your " + getName() + ".\n");
		
	}

}
