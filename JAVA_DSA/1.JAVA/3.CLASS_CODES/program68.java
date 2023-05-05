
class program68 {
    public static void main(String[] args) {
        String str = "veg";
        System.out.println("Before switch");

        switch (str) {
            case "veg":
                String str1 = "Starter";

                switch (str1) {

                    case "Starter":
                        System.out.println("juice");
                        break;
                    case "food":
                        System.out.println("Vadapav");
                        break;
                }
                break;

            case "Non veg":
                String str2 = "Starternonveg";

                switch (str2) {
                    case "Starternonveg":
                        System.out.println("juice");
                        break;
                    case "food":
                        System.out.println("Vadapav");
                        break;
                }
                break;

        }
        System.out.println("After Switch");
    }
}

