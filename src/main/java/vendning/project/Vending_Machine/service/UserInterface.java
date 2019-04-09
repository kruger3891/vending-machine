package vendning.project.Vending_Machine.service;

import java.util.Scanner;

import vendning.project.Vending_Machine.util.inputNumberScann;

public class UserInterface {
	
	private static Scanner sc = new Scanner(System.in);
	private static inputNumberScann scann = new inputNumberScann();
	private V_M vm= new Vending_MachineImpl();

	public void run() {

		vm.setProducta();
		boolean start = true;
		while (start) {

			System.out.println("============================================");
			System.out.println("===     Welcome to vending machine       ===");
			System.out.println("============================================");
			System.out.println("===   	  Pleas Enter the namber  	 ===");
			System.out.println("============================================");
			System.out.println("===   Choice of money you want to put    ===");
			
			vm.showMoneyList();

			int moneyIndex = scann.input(1, 7);
			vm.setSave(vm.getMoneyArray()[moneyIndex - 1]);
			System.out.println("======================");
			System.out.println(" You money is " + vm.getSave() + ": SEK");
			System.out.println("======================\n");
			System.out.println("=========================");
			System.out.println("What do you want to buy\n\n1 - Fruit:\n2 - Confection:\n3 - Juice:\n4 - Phone:");
			System.out.println("======================");

			int sectionIndex = scann.input(1, 4);
			switch (sectionIndex) {
			case 1:
				vm.getFruits();
				break;

			case 2:
				vm.getConfection();
				break;

			case 3:
				vm.getJuice();
				break;

			case 4:
				vm.getPhone();
				break;

			default:
				break;
			}

			System.out.println("Value number of product ");
			int productIndex = scann.input(1, 22);

			System.out.println(" Selected " + vm.getProductList()[productIndex - 1].getName() + " : "
					+ vm.getProductList()[productIndex - 1].getPrice() + ": SEK");

			boolean b = true, s = false;
			while (b) {
				do {
					if (vm.getSave() <= vm.getProductList()[productIndex - 1].getPrice()) {
						System.out.println("=====================");
						System.out.println("\nNot enough money !!!\n");
						System.out.println("=====================");						
						System.out.println("And Put more money");
						vm.showMoneyList();
						moneyIndex = scann.input(1, 7);
						vm.setSave(vm.getSave() + vm.getMoneyArray()[moneyIndex - 1]);
						System.out.println(" You money is " + vm.getSave());

						b = true;
						start = true;

					} else {
						double Change = vm.getSave() - vm.getProductList()[productIndex - 1].getPrice();
						System.out.println(" \nYou chanege is " + Change + ": SEK\n");
						s = true;
					}

				} while (!s);
				
				System.out.println("Use your product(y/n)?");
				
				if (sc.next().toLowerCase().equals("y")) {
					vm.getProductList()[productIndex - 1].toUse();
				} 
				
				System.out.println("Do you want buy again (y/n)?");
				start = false;
				
				
				if (sc.next().toLowerCase().equals("y")) {
					b = false;
					start = true;
				} else {
					System.out.println("Program is terminated");
					b = false;
				}
			}

		}

	}

}
