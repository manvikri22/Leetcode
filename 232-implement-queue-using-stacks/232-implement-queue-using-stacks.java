class MyQueue {

    Stack < Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        while(input.empty()==false)
        {
            output.push(input.peek());
            input.pop();
        }
        input.push(x);
        while(output.empty()==false)
        {
            input.push(output.peek());
            output.pop();
        }
            
    }
    
    public int pop() {
        
        int val = input.peek();
        input.pop();
        return val;
        
    }
    
    public int peek() {
        
        return input.peek();
    }
    
    public boolean empty() {
        
        if(input.empty()==true)
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */