import java.util.Scanner;

class Stack{
    int maxSize;
    int stackArr[];
    int top=-1;

    Stack(int size){
        this.stackArr=new int[size];
        this.maxSize=size;
    }

    void push(int data){
        if(top==maxSize-1){
            System.out.println("Stack is overflow");
        }
        else{
            top++;
            stackArr[top]=data;
        }
    }

    void pop(int data){
        if(empty()){
            System.out.println("Stack is empty");
        }else{
            
          System.out.println("pop is "+stackArr[top]);
            top--;
        }
    }

    boolean empty(){
        if(top==-1){
           return true;
        }
        else{
            return false;
        }
    }
    void peek(){
        if(empty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("peek is"+stackArr[top]);
        }
    }

    void printStack(){
     if(empty()){
        System.out.println("stack is empty");
     }
     else{
        System.out.print("[ ");
        for(int i=0;i<maxSize;i++){
            System.out.print(stackArr[i]+ " ");
        }
        System.out.println("]");
     }
    }
}

class Client{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of stack");

    int size=sc.nextInt();
    Stack s=new Stack(size);

    
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.printStack();z

    s.pop(40);
    s.peek();

    s.printStack();

}
}