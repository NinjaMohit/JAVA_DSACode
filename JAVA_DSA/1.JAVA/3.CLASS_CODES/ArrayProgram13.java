class ArrayDemo1{
    public static void main(String[] args){
        int[] arr=new int[2];
        int[] arr1=new int[2];

        int[] arr2={10,20};
        int[] arr3={10,20};

        int[] arr4=new int[]{10,200};
        int[] arr5=new int[]{10,200};

        /////arr and 1
        System.out.println(arr4);
        System.out.println(arr5);

        /////arr 2 and 3
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr1[1]));

        ////arrr4 and 5
        System.out.println(System.identityHashCode(arr4[0]));
        System.out.println(System.identityHashCode(arr5[0]));
        System.out.println(System.identityHashCode(arr4[1]));
        System.out.println(System.identityHashCode(arr5[1]));

    }
}
