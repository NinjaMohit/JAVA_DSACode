class Demo12{
    int x=10;
    private int y=20;
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
}
class MainDemo{
    public static void main(String[] args){
        Demo obj=new Demo();
       // obj.fun();     //10 20       but here y accesible because fun method can acccess it.

        System.out.println(obj.x);//10
        //System.out.println(obj.y);//error

        //System.out.println(y);//error
        //System.out.println(x);//error
    }
}
