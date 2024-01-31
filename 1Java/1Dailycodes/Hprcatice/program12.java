class program4 {

    int[] removeElement(int arr[]){
       int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              arr[count]=arr[i];
              count++;
            }
        }

        return arr;
    }
    public static void main(String[] args){
        int[] arr=new int[]{3,3,4,7,10,6,5};
         program3 obj=new program3();

        int[] ans=obj.removeElement(arr);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

