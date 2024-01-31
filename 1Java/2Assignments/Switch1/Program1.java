import java.io.*;

class Program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maraMarks;
        System.out.println("Enter marathiMarks:");
        maraMarks = Integer.parseInt(br.readLine());

        int EngMarks;
        System.out.println("Enter EngMarks:");
        EngMarks = Integer.parseInt(br.readLine());

        int mathMarks;
        System.out.println("Enter mathMarks:");
        mathMarks = Integer.parseInt(br.readLine());

        int sSMarks;
        System.out.println("Enter sSMarks:");
        sSMarks = Integer.parseInt(br.readLine());

        int SciMarks;
        System.out.println("Enter SciMarks:");
        SciMarks = Integer.parseInt(br.readLine());

        if (maraMarks < 35 || EngMarks < 35 || mathMarks < 35 || sSMarks < 35 || SciMarks < 35) {
            System.out.println("Failed in Exam");
        } else {
            double avg = (maraMarks + EngMarks + mathMarks + sSMarks + SciMarks) / 5;

            char ch;
            if (avg > 75)
                ch = 'A';

            if (avg > 60)
                ch = 'B';

            if (avg > 50)
                ch = 'C';

            if (avg > 40)
                ch = 'D';

            if (avg >= 35)
                ch = 'A';

            else
                ch = 'F';

            switch (ch) {
                case 'A':
                    System.out.println("First class");
                    break;

                case 'B':
                    System.out.println("First class with Distiction");
                    break;

                case 'C':
                    System.out.println("Second class class");
                    break;

                case 'D':
                    System.out.println("Third class");
                    break;

                case 'E':
                    System.out.println("Pass");
                    break;

                case 'F':
                    System.out.println("fails");
                    break;
            }
        }
    }
}
