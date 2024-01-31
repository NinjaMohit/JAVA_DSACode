class Parent{
       Parent(){
		System.out.println("In parent Constructor");
	}

void parentProperty(){
	System.out.println("Flat,Car,Gold");
}
}

class child extends Parent{
	child(){
		System.out.println("In child Constructor");
	}
}


class Client{
	public static void main(String[] args){
	  //child obj=new child();
          // obj.parentProperty();
	  Parent obj1=new child();            //child obj to parent refrence work

	  Object obj=new child();             //child obj to parent reference work
	}
}
