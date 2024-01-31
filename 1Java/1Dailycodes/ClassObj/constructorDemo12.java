class Employee{
    int empId=10;
    String empName="kanha";

    void empInfo(){
        System.out.println("Id ="+empId);
        System.out.println("Name="+empName);
    }
}
class MainDemoo{
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.empInfo();    //10 kanha
        System.out.println(emp.empId);//10
        System.out.println(emp.empName);//kanha
    }
}