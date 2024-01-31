//In place Prefix Sum

//input=1,2,3,4,5   op=1,3,6,10,15
public class program2 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
