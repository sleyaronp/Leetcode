class MyStack {
/*
  public interface Queue<E> extends Collection<E> {
    boolean add(E e); //insert specified element
    E element(); // retrieve
    boolean offer(E e);  //insert the specified element into the queue
    E peek(); //retrieve, return the head of the queue
    E poll(); //retrieve, remove and return the head of the queue
    E remove();  //remove the head of the queue
}
*/
    LinkedList<Integer> q1 = new LinkedList<Integer>();
    LinkedList<Integer> q2 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
       q1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        q1.remove();
        
        LinkedList<Integer> q3 = q1;
        q1 = q2;
        q2 = q3;
    }

    // Get the top element.
    public int top() {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        
        int top = q1.poll();
        q2.add(top);
        
        LinkedList<Integer> q3 = q1;
        q1 = q2;
        q2 = q3;
        
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
