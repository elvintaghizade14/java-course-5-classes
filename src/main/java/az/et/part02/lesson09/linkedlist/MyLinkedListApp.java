package az.et.part02.lesson09.linkedlist;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println(myLinkedList.getHead());
        System.out.println(myLinkedList.getSize());

        myLinkedList.add(1); //head adding
        myLinkedList.add(2); //element adding

        myLinkedList.printList();

        myLinkedList.add(3); //element adding
        myLinkedList.add(4); //element adding
        myLinkedList.printList();

    }
}
