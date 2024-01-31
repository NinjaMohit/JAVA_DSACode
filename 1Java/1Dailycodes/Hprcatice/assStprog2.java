//Reaverse a string pallindrome or not
public class assStprog2 {
    public static void main(String[] args) {

        String str1 = "momoom";
        StringBuffer sb = new StringBuffer(str1);

        String strans = sb.reverse().toString();
        if (str1.equals(strans)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("NOt Pallindrome");
        }

    }

}
