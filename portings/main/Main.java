package portings.main;
import portings.queue.Queue;
import portings.stack.Stack;
public class Main {
    public static void main(String args[]){

        System.out.println("Stack test\n");
        Stack stack=new Stack();
        stack.push(11);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.traverseStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());

        stack.traverseStack();
        System.out.println("Queue test\n");
        Queue q=new Queue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.deQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.traverseQueue();
        q.deQueue();
        q.traverseQueue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());


    }
}
