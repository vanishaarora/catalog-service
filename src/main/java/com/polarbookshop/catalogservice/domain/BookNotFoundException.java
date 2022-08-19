package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String isbn){
        super("The Book with ISBN: "+isbn +"was not found.");
    }
}
