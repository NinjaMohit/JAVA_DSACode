//4.compareToIgnoreCase=method compare two string  on the basis of unicode value of each charater and return
//0 if two string are same otherwise comaparision(it is no case sensitive).
class stringDemo14 {
    public static void main(String[] args){
        String str1="SHASHI";
        String str2="shashi";

        String str3="Mohit";
        String str4="PawarMohit";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str3.compareToIgnoreCase(str4));
    }
}
