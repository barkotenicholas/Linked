public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertFront(1);
        linkedList.insertFront(3);
        linkedList.insertFront(4);
        linkedList.insertFront(5);
        linkedList.insertFront(9);


        linkedList.reverse();

        System.out.println("Reversed");
        linkedList.printList();


    }
}
