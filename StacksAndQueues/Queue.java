class Queue<T> {
    public Node<T> head;
    public Node<T> tail;
    public int length;

    public Queue(){
        this.head = null;
        this.tail=null;
        this.length = 0;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(T data){
        Node<T> temp = new Node<T>(data);
        temp.data = data;

        if (isEmpty()){
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        length++;
    }

    public T dequeue(){
        T result = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        length--;
        return result;
    }

    public T peek(){
        return head.data;
    }
}
