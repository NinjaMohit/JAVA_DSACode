class Demo1{
                                                           ///int to float =error,int to char=run,int to boolean=error; 
                                                           ///float to int=run,float to char=run,float to boolean=error
      void fun(float x){
        System.out.println("in float");
        System.out.println(x);
    }
    public static void main(String[] args){
        Demo1 obj=new Demo1();
        obj.fun(10.0f);
        obj.fun(10);
        obj.fun('A');

    }
}
