package DataStructs.ProblemSet5;

class main {
    public static void main(String[] args) {

        // User Class Demo
        UserLinkedList myList = new UserLinkedList();

        User a = new User(100, "Dave", 19);
        User b = new User(200, "Dan", 20);
        User c = new User(300, "Bob", 21);
        User d = new User(400, "Mike", 22);

        myList.addFirst(a);
        myList.addFirst(b);
        myList.addFirst(c);
        myList.addFirst(d);
        myList.printList();

        User e = new User(500, "John", 23);

        myList.addAt(e, 3);
        myList.printList();

        myList.remove(3);
        myList.printList();



        // Generic Class demo
        LinkedList<User> myListGeneric = new LinkedList<User>();

        User aa = new User(1000, "Dave", 19);
        User bb = new User(2000, "Dan", 20);
        User cc = new User(3000, "Bob", 21);
        User dd = new User(4000, "Mike", 22);

        myListGeneric.addFirst(aa);
        myListGeneric.addFirst(bb);
        myListGeneric.addFirst(cc);
        myListGeneric.addFirst(dd);
        myListGeneric.printList();

        User ee = new User(5000, "John", 23);

        myListGeneric.addAt(ee, 3);
        myListGeneric.printList();

        myListGeneric.remove(3);
        myListGeneric.printList();
    }
}
