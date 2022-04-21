package DataStructs.ProblemSet5;

public class UserLinkedList {
    UserNode head;
    UserNode last;

    public UserLinkedList() {
        this.head = new UserNode(null);
        this.last = this.head;
    }

    public void addLast(User a){
        UserNode newNode = new UserNode(a);
        this.last.next = newNode;
        this.last = newNode;
    }

    public void addFirst(User a){
        UserNode newNode = new UserNode(a);
        newNode.next = this.head.next;
        this.head.next = newNode;
    }

    public void printList() {
        UserNode curr = this.head.next;

        while (curr != null){
            System.out.println(curr.data.userId + " -> ");
            curr = curr.next;
        }
        System.out.println("null\n");
    }

    public UserNode getrefferenceAt(int index){
        UserNode curr = this.head.next;

        int counter = 0;
        while ((curr != null) && counter < index){
            counter++;
            curr = curr.next;
        }
        return curr;
    }

    public void addAt(User a, int index){
        UserNode newNode = new UserNode(a);
        UserNode curr = this.getrefferenceAt(index-1);

        if (curr != null){
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public void remove(int index) {
        UserNode curr = this.getrefferenceAt(index-1);
        curr.next = curr.next.next;
    }
}
