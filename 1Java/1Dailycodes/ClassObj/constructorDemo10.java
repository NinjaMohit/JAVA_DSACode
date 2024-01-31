class Core2Web1{
    int numCourses=8;
 //   private String favCourses="Cpp";            //   it give error favcorse has private acccess in Core2web

    void display(){
        System.out.println(numCourses);
        //     System.out.println(favCourses);
    }
}
class student {
    public static void main(String[] args) {

        Core2Web1 obj = new Core2Web1();

        obj.display();
        System.out.println(obj.numCourses);
//      System.out.println(obj.favCourses);
    }
}