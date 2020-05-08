package com.singlyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {
    @Test
    public void checkingAddFeature() {
    SinglyLinkedList sll= new SinglyLinkedList(9);
    sll.add("Milan");
    sll.add("Bridgzlab");
    String s =(String)sll.printall();
    Assert.assertEquals("Bridgzlab Milan 9 ",s);
    }

    @Test
    public void addingSameElementAgainMustDeletetheElement() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        sll.add(9);
        String s =(String)sll.printall();
        Assert.assertEquals("Bridgzlab Milan ",s);

    }

    @Test
    public void testSearchFeaturePositiveTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        String s =(String)sll.printall();
        Assert.assertTrue(sll.search(9));
    }

    @Test
    public void testSearchFeatureNegativeTesting() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        String s =(String)sll.printall();
        Assert.assertFalse(sll.search(1));
    }

    @Test
    public void testDeleteFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add("Bridgzlab");
        sll.deleteBySearch(9);
        String s =(String)sll.printall();
        Assert.assertEquals("Bridgzlab Milan ",s);
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
        String s =(String)sll.printall();
        Assert.assertEquals("Milan Bridgzlab ",s);
    }

    @Test
    public void testIndexFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.append("Bridgzlab");
        Assert.assertEquals(1,sll.displayIndex("Milan"));
    }

    @Test
    public void addAtIndexFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add(90);
        sll.append("Bridgzlab");
        sll.addAtIndex(3,98);
        String s =(String)sll.printall();
        Assert.assertEquals("90 Milan 9 98 Bridgzlab ",s);
    }

    @Test
    public void testingPopFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add(90);
        sll.append("Bridgzlab");
        sll.pop();
        String s =(String)sll.printall();
        Assert.assertEquals("90 Milan 9 ",s);
    }

    @Test
    public void testingPopAtIndexFeature() {
        SinglyLinkedList sll= new SinglyLinkedList(9);
        sll.add("Milan");
        sll.add(90);
        sll.append("Bridgzlab");
        sll.popAtIndex(1);
        String s =(String)sll.printall();
        Assert.assertEquals("90 9 Bridgzlab ",s);
    }
}
