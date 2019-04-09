package vendning.project.Vending_Machine.service;

import vendning.project.Vending_Machine.Model.Confection;
import vendning.project.Vending_Machine.Model.Fruit;
import vendning.project.Vending_Machine.Model.Juice;
import vendning.project.Vending_Machine.Model.Phone;
import vendning.project.Vending_Machine.Model.Product;
import vendning.project.Vending_Machine.util.Section;

public class Vending_MachineImpl implements V_M{

	private Product[] productList;
	private final int[] moneyArray = { 10, 20, 50, 100, 300, 500, 1000 };
	private int save = 0;



	@Override
	public void getFruits() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Fruit) {
				System.out.println("\n=======================\n" + i + " - Fruit ");
				productList[i - 1].Info();
			}
		}
	}


	@Override
	public void getConfection() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Confection) {
				System.out.println("\n====================\n" + i + " - Confection ");
				productList[i - 1].Info();
			}
		}

	}


	@Override
	public void getJuice() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Juice) {
				System.out.println("\n====================\n" + i + " - Juice ");
				productList[i - 1].Info();
			}
		}

	}


	@Override
	public void getPhone() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Phone) {
				System.out.println("\n====================\n" + i + " - Phone");
				productList[i - 1].Info();
			}
		}

	}

	
	@Override
	public void showMoneyList() {
		for (int i = 1; i < moneyArray.length + 1; i++) {
			System.out.println("\n ========= " + i + " - " + moneyArray[i - 1] + ": SEK =========");
		}

	}


	@Override
	public void setProducta() {

		Fruit banan = new Fruit("Banan", 12, Section.Fruit);
		Fruit apple = new Fruit("Apple", 8, Section.Fruit);
		Fruit ananas = new Fruit("Ananas", 19, Section.Fruit);
		Fruit plommon = new Fruit("Plommon", 17, Section.Fruit);
		Fruit sharon = new Fruit("Sharon", 23, Section.Fruit);
		Fruit clementin = new Fruit("Clementin", 12, Section.Fruit);
		Fruit kiwi = new Fruit("Kiwi", 13, Section.Fruit);

		Confection nougat = new Confection("Nougat", 33, Section.Confection);
		Confection karamell = new Confection("Karamell", 27, Section.Confection);
		Confection kola = new Confection("Kola", 29, Section.Confection);
		Confection godis = new Confection("Godis", 47, Section.Confection);
		Confection bakverk = new Confection("Bakverk", 10, Section.Confection);

		Juice sprite = new Juice("Sprite", 24, Section.Juice);
		Juice pepsi = new Juice("Pepsi", 23, Section.Juice);
		Juice fanta = new Juice("Fanta", 21, Section.Juice);
		Juice cola = new Juice("Cola", 22, Section.Juice);
		Juice lipton = new Juice("Lipton", 28, Section.Juice);

		Phone lg1 = new Phone("LG G1", 789, Section.Phone);
		Phone iphone = new Phone("Iphone X", 546, Section.Phone);
		Phone samsung = new Phone("Samsung", 987, Section.Phone);
		Phone sony = new Phone("Sony", 678, Section.Phone);
		Phone nokia = new Phone("Nokia", 734, Section.Phone);

		productList = new Product[] { banan, apple, ananas, plommon, sharon, clementin, kiwi, nougat, karamell, kola,
				godis, bakverk, sprite, pepsi, fanta, cola, lipton, lg1, iphone, samsung, sony, nokia };

	}

	@Override
	public int[] getMoneyArray() {
		return moneyArray;
	}

	@Override
	public Product[] getProductList() {
		return productList;
	}


	@Override
	public int getSave() {
		return save;
	}


	@Override
	public void setSave(int save) {
		this.save = save;
	}


	public static int[] Change() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
