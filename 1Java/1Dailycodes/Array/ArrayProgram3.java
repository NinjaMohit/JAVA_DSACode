 class ArrayProgram3{
    public static void main(String[] args){
        int arr[]=new int[5];
        int arr1[]={50,60,70,80,90};
        int arr2[]=new int[]{100,200,300,400,500};

        //ERROR bbint arr3[]=new int[4]{10,20,30,40,50};

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(arr2[i]);
        }

    }
 }
