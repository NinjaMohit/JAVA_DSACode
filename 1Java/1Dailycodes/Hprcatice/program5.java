class Parent1 {
    static int x = 10;

    static {
        System.out.println("In Parent static block: ");
    }

    static void access() {
        System.out.println(x);
    }
}

class Child1 extends Parent1 {
    {
        System.out.println("In Child static block: ");
        System.out.println(x);
        access();
    }
}

class Client1 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
    }
}