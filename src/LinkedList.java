public class LinkedList {

    private Node head;
    private int size;

    public void insertFront(int data){

        Node node = new Node(data);
        node.setNext(head);
        head = node;

        size++;
    }

    public int removeFront(){

        if(isEmpty()){
            return -1;
        }
        Node node = head;
        head = head.getNext();
        size --;
        node.setNext(null);
        return node.getData();

    }

    public int getSize() {
        return size;
    }

    public Boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null){

            System.out.println(current);

            System.out.print("-> ");

            current = current.getNext();
        }
        System.out.println("Null");
    }

}
