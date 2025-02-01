package com.alokproject.libraryManagementSystem;

public class Book extends LibraryItem{
    private String authorName;
    public Book(String itemId,String title,String authorName){
        super(itemId,title);
        this.authorName=authorName;
    }

    @Override
    public void showDetails(){
        System.out.println("book title"+title+"\n AuthorName: "+authorName);
    }
}
