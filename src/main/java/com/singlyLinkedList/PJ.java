package com.singlyLinkedList;

public class PJ {
    private String number;
    private String Name;
    private String location;
    private String gender;

    public PJ(String number, String name, String location, String gender) throws SinglyLinkedListException{
        SinglyLinkedList singlyLinkedList= new SinglyLinkedList();
        this.number = number;
        Name = name;
        this.location = location;
        this.gender = gender;
        singlyLinkedList.add(this);
        System.out.println("Printing");
        System.out.println(singlyLinkedList.getElement(0));
    }

    public static void main(String[] args) throws SinglyLinkedListException {
        PJ pj=new PJ("7760271667","Milan","Bangalore","Male");
    }

    @Override
    public String toString() {
        return "PJ{" +
                "number='" + number + '\'' +
                ", Name='" + Name + '\'' +
                ", location='" + location + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
