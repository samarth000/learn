class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> MinVal;
    public MinStack() {
        stack= new Stack<>();
        MinVal = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        val= Math.min(val, MinVal.isEmpty()? val: MinVal.peek());
        MinVal.push(val);
        
    }
    
    public void pop() {
        stack.pop();
        MinVal.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinVal.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */