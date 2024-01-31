class constructorDemo5 {
    int x=10;
    int y=20;

    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args){
        constructorDemo5 obj1=new constructorDemo5();
        obj1.display();
    }
}