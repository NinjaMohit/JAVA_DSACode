class stringDemo5 {
    public static void main(String[] args){
        String str1="Mohit";
        String str2="Pawar";


        System.out.println(str1+str2);

        String str3="MohitPawar";
        String str4=str1+str2;

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}
