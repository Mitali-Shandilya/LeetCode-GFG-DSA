import java.util.Stack;

class queue_optimised{
    Stack<Integer>input=new Stack<>();
    Stack<Integer>output=new Stack<>();
    public queue_optimised(){
    }
    public void push(int x){
        input.push(x);
    }
    public int pop() {
        if (output.empty())
        while (input.empty() == false) {
            output.push(input.peek());
            input.pop();
        }
        int x = output.peek();
        output.pop();
        return x;
    }
    public int peek() {
        if (output.empty())
        while (input.empty() == false) {
            output.push(input.peek());
            input.pop();
        }
    return output.peek();
    }
    int size() {
        return (output.size() + input.size());
    }
    public boolean empty(){
        return input.isEmpty() && output.isEmpty();
    }
}