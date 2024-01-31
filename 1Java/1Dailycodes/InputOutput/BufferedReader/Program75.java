import java.io.*;
class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name");
        String name=br1.readLine();
        System.out.println(name);
        br1.close();


        System.out.println("ENTER ADD");
        String add=br2.readLine();
        System.out.println(add);

    }
}
