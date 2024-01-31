class Core2Web{
    int noOfSource=8;
    String favCourse="Math";

    void display(){
        System.out.println(noOfSource);
        System.out.println(favCourse);
    }
}
class Subject{
    public static void main(String[] args){
        Core2Web obj=new Core2Web();
        obj.display();
    }
}
