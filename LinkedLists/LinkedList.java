package DataStructs.ProblemSet5;

class LinkedList<T> {
    Node<T> head;
    Node<T> last;

    public LinkedList() {
        this.head = new Node<T>(null);
        this.last = this.head;
    }

    public void addLast(T a){
        Node<T> newNode = new Node<T>(a);
        this.last.next = newNode;
        this.last = newNode;
    }

    public void addFirst(T a){
        Node<T> newNode = new Node<T>(a);
        newNode.next = this.head.next;
        this.head.next = newNode;
    }

    public void printList() {
        Node<T> curr = this.head.next;

        while (curr != null){
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null\n");
    }

    public Node<T> getrefferenceAt(int index){
        Node<T> curr = this.head.next;

        int counter = 0;
        while ((curr != null) && counter < index){
            counter++;
            curr = curr.next;
        }
        return curr;
    }

    public void addAt(T a, int index){
        Node<T> newNode = new Node<T>(a);
        Node<T> curr = this.getrefferenceAt(index-1);

        if (curr != null){
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public void remove(int index) {
        Node<T> curr = this.getrefferenceAt(index-1);
        curr.next = curr.next.next;
    }
}
