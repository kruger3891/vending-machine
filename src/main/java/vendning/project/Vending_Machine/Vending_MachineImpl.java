package vendning.project.Vending_Machine;

public class Vending_MachineImpl implements V_M{

	private Product[] productList;
	private final int[] moneyArray = { 10, 20, 50, 100, 300, 500, 1000 };
	private int save = 0;



	public void getFruits() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Fruit) {
				System.out.println("\n=======================\n" + i + " - Fruit ");
				productList[i - 1].Info();
			}
		}
	}


	public void getConfection() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Confection) {
				System.out.println("\n====================\n" + i + " - Confection ");
				productList[i - 1].Info();
			}
		}

	}


	public void getJuice() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Juice) {
				System.out.println("\n====================\n" + i + " - Juice ");
				productList[i - 1].Info();
			}
		}

	}


	public void getPhone() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Phone) {
				System.out.println("\n====================\n" + i + " - Phone");
				productList[i - 1].Info();
			}
		}

	}

	
	public void showMoneyList() {
		for (int i = 1; i < moneyArray.length + 1; i++) {
			System.out.println("\n ========= " + i + " - " + moneyArray[i - 1] + ": SEK =========");
		}

	}


	public void setProducta() {

		Fruit banan = new Fruit("Banan", 12.95, Section.Fruit);
		Fruit apple = new Fruit("Apple", 8.65, Section.Fruit);
		Fruit ananas = new Fruit("Ananas", 19.15, Section.Fruit);
		Fruit plommon = new Fruit("Plommon", 17.45, Section.Fruit);
		Fruit sharon = new Fruit("Sharon", 23.75, Section.Fruit);
		Fruit clementin = new Fruit("Clementin", 12.45, Section.Fruit);
		Fruit kiwi = new Fruit("Kiwi", 13.95, Section.Fruit);

		Confection nougat = new Confection("Nougat", 33.65, Section.Confection);
		Confection karamell = new Confection("Karamell", 27.95, Section.Confection);
		Confection kola = new Confection("Kola", 29.55, Section.Confection);
		Confection godis = new Confection("Godis", 47.85, Section.Confection);
		Confection bakverk = new Confection("Bakverk", 10.95, Section.Confection);

		Juice sprite = new Juice("Sprite", 24.95, Section.Juice);
		Juice pepsi = new Juice("Pepsi", 23.45, Section.Juice);
		Juice fanta = new Juice("Fanta", 21.35, Section.Juice);
		Juice cola = new Juice("Cola", 22.63, Section.Juice);
		Juice lipton = new Juice("Lipton", 28.73, Section.Juice);

		Phone lg1 = new Phone("LG G1", 789.95, Section.Phone);
		Phone iphone = new Phone("Iphone X", 546.45, Section.Phone);
		Phone samsung = new Phone("Samsung", 987.35, Section.Phone);
		Phone sony = new Phone("Sony", 678.63, Section.Phone);
		Phone nokia = new Phone("Nokia", 734.73, Section.Phone);

		productList = new Product[] { banan, apple, ananas, plommon, sharon, clementin, kiwi, nougat, karamell, kola,
				godis, bakverk, sprite, pepsi, fanta, cola, lipton, lg1, iphone, samsung, sony, nokia };

	}

	public int[] getMoneyArray() {
		return moneyArray;
	}

	public Product[] getProductList() {
		return productList;
	}


	public int getSave() {
		return save;
	}


	public void setSave(int save) {
		this.save = save;
	}
	
	

}
