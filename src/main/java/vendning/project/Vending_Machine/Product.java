package vendning.project.Vending_Machine;

public abstract class Product {
	
	String name;
	double price;
	Section section;
	
	public Product(String Name, double Price) {
		name = Name;
		price = Price;
		section = Section.Other;
	}
	
	public abstract void Info();

}
