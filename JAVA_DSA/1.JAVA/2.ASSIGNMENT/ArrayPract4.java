//WAP take 7 char as input print only vowels from array
//ip=a,b,c,o,d,p,e
//op=a,o,e


import java.util.*;
class ArrayPract4 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

         char [] arr = new char[7];

        System.out.println("Enter a new char");

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.next().charAt(0);
        }

            for (int i = 0; i < 7; i++) {
                if ((arr[i] == 'a' )|| (arr[i] == 'e') || (arr[i] == 'i') ||( arr[i] == 'o') || (arr[i] == 'u')) {
                    System.out.println("Vowel are"+arr[i]);
                }

            }

        }
    }






