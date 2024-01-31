class constructorDemo7 {
    String ProjectName="OnlineEdu";
    int noOfEmp=20;

    void clientInfo(){
        String clientName="Core2Web";
        System.out.println(clientName);
        System.out.println(ProjectName);
        System.out.println(noOfEmp);
    }

    public static void main(String[] args){
        constructorDemo7 obj=new constructorDemo7();
        obj.clientInfo();
    }
}