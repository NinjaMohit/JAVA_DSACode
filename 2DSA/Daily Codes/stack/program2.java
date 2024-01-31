/*import java.util.*;
class Stack{
    int stackArr[];
    int maxSize;
    int top=-1;

    Stack(int size){
        this.stackArr=new int[size];
        this.maxSize=size;
    }
    
        void  push(int data){
            if(top==maxSize-1){
                System.out.println("StackOverflow");
            }
            else{
                top++;
                stackArr[top]=data;
            }
        }

        void printtack(){
            if(empty()){
                System.out.println("Stack is empty");
            }else{
            for(int i=0;i<maxSize;i++){
            System.out.println(stackArr[i]);
        
            }
         }
        }

        boolean empty(){
            if(top==-1)
            return true;
            else
            return false;
        }


        void pop(int data){
            if(empty()){
                System.out.println("Stack is empty");
               
            }
            else{
                
                int val=stackArr[top];
                top--;
                System.out.println("pop value is :"+val);
            }
        }

        void peek(){
            if(empty()){
                System.out.println("Stack is empty");
            }
            else{
                System.out.println("peek value is "+stackArr[top]);
            }

        }

        


}
class Client{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENter stack size");
        int size=sc.nextInt();

        Stack s=new Stack(size);


        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.pop(30);
        

        s.peek();
        s.printtack();
        
        
        
        }
        
    }
*/