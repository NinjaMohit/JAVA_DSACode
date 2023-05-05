/*WAP to find pallindrome number from arrayand return the index
Ip=10,25,252,36,564
Op=Pallindrome no 496 found at index :3
 */




import java.util.Scanner;

class ArrayPract21 {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a arry Size:");
            int size=sc.nextInt();
            int arr[]=new int[size];

            System.out.println("Enter element of Array:");
            for(int i=0;i<size;i++) {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<size;i++) {
                int n=arr[i];
                int rev=0;

                while(n>0)
                {
                   int rem=n%10;
                   rev=rev*10+rem;
                   n=n/10;
                }

                if(rev==arr[i]){
                    System.out.println("Pallindrome no "+arr[i]+ " found at "+i);
                }
            }

    }
}
