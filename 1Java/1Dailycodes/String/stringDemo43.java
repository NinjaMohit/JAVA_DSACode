class stringDemo43 {
    public static void main(String[] args){
        String svar1="Core2web";
        String svar2="technologies";

        if(svar1==svar1.concat(svar2))
            System.out.println("hey");
        else if(svar2==svar1.concat(svar2))
            System.out.println("Hii");
        else
            System.out.println("Bye");
    }

}
