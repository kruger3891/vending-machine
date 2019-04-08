package vendning.project.Vending_Machine;

import java.util.Scanner;

public class VM {

	public static Scanner sc = new Scanner(System.in);
	public static inputNumberScann scann = new inputNumberScann();
	private static Product[] productList;
	private static int[] moneyArray = { 10, 20, 50, 100, 300, 500, 1000};
	private static String buyAgain;
	private int save = 0;

	public void run() {

		setProducta();
		boolean start = true;
		while (start) {

			System.out.println("============================================");
			System.out.println("===     Welcome to vending machine       ===");
			System.out.println("============================================");
			System.out.println("===   	  Pleas Enter the namber  	 ===");
			System.out.println("============================================");
			System.out.println("===   Choice of money you want to put    ===");
			
			moneyList();

			int moneyIndex = scann.input(1, 7);
			save = moneyArray[moneyIndex - 1];
			System.out.println("======================");
			System.out.println(" You money is " + save + ": SEK");
			System.out.println("======================\n");
			System.out.println("=========================");
			System.out.println("What do you want to buy\n\n1 - Fruit:\n2 - Confection:\n3 - Juice:\n4 - Phone:");
			System.out.println("======================");

			int sectionIndex = scann.input(1, 4);
			switch (sectionIndex) {
			case 1:
				getFruits();
				break;

			case 2:
				getConfection();
				break;

			case 3:
				getJuice();
				break;

			case 4:
				getPhone();
				break;

			default:
				break;
			}

			System.out.println("Value number of product ");
			int productIndex = scann.input(1, 22);

			System.out.println(" Selected " + productList[productIndex - 1].name + " : "
					+ productList[productIndex - 1].price + ": SEK");

			boolean b = true, s = false;
			while (b) {
				do {
					if (save <= productList[productIndex - 1].price) {
						System.out.println("=====================");
						System.out.println("\nNot enough money !!!\n");
						System.out.println("=====================");						
						System.out.println("And Put more money");
						moneyList();
						moneyIndex = scann.input(1, 7);
						save += moneyArray[moneyIndex - 1];
						System.out.println(" You money is " + save);

						b = true;
						start = true;

					} else {
						double Change = save - productList[productIndex - 1].price;
						System.out.println(" \nYou chanege is " + Change + ": SEK\n");
						s = true;
					}

				} while (!s);
				
				System.out.println("Use your product(y/n)?");
				buyAgain = sc.next().toLowerCase();
				if (buyAgain.equals("y")) {
					productList[productIndex - 1].toUse();
				} 
				
				System.out.println("Do you want buy again (y/n)?");
				start = false;
				
				buyAgain = sc.next().toLowerCase();
				if (buyAgain.equals("y")) {
					b = false;
					start = true;
				} else {
					System.out.println("Program is terminated");
					b = false;
				}
			}

		}

	}

	private static void getFruits() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Fruit) {
				System.out.println("\n=======================\n" + i + " - Fruit ");
				productList[i - 1].Info();
			}
		}
	}

	private static void getConfection() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Confection) {
				System.out.println("\n====================\n" + i + " - Confection ");
				productList[i - 1].Info();
			}
		}

	}

	private static void getJuice() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Juice) {
				System.out.println("\n====================\n" + i + " - Juice ");
				productList[i - 1].Info();
			}
		}

	}

	private static void getPhone() {
		for (int i = 1; i < productList.length + 1; i++) {
			if (productList[i - 1] instanceof Phone) {
				System.out.println("\n====================\n" + i + " - Phone");
				productList[i - 1].Info();
			}
		}

	}

	private static void moneyList() {
		for (int i = 1; i < moneyArray.length+1; i++) {
			System.out.println("\n ========= " + i + " - " + moneyArray[i - 1] + ": SEK =========");
		}

	}

	

	private static void setProducta() {

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

}
