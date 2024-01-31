
//take a two string from user and comapre them using self length function

import java.util.*;
public class stringDemo17    {
    static int myStrLen(String str){
        char arr[]=str.toCharArray();

        int count=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        String str2=sc.next();

        if(myStrLen(str1)==myStrLen(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}

