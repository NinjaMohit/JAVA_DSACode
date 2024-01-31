package Mymethjava;

public class lengthDemo1 {

    static int MyLength(String str1){

        char arr[]=str1.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        String str="Mohit";
      //  int len=MyLength(str);
        System.out.println(MyLength(str));
    }
}
