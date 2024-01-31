class Employeee{                   //if static varaible are change by any object it will change for all obj
    //but instance variable are change by any oject it will change for only that obj
    int empId=10;
    String name="Kanha";
    static int y=50;

    void empInfo(){
        System.out.println("Id:"+empId);
        System.out.println("name:"+name);
        System.out.println("y:"+y+"\n");

    }
}
class MainDemooo{
    public static void main(String[] args){
        Employeee emp1=new Employeee();
        Employeee emp2=new Employeee();

        emp1.empInfo();  //10 kanha 50
        emp2.empInfo();  //10 kanha 50

        emp2.empId=20;
        emp2.name="Mohit";
        emp2.y=5000;

        emp1.empInfo();      //10 kanha 5000
        emp2.empInfo();      //20 Mohit 5000
    }
}