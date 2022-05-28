package az.et.part02.lesson09.linkedlist;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void add(T t) {
        Node<T> newNode = new Node<>(t);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void printList() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr + " ---> ");
            curr = curr.getNext();
        }
        System.out.print("null\n");
    }

}
