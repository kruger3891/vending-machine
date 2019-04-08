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
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Section getSection() {
		return section;
	}



	public void setSection(Section section) {
		this.section = section;
	}



	public abstract void Info();
	
	public abstract void toUse();
	
	

}
