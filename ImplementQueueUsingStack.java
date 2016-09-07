class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> s1 = new Stack<Integer>();
    public void push(int x) {
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
           s1.remove(0);
    }

    // Get the front element.
    public int peek() {
        return s1.get(0);
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty();
    }
}