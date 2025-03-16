class queue_2stack{
    Stack<Integer>input=new Stack<>();
    Stack<Integer>output=new Stack<>();
    public queue_2stack(){
    }
    public void push(int x){
        while(input.empty()==false){
            output.push(input.peek());
            input.pop();
        }
        System.out.println("The element pushed is " + x);
        input.push(x);
        while (output.empty() == false) {
            input.push(output.peek());
            output.pop();
        }
    }
    public int pop() {
        if (input.empty()) {
            System.out.println("Stack is empty");
        }
        int val = input.peek();
        input.pop();
        return val;
    }
    public int peek() {
        if (input.empty()) {
            System.out.println("Stack is empty");
        }
        return input.peek();
    }
    int size() {
        return input.size();
    }
}
