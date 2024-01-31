// here it called obj1 then obj2 and obj
class constructorDemo4 {
    constructorDemo4(){
        System.out.println("In Constructor:");
    }
    void fun(){
        constructorDemo4 obj=new constructorDemo4();
    }
    public static void main(String[] args){
        constructorDemo4 obj1=new constructorDemo4();
        constructorDemo4 obj2=new constructorDemo4();

        obj1.fun();

    }
}