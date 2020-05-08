package com.singlyLinkedList;

public class SinglyLinkedList <E extends Comparable>{

    class Node<T extends Comparable> {
        private Node link;
        private T item;

        Node(T item){
            this.item = item;
        }
    }
    private Node tail;
    private Node head;
    int length=0;

    public SinglyLinkedList(){}

    public  SinglyLinkedList(E item){
        head=new Node(item);
        head.link=tail;
        length++;
    }

    public void add(E item){
        if (head==null){
            head=new Node(item);
            head.link=tail;
            length++;
        }else if(this.search(item)){
           this.deleteBySearch(item);
        }
        else{
            Node n = new Node(item);
            Node n1=head;
            while (n1.link!=null){
                n1=n1.link;
            }
            n1.link=n;
            length++;
        }
    }

    public boolean search(E item){
        boolean isPresent=false;
        Node searchingNode=head;
        while(searchingNode!=null){
            if(searchingNode.item==item) {
                isPresent=true;
                break;
            }
            searchingNode=searchingNode.link;
        }
        return isPresent;
    }

public void deleteBySearch(E item){
        if(head.item==item){
            head=head.link;
        }else{
             Node searchingNode=head;
            while(searchingNode!=null){
                if(searchingNode.link.item==item) {
                     searchingNode.link=searchingNode.link.link;
                     length--;
                    break;
                }
             searchingNode=searchingNode.link;
            }
        }
}

public boolean isEmpty() {
        return length==0;
}

    public String printall(){
        String s="";
        Node printingNode=head;
        while(printingNode!=null){
            s+=printingNode.item+" ";
            printingNode=printingNode.link;
        }
        return s;
    }

}
