class Hashcode{
    public static void main(String[] args){
        int[] arr=new int[]{0,10};                    ///in this example two array has different object
                                                      // (because new mean new Object) but similar value be
        int[] arr1=new int[2];

        int[] arr2={10,20};
        int[] arr3={10,20};
        int[] arr4=new int []{10,20};
        int[] arr5=new int[]{10,20};
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);

        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr2[0]));
        System.out.println(System.identityHashCode(arr3[0]));
        System.out.println(System.identityHashCode(arr4[0]));
        System.out.println(System.identityHashCode(arr5[0]));

        System.out.println(System.identityHashCode(arr[1]));
        System.out.println(System.identityHashCode(arr1[1]));
        System.out.println(System.identityHashCode(arr2[1]));
        System.out.println(System.identityHashCode(arr3[1]));
        System.out.println(System.identityHashCode(arr4[1]));
        System.out.println(System.identityHashCode(arr5[1]));


    }
}

