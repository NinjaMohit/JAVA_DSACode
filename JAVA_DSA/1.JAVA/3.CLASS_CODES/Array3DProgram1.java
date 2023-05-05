 
class Array3DProgram{
public static void main(String[] args){

        int arr[][][]={{{1,2,3},{4,5,6}},{{10,11,12},{13,14,15}},{{16,17,18},{19,20,21}}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[j].length;k++){
                    System.out.print("arr["+i+"]["+j+"]["+k+"] = "  +arr[i][j][k] +" \t");
                }
                 System.out.println();
            }
            System.out.println();

        }
    }
}

