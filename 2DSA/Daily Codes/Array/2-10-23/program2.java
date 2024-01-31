//Count no of element having atleast 1 element greater than itself

 class program2 {
public static void main(String[] args) {
    int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
    int N=10;int count=0;
/* 
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(arr[i]<arr[j]){
                count++;
                break;
            }
        }
    }
    System.out.println(count);
}
    
}
*/

//optimize approch

int max=Integer.MIN_VALUE;

for(int i=0;i<N;i++){
    if(max<arr[i]){
        max=arr[i];
    }
  }

  for(int i=0;i<N;i++){
    if(arr[i]==max){                             //Time Complexity o(N)
         count++;                               //space Complexity  o(1)
    }
  }
System.out.println(N-count);
   }
 }