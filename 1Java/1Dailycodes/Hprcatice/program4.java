class Demo {
    int x = 10;
    String name = "virat";

    Demo(int x, String name) {
        this.x = x;
        this.name = name;
        System.out.println("In constructor Demo");
    }

    void fun() {
        System.out.println(x + " " + name);
    }
}

class Client2 {
    public static void main(String[] args) {
        Demo obj = new Demo(20, "mohit");
        obj.fun();

    }
}
