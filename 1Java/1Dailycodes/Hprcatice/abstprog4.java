//abstraction real time example
//

abstract class KFCMainBranch {
	KFCMainBranch(){
		System.out.println("Mainn brach:");
	}

	void MenuCard(){
		System.out.println("Same For All");
	}

	abstract void FoodOrder();
	abstract void BillingPrice();
}

class KFCSubBranches extends KFCMainBranch{

	void FoodOrder(){
		System.out.println("veg or non veg");
	}

	void BillingPrice(){
		System.out.println(" Rs 15000");
	}
}
class Client {
	public static void main(String[] args){

		KFCMainBranch B1=new KFCSubBranches();
		B1.FoodOrder();
		B1.BillingPrice();
	}
}

