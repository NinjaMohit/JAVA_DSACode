
class Parent {
    Parent() {
        System.out.println("In parent constructor");
    }

    void parentProperty() {
        System.out.println("Flat");
        System.out.println("Business");
        System.out.println("Farm");
        System.out.println("Gold");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("In child constructor");
    }
}

class Client {
    public static void main(String[] args) {
        // Parent obj = new Parent();
        // obj.parentProperty();

        // Object obj = new Parent();

        // Child obj=new Child();
        // Parent obj=new Child();
        // Object obj = new Child();

    }
}
