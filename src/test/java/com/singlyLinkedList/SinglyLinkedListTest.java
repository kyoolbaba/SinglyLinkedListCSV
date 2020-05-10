package com.singlyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {
    @Test
    public void checkingAddFeature() throws SinglyLinkedListException{
    SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
    singlyLinkedList.add("Milan");
    singlyLinkedList.add("Bridgzlab");
    String s =(String)singlyLinkedList.printAll();
    Assert.assertEquals("Bridgzlab Milan 9 ",s);
    }

    @Test
    public void addingSameElementAgainMustDeletetheElement()throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add("Bridgzlab");
        singlyLinkedList.add(9);
        String s =(String)singlyLinkedList.printAll();
        Assert.assertEquals("Bridgzlab Milan ",s);

    }

    @Test
    public void testSearchFeaturePositiveTesting() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add("Bridgzlab");
        String s =(String)singlyLinkedList.printAll();
        Assert.assertTrue(singlyLinkedList.search(9));
    }

    @Test
    public void testSearchFeatureNegativeTesting() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add("Bridgzlab");
        String s =(String)singlyLinkedList.printAll();
        Assert.assertFalse(singlyLinkedList.search(1));
    }

    @Test
    public void testDeleteFeature() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add("Bridgzlab");
        singlyLinkedList.delete(9);
        String s =(String)singlyLinkedList.printAll();
        Assert.assertEquals("Bridgzlab Milan ",s);
    }

    @Test
    public void testForCheckingEmptyPositiveTesting() {
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList();
        Assert.assertTrue(singlyLinkedList.isEmpty());
    }

    @Test
    public void testForCheckingEmptyNegativeTesting() {
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        Assert.assertFalse(singlyLinkedList.isEmpty());
    }

    @Test
    public void checkSizePositiveTesting()throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add("Bridgzlab");
        Assert.assertEquals(3,singlyLinkedList.size());
    }

    @Test
    public void checkSizeNegativeTesting() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add("Bridgzlab");
        Assert.assertFalse(4==singlyLinkedList.size());
    }

    @Test
    public void testingAppendFeature() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.append("Bridgzlab");
        singlyLinkedList.append(9);
        String s =(String)singlyLinkedList.printAll();
        Assert.assertEquals("Milan Bridgzlab ",s);
    }

    @Test
    public void testIndexFeature() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.append("Bridgzlab");
        Assert.assertEquals(1,singlyLinkedList.displayIndex("Milan"));
    }

    @Test
    public void addAtIndexFeature() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add(90);
        singlyLinkedList.append("Bridgzlab");
        singlyLinkedList.addAtIndex(3,98);
        String s =(String)singlyLinkedList.printAll();
        Assert.assertEquals("90 Milan 9 98 Bridgzlab ",s);
    }

    @Test
    public void testingPopFeature() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add(90);
        singlyLinkedList.append("Bridgzlab");
        singlyLinkedList.pop();
        String s =(String)singlyLinkedList.printAll();
        Assert.assertEquals("90 Milan 9 ",s);
    }

    @Test
    public void testingPopAtIndexFeature() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add(90);
        singlyLinkedList.append("Bridgzlab");
        singlyLinkedList.pop(1);
        String s =(String)singlyLinkedList.printAll();
        Assert.assertEquals("90 9 Bridgzlab ",s);
    }

    @Test
    public void testAddindNullValue() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add(90);
        try {
            singlyLinkedList.add(null);
        }catch(SinglyLinkedListException e){
        Assert.assertEquals(SinglyLinkedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void testAppendNullValue() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add(90);
        try {
            singlyLinkedList.append(null);
        }catch(SinglyLinkedListException e){
            Assert.assertEquals(SinglyLinkedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void searchNullThrowsException() throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList(9);
        singlyLinkedList.add("Milan");
        singlyLinkedList.add(90);
        try {
            singlyLinkedList.search(null);
        }catch(SinglyLinkedListException e){
            Assert.assertEquals(SinglyLinkedListException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void deleteElementNotInList() throws Exception{
        SinglyLinkedList singlylLinkedList = new SinglyLinkedList(9);
        singlylLinkedList.add("Milan");
        singlylLinkedList.add(90);
        try {
            singlylLinkedList.delete(89);
        }catch(SinglyLinkedListException e){
            Assert.assertEquals(SinglyLinkedListException.ExceptionType.ELEMENT_NOT_FOUND,e.type);
        }
    }


}
