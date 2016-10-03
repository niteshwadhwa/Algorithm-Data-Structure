public class MinStack {

    /** initialize your data structure here. */
    
    
    List<Integer> stack = new LinkedList<Integer>();
    
    public MinStack() {
        
    }
    
    int minimum = Integer.MAX_VALUE;
    public void push(int x) {
        if(x <= minimum){
            stack.add(minimum);
            minimum = x;
        }
        stack.add(x);
    }
    
    public void pop() {
        if(stack.get(stack.size()-1) == minimum){
            stack.remove(stack.size() - 1);
            minimum = stack.remove(stack.size() - 1);
        }else{
            stack.remove(stack.size() - 1);
        } 
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minimum;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */