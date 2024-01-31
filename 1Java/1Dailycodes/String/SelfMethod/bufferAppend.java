package Mymethjava;

public class bufferAppend {
        static StringBuffer MyAppend(StringBuffer sb1,StringBuffer sb2){
            String str1=sb1.toString();
            String str2=sb2.toString();


            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
          // int l1= arr1.length;
           //int l2=arr2.length;
            //int length=l1+l2;
            char arr3[]=new char[arr1.length+ arr2.length];

            for(int i=0;i<arr1.length;i++){
                arr3[i]=arr1[i];

            }
            for(int i=0;i<arr2.length;i++){
                arr3[arr1.length+i]=arr2[i];

            }
            String str3=new String(arr3);
            System.out.println(str3);

            StringBuffer str4=new StringBuffer(str3);
            return str4;
        }

        public static void main(String[] args){
        StringBuffer sb1=new StringBuffer("Mohit");
        StringBuffer sb2=new StringBuffer("patil");

        System.out.println(MyAppend(sb1,sb2));


    }
}
