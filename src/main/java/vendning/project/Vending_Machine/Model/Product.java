package vendning.project.Vending_Machine.Model;

import vendning.project.Vending_Machine.util.Section;

public abstract class Product {

	private String name;
	private int price;
	private Section section;

	public Product(String Name, int Price, Section Section) {
		name = Name;
		price = Price;
		section = Section;
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

	public void setPrice(int price) {
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
