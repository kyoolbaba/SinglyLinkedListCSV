package com.singlyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {
    @Test
    public void checkingAddFeature() {
    SinglyLinkedList sll= new SinglyLinkedList(9);
    sll.add("Milan");
    sll.add("Bridgzlab");
    String s =sll.printall();
    Assert.assertEquals("9 Milan Bridgzlab ",s);
    }

    @Test
    public void addingSameElementAgainMustDeletetheElement() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        sll.add(9);
        String s =sll.printall();
        Assert.assertEquals("Milan Bridgzlab ",s);

    }
}
