import java.io.*;
class ArrayProgram11{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Arraysize");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter a Element");
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			

			if(arr[i]%2==0){
				count++;
                          }
		}
		System.out.println("Even no count:"+count);
	}
}


