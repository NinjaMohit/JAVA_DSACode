
   class concatDemo1 {
       static String MyConcatmethod(String str1, String str2) {

           char arr1[] = str1.toCharArray();
           char arr2[] = str2.toCharArray();
           char arr3[] = new char[arr1.length + arr2.length];

           for (int i = 0; i < arr1.length; i++) {
               arr3[i] = arr1[i];
           }
           for (int i = 0; i < arr2.length; i++) {
               arr3[arr1.length + i] = arr2[i];
           }

           String str3=new String(arr3);
           return str3;

       }


        public static void main(String[] args){
            String str1="Mohit";
            String str2="Pawar";
            System.out.println(str1.concat(str2));


        }
    }


