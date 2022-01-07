package dailybyte;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {
    LinkedList<Integer> stack = new LinkedList();
    List<Integer> list = new Stack<>();
    Stack<Integer> queue = new Stack<>();
    Queue<Integer> q = new LinkedList<>();

    public void push(int num){
        q.add(num);
        for (int i = 0; i < q.size(); i++){
            q.add(q.remove());
        }
        queue.push(num);
//        list.add(0, num);
//        stack.addFirst(num);
    }

    public int peek(){
        if(empty())
            return -1;
        return queue.peek();
//        list.get(0);
//        return stack.getFirst();
    }

    public void pop(){
        if(empty())
            return;
        queue.remove(0);
//        list.remove(0);
//        stack.removeFirst();
    }

    public boolean empty(){
        return queue.size() == 0;
//        list.isEmpty();
//        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue{" + queue + '}';
    }

    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack();
        queueStack.push(3);
        queueStack.push(4);
        queueStack.push(5);
        queueStack.push(6);

        System.out.println(queueStack.peek());

        queueStack.pop();

        System.out.println(queueStack.peek());

        queueStack.push(7);

        System.out.println(queueStack.peek());

        System.out.println(queueStack.empty());

        System.out.println(queueStack.toString());
    }
}
