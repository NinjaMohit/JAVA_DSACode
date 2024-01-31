
public class program5 {
    public static void main(String[] args) {
       // int N=10;
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};

      /*  int i=0;
       int j=N-1;

       while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
       }
    }
}*/

for(int i=0;i<arr.length/2;i++){
    int temp=arr[i];                                    // TC O(N/2)=N
                                                         // Sc=O(1)
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=temp;

}

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
}
