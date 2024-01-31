//when Object is created Constructer are called first the main method sop are called

class constructorDemo3 {

    constructorDemo3(){
        System.out.println("RcB");
    }
    public static void main(String[] args){
        constructorDemo3 obj1=new constructorDemo3();
        constructorDemo3 obj2=new constructorDemo3();
        System.out.println("Hello");
    }
}
