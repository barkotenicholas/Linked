public class Main {
    public static void main(String[] args) {




        LinkedList linkedList = new LinkedList();

        linkedList.insertFront(1);
        linkedList.insertFront(3);
        linkedList.insertFront(4);
        linkedList.insertFront(5);
        linkedList.insertFront(9);

        linkedList.printList();

        linkedList.insertAt(2,22);

        linkedList.printList();


    }
}
