package com.alokproject.libraryManagementSystem;

public class LibraryItem {
    //properties of this class are written in order as follows:
    protected String itemId;
    protected String title;
    protected boolean isAvailable;
    public LibraryItem(String itemId,String title){
        this.itemId=itemId;
        this.title=title;
        isAvailable=true;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    //various kind's
    public void borrowItem(){
     if(isAvailable){
         System.out.println(title+"borrowed succesfully");
         isAvailable=false;
     }
     else{
         System.out.println(title+"is not available");
     }
    }
    public void returnItem(){
      isAvailable=true;
        System.out.println(title+"return succesfully");
    }
    public void showDetails(){
        System.out.println("Id: "+itemId+"\n Title: "+title+"\n Available: "+isAvailable);
    }
}
