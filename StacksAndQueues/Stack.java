class Stack<T>{
    public Node<T> head;
    public int length;

    public Stack(){
        this.head=null;
        this.length=0;
    }

    public void push(T data){
        Node<T> temp = new Node<T>(data);
        temp.next=head;
        head=temp;
        length++;
    }

    public T pop(){
        T result = head.data;
        head = head.next;
        length--;
        return result;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public T top(){
        return head.data;
    }
}