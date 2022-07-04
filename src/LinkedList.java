public class LinkedList {

    private Node head;
    private int size;

    public void insertFront(int data){

        Node node = new Node(data);
        node.setNext(head);
        head = node;

    }

}
