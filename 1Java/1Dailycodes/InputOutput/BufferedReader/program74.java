import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name = br.readLine();

        System.out.println("enter char");
        char ch=(char)br.read();
        br.skip(1);

        System.out.println("Enter int");
        int x=Integer.parseInt(br.readLine());

        System.out.println("enetre float");
        float y=Float.parseFloat(br.readLine());
    }
}

