package vendning.project.Vending_Machine.service;

import vendning.project.Vending_Machine.Model.Product;

public interface V_M {

	void getFruits();

	void getConfection();

	void getJuice();

	void getPhone();

	void showMoneyList();

	void setProducta();

	int[] getMoneyArray();

	Product[] getProductList();

	int getSave();

	void setSave(int save);

}