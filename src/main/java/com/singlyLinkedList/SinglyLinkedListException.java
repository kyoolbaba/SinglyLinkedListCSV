package com.singlyLinkedList;

public class SinglyLinkedListException extends Exception {

    enum ExceptionType {
        ENTERED_NULL,SEARCHING_NULL_VALUE,ELEMENT_NOT_FOUND
    }
    ExceptionType type;

    public SinglyLinkedListException(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
