package com.alokproject.libraryManagementSystem;

public class Magazine extends LibraryItem {
    private int issueNumber;
    public Magazine(String itemId,String title,int issueNumber){
        super(itemId,title);
        this.issueNumber=issueNumber;
    }
    @Override
    public void showDetails(){

    }
}
