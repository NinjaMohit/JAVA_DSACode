public class sbmprogram3 {
    public static void main(String[] args){
        String str="Mohit";

        StringBuffer sb1=new StringBuffer(str);

        str=sb1.reverse().toString();
        System.out.println(str);
    }
}
