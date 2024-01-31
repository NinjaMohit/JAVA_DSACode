//abstraction real time example

abstract class Society{
	Society(){
		System.out.println(" Abc name of society");
	}

	void Garden(){
		System.out.println("Garden same for all ");
	}

     abstract void FlatNo();
}

class WingA extends Society{
	void FlatNo(){
		System.out.println("101");
	}
}

class Client{
	public static void main(String[] args){
		Society gate=new WingA();

		gate.Garden();
		gate.FlatNo();
	}
}

