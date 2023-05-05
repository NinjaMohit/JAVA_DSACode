

class stringDemo7{
    public static void main(String[] args) {
        String str1="Mohit";
        String str2=new String("Mohit");

        //It compare identityhashcode so it give error
        //we use equals fuction

        if (str1==str2) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
