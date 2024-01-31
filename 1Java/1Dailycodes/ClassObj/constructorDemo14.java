class Demo1 {
    int x=10;
    private int y=20;
    static int z=30;
    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z+"\n");
    }

}
class client{
    public static void main(String[] args){
        Demo1 obj1=new Demo1();
        Demo1  obj2=new Demo1();

        obj1.disp();
        obj1.x=100;
        obj1.z=300;

        obj1.disp();
        obj2.disp();

    }
}
