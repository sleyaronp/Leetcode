class MyQueue {
    
    //Queue: First in first out
    //Stack: Last in first out
    //Stack operation: push to top, peek/pop from top, size, is empty
    
    Stack<Integer> mystack = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) { //push to the head of the stack
        if(mystack.isEmpty()){
            mystack.push(x);
        }else{
            while(!mystack.isEmpty()){
                temp.push(mystack.pop());
            }
            
            mystack.push(x);
            
            while(!temp.isEmpty()){
                mystack.push(temp.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        mystack.pop();
    }

    // Get the front element.
    public int peek() {
        return mystack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return mystack.isEmpty();
    }
    
    //or in another direction, the temp serves as the main stack/queue
}
