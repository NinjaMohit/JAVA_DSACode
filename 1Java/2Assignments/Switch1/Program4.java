import java.util.*;

import javax.sound.sampled.SourceDataLine;

class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("What's your interest?");
        System.out.println("1. movies");

        System.out.println("2. Series");

        System.out.print("Enter your choice 1 or 2:");

        choice = sc.nextInt();

        switch (choice) {

            case 1: {

                int wish;

                System.out.println("Movie you wish to watch today");
                System.out.println("1.Founder");
                System.out.println("2. Snowden");
                System.out.println("3. Jobs");
                System.out.println("4. Her");
                System.out.println("5. Social Network");
                System.out.println("6. Wall-E");
                System.out.println("7. Al");
                System.out.print("Enter your choice 1 or 2: ");
                wish = sc.nextInt();

                switch (wish) {

                    case 1:

                        System.out.println("You wished to watch Founder a movie");
                        break;

                    case 2:
                        System.out.println("You wished to watch snowDown a movie");
                        break;

                    case 3:
                        System.out.println("You wished to watch Job a movie");
                        break;

                    case 4:
                        System.out.println("You wished to watch Her Movie");
                        break;

                    case 5:
                        System.out.println("You wished to watch Social movie");
                        break;

                    case 6:
                        System.out.println("You wished to watch AI movie");
                        break;

                    case 7:
                        System.out.println("You wished to watch Good movie");
                        break;
                }
            }
        }
    }
}
