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

    @Test
    public void testSearchFeaturePositiveTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        String s =sll.printall();
        Assert.assertTrue(sll.search(9));
    }

    @Test
    public void testSearchFeatureNegativeTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        String s =sll.printall();
        Assert.assertFalse(sll.search(1));
    }

    @Test
    public void testDeleteFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        sll.deleteBySearch(9);
        String s =sll.printall();
        Assert.assertEquals("Milan Bridgzlab ",s);
    }

    @Test
    public void testForCheckingEmptyPositiveTesting() {
        SinglyLinkedList sll= new SinglyLinkedList();
        Assert.assertTrue(sll.isEmpty());
    }

    @Test
    public void testForCheckingEmptyNegativeTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        Assert.assertFalse(sll.isEmpty());
    }

    @Test
    public void checkSizePositiveTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        Assert.assertEquals(3,sll.size());
    }

    @Test
    public void checkSizeNegativeTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        Assert.assertFalse(4==sll.size());
    }

    @Test
    public void testingAppendFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.append("Bridgzlab");
        sll.append(9);
        String s =sll.printall();
        Assert.assertEquals("9 Milan Bridgzlab 9 ",s);

    }
}
