/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Malak Elsayed
 */

import java.util.ArrayList ;
public class LibraryCatalog {
        ArrayList<Book> booklist; 
        
        
        LibraryCatalog(){
            this.booklist = new ArrayList<>();
        }
        
        LibraryCatalog(ArrayList<Book> booklist){
            this.booklist = booklist;
        }
        
        public void AddBooks(Book book){
            booklist.add(book);
            book.setStatus(true) ;
        }
        
        public void AvailbleBooks(){
          for(int i = 0 ; i < booklist.size() ; i++){
              if(booklist.get(i).getStatus()){
                  System.out.println((i+1)+ "-" + booklist.get(i).getTitle());
              }
          }
        }
        
        public boolean SearchByTitle(String title){
            Book book = new Book() ;
            boolean flag = false ;
            for(int i = 0 ; i < booklist.size() ; i++){
               if (title.equals(booklist.get(i).getTitle())) {
                   flag = true ;
               }
            }
            
            if(flag){
                book.setStatus(flag) ;
             
            }
          return flag ;
        }
        
        public boolean SearchByAuthor(String author){
            Book book = new Book() ;
            boolean flag = false ;
            for(int i = 0 ; i < booklist.size() ; i++){
               if(author.equals(booklist.get(i).getAuthor()) ) {
                   flag = true ;
               }
            }
            
            if(flag){
                book.setStatus(flag) ;
            }
            
            return flag ;
        }  
        
        public void Checkout(String checkout){
            for(int i = 0 ; i<booklist.size() ; i++){
                if(checkout.equals(booklist.get(i).getTitle()) || checkout.equals(booklist.get(i).getAuthor())  ){
                    booklist.remove(i) ;
                }
            }
            
            System.out.println("Book is checked out successfully!");
        }
        
        
        public void ReturnBooks(Book book){
             
           booklist.add(book);
            System.out.println("Book is returned successfully!");
        }
}
