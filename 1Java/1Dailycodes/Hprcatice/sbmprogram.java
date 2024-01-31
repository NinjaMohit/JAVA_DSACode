public class sbmprogram {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Core2web");
        StringBuffer sb2 = new StringBuffer("class");

        sb1.append(sb2);
        System.out.println(sb1);

        sb2.insert(4, "mohit");
        System.out.println(sb2);
        sb2.delete(4, 7);

        System.out.println(sb2);

    }
}
