import java.io.*;
class ArrayProgram12{
     public static void main(String[] args)throws IOException{

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Enter arraySize");

               int size=Integer.parseInt(br.readLine());
               int arr[]=new int[size];

                        System.out.println("Enter a element");

                        int count=0;int count2=0;
                        for(int i=0;i<arr.length;i++){
                    arr[i]=Integer.parseInt(br.readLine());

                    if(arr[i]%2==0){
                         count++;
                    }
                    else{
                         count2++;
                    }
               }
                        System.out.println("Event count:"+count);
                        System.out.println("Oddd count:"+count2);
          }
     }

