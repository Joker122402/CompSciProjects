import javax.print.attribute.standard.JobHoldUntil;

public class Main {
    public static void main(String args[]){
        // Demonstrate Stack
        Stack<User> myStack = new Stack<User>();

        if (myStack.isEmpty()){
            System.out.println("Stack is empty");
        }

        User john = new User(100, "john", 11);
        User mike = new User(200, "mike", 12);
        User james = new User(300, "james", 13);
        User tom = new User(400, "tom", 14);

        myStack.push(john);
        myStack.push(mike);
        myStack.push(james);
        myStack.push(tom);

        System.out.println(myStack.top());
        System.out.println("Total elements in the stack: " + myStack.size());
        System.out.println(myStack.pop());
        System.out.println("Total elements in the stack: " + myStack.size());
        System.out.println(myStack.pop());
        System.out.println("Total elements in the stack: " + myStack.size());
        System.out.println(myStack.pop());
        System.out.println("Total elements in the stack: " + myStack.size());
        System.out.println(myStack.pop());



        // Demonstrate Queue
        Queue<User> myQueue = new Queue<User>();

        if (myQueue.isEmpty()){
            System.out.println("Queue is empty");
        }

        User smith = new User(100, "smith", 11);
        User will = new User(200, "will", 12);
        User dan = new User(300, "dan", 13);
        User brian = new User(400, "brian", 14);

        myQueue.enqueue(smith);
        myQueue.enqueue(will);
        myQueue.enqueue(dan);
        myQueue.enqueue(brian);

        System.out.println(myQueue.peek());
        System.out.println("Total elements in the stack: " + myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println("Total elements in the stack: " + myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println("Total elements in the stack: " + myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println("Total elements in the stack: " + myQueue.size());
        System.out.println(myQueue.dequeue());
    }
}
