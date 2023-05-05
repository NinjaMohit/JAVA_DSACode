 class stringDemo9 {
    public static void main(String[] args){
        String str1="Mohit";
        String str2=new String("Mohit");
        String str3="Mohit";
        String str4=new String("Mohit");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

    }
}
