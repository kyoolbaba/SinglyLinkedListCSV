package com.singlyLinkedList;

public class SinglyLinkedList<E extends Object> {

    class Node<T extends E> {
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

    public final void append(E item) throws SinglyLinkedListException{
        if(item!=null){
        if (head==null){
            head=new Node(item);
            head.link=tail;
            length++;
        }else if(this.search(item)){
           this.delete(item);
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
        }else{
            throw new SinglyLinkedListException(SinglyLinkedListException.ExceptionType.ENTERED_NULL,
                                                                        "Value inserted is Null");
        }
    }

    public final void add(E item) throws SinglyLinkedListException{
        if(item!=null){
        if (head==null){
            head=new Node(item);
            head.link=tail;
            length++;
        }else if(this.search(item)){
            this.delete(item);
        }
        else{
            Node newnode=new Node(item);;
            newnode.link=head;
            head=newnode;
            length++;
        }
        }else{
            throw new SinglyLinkedListException(SinglyLinkedListException.ExceptionType.ENTERED_NULL,
                    "Null Value Entered");
        }
    }

    public final boolean search(E item) throws SinglyLinkedListException{
        boolean isPresent=false;
        if(item!=null){
        Node searchingNode=head;
        while(searchingNode!=null){
            if(searchingNode.item==item) {
                isPresent=true;
                break;
            }
            searchingNode=searchingNode.link;
        }
        }else{
            throw new SinglyLinkedListException(SinglyLinkedListException.ExceptionType.ENTERED_NULL,
                                                "Null Value Entered");
        }
        return isPresent;
    }

    public final void delete(E item) throws SinglyLinkedListException {
        if(this.search(item)){
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
        }else{
            throw new SinglyLinkedListException(SinglyLinkedListException.ExceptionType.ELEMENT_NOT_FOUND,
                                                "The Element is not present in the list");
        }
    }

    public final int size(){
        return length;
    }


    public final boolean isEmpty() {
        return length==0;
    }

    public final String printAll(){
        String s="";
        Node printingNode=head;
        while(printingNode!=null){
            s+=printingNode.item+" ";
            printingNode=printingNode.link;
        }
        return s;
    }

    public final E getElement(int position)throws SinglyLinkedListException{
        E element = null;
       if(position<length){
        if(position==0){
            element=(E)head.item;
        }else{
            int index=0;
            Node elementAtIndex=head;
            while(elementAtIndex.item!=null){
                if(index==position){
                    element=(E)elementAtIndex.item;
                    break;
                }
                index++;
                elementAtIndex=elementAtIndex.link;
            }
        }
       }else{
           throw new SinglyLinkedListException(SinglyLinkedListException.ExceptionType.SEARCHING_NULL_VALUE,
                   "searching null value");
       }
        return element;
    }

    public final int displayIndex(E item){
        int index=1;
        Node searchingNode=head;
        while(searchingNode!=null){
            if(searchingNode.item==item) {
                break;
            }
            index++;
            searchingNode=searchingNode.link;
        }
        return index;
    }

    public final void addAtIndex(int position ,E item) throws SinglyLinkedListException{
        int index=0;
        if(position==length){
            this.append(item);
        }else if(position==0){
            this.add(item);
        }
        else{
            Node insertingNode= head;
            Node newnode=new Node(item);
            while(insertingNode!=null){
                if(position-1==index){
                    newnode.link=insertingNode.link;
                    insertingNode.link=newnode;
                    length++;
                    break;
                }
                insertingNode=insertingNode.link;
                index++;
            }
        }
    }

    public final E pop(){
        E value;
        Node deleteLastNode=head;
        if(!isEmpty()){
            if(length==1){
                value=(E)head.item;
                head=null;
            }
            else{
                int index=0;
                while(deleteLastNode.link.link!=null){
                    deleteLastNode=deleteLastNode.link;
                }
                value= (E)deleteLastNode.link.item;
                deleteLastNode.link=null;
            }
            length--;
            return value;

        }else{
            length=0;
            return null;
        }

    }

    public final void pop(int position){
        if(!isEmpty()){
            if(position==0){
                head=head.link;
            }else if(position==length-1){
                this.pop();
            }else{
                int index=0;
                Node deleteAtNode=head;
                while(deleteAtNode.link!=null){
                    if(index==position-1){
                        deleteAtNode.link=deleteAtNode.link.link;
                    }
                    index++;
                    deleteAtNode=deleteAtNode.link;
                }
             }
        length--;
        }

    }

}

