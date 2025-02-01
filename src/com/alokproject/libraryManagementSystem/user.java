package com.alokproject.libraryManagementSystem;

public class user {
    //we are having a fields in this user's class
    protected String userId;
    protected String name;
    protected int maxBorrowLimit=1;
    private LibraryItem borrowedItem;//by default it is in null State
    public user(String userId,String name){
        this.userId=userId;
        this.name=name;
        this.borrowedItem=null;
    }
    //various type of method are there inside this library system
    public void borrow(LibraryItem item){
        if(this.borrowedItem!=null){
            System.out.println(name+"can't borrow an item return it first");
        }
        else if(item.isAvailable()){
            borrowedItem=item;
            item.borrowItem();
        }
        //this field will be updated when we borrow an items from a library

    }
    public void returnItem(){
        if(borrowedItem==null){
            System.out.println(name+"has no borrowed item");
        }
        else{
            borrowedItem.returnItem();
            borrowedItem=null;
        }
        //on borrowed items we can simple call returnitem beacuse we are having a reference of libraryItem

    }
    public void showBorrowItem(){
      if(borrowedItem==null){
          System.out.println(name+"has no borrowed item");
      }
      else{
          System.out.println(name+"has borrowed: ");
          borrowedItem.showDetails();
      }
    }
}
