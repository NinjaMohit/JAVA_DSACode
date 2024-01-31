//9.lastIndexOf ()=method is used to return position of last occurence of character in string and return -1 if never occur
class stringDemo20{

    public static void main(String[] args){

        String str1="Shashi";
        String str2=new String("shasi");
        System.out.println(str1.lastIndexOf('h',5));
        System.out.println(str1.lastIndexOf('h',1));
        System.out.println(str1.lastIndexOf('h',2));


        System.out.println(str2.lastIndexOf('s',12));
    }
}

