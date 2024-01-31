public class sbmprogram2 {
    public static void main(String[] args) {
        String str = "Core2Web";
        char arr[] = str.toCharArray();

        // int arr[] = { 10, 20, 30, 40, 50 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "");
        }

    }

}
