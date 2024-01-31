class constructorDemo8 //MACD
{
    int item=5;
    String product="Fried";

    void menu(){
        String menu1="veg";
        String menu2="nonveg";
        System.out.println(item);
        System.out.println(product);
    }
    public static void main(String[] args){
        constructorDemo8 obj=new constructorDemo8();
        obj.menu();
    }
}