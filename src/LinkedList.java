public class LinkedList {

    public Node head;
    private int size;

    public void insertFront(int data) {

        Node node = new Node(data);
        node.setNext(head);
        head = node;

        size++;
    }

    public int removeFront() {

        if (isEmpty()) {
            return -1;
        }
        Node node = head;
        head = head.getNext();
        size--;
        node.setNext(null);
        return node.getData();

    }

    public void remove(int value) {


        Node current = head , prev = null;

        if (current != null && current.data == value) {
            head = current.next;
            return;
        }

        while (current != null && current.data != value) {
          prev = current;
          current = current.getNext();
        }

        if (current == null) return;

        prev.next = current.next;



    }

    public void insertAt(int index, int data) {

        if (isEmpty() && index > size && size < 1) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }

        Node current = head;

        int i = 1;

        while (current != null) {

            if (i == index - 1) {

                Node node = new Node(data);
                node.setNext(current.getNext());
                current.setNext(node);

            }

            current = current.getNext();
            i++;
        }

    }

    public void reverse() {

        Node current = head;
        Node previous = null;
        while (current != null) {
            Node nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;

        }

        head = previous;

    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        Node current = head;
        System.out.print("HEAD ->  \n");
        while (current != null) {

            System.out.println(current);

            System.out.print("-> ");

            current = current.getNext();
        }
        System.out.println("Null");
    }

}
