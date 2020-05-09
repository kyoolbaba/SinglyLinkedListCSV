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

    public void append(E item){
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

    public void add(E item){
        if (head==null){
            head=new Node(item);
            head.link=tail;
            length++;
        }else if(this.search(item)){
            this.deleteBySearch(item);
        }
        else{
            Node newnode=new Node(item);;
            newnode.link=head;
            head=newnode;
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

public int size(){
        return length;
}


public boolean isEmpty() {
        return length==0;
}

    public E printall(){
        String s="";
        Node printingNode=head;
        while(printingNode!=null){
            s+=printingNode.item+" ";
            printingNode=printingNode.link;
        }
        E value=(E)s;
        return value;
    }

    public E getElement(int position){
        E element = null;
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
        return element;
    }

    public int displayIndex(E item){
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
        public void addAtIndex(int position ,E item){
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
    public E pop(){
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
    public void popAtIndex(int position){
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

