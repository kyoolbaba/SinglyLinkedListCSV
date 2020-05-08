package com.singlyLinkedList;

public class SLltest {
    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList("Milan");
        sll.add("hey");
        sll.add(9);
        sll.add("Juice kuditya");
        System.out.println(sll.printall());
        System.out.println();
        sll.deleteBySearch("hey");
        System.out.println(sll.printall());
        //sll.printall();

    }
}
