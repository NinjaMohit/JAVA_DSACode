package Mymethjava;

 class charAtDemo1 {
     static char charAtMethod(String str,int n){
         char arr[]= str.toCharArray();

            if(n<arr.length){
                return arr[n];
            }
            else{
                System.out.println("ArrayIndexOutOfBound");
                return 0;
            }

     }

    public static void main(String[] args){
        String str="Mohit";

        System.out.println(charAtMethod(str,5));


    }
}
