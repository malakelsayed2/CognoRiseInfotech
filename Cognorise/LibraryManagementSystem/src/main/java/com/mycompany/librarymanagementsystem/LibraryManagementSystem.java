/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Malak Elsayed
 */

import java.util.Scanner ;
public class LibraryManagementSystem {

    public static void main(String[] args) {
       
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen");
        Book book5 = new Book("Moby Dick", "Herman Melville");

        LibraryCatalog Lc = new LibraryCatalog();
        
        Lc.AddBooks(book1);
         Lc.AddBooks(book2);
          Lc.AddBooks(book3);
           Lc.AddBooks(book4);
            Lc.AddBooks(book5);
            
            
             System.out.println("Welcome to The Library Main Menu!");
             Scanner sc = new Scanner(System.in);
             
            boolean Whileflag = true ;
            while(Whileflag){
                
             //THE MAIN OPTIONS
            System.out.println("Choose an Option:\n1-Check out books , 2-Return books , 0-Exit the library ");
            int choice = sc.nextInt();
            sc.nextLine();
           
            // TO CHECK OUT THE BOOKS
           if(choice == 1){
                   System.out.print("choose an option:\n 1- Search by Title \n2- Search bu Author\n");
                   int choice2 = sc.nextInt();
                   sc.nextLine();
                   
                   
                   //TO SEARCH BY TITLE
                   if(choice2==1){
     
                           while(true){
                           System.out.print("Enter the title of the book: ");
                           String title = sc.nextLine();
                           
                           //IF THE BOOK AVAILABLE
                            if( Lc.SearchByTitle(title)){
                                
                                System.out.println("The book is available , 1-check out 2-search for another book 0-Main Menu" );
                                  int choice3 = sc.nextInt();
                                   sc.nextLine();
                                   
                                   //TO THE FINAL CHECKOUT
                                  if(choice3 == 1){
                                      Lc.Checkout(title);
                                      break;
                                  }
                                  //TO SEARCH FOR ANOTHER BOOK
                                  else if(choice3 == 2){
                                    continue ;
                                  }
                                  
                                  //TO EXIT THESE OPTIONS AND GO TO THE MAIN OPTIONS
                                  else if(choice3 == 0){
                                    break;
                                  }
                                  
                                  else{
                                      System.out.println("option not available");
                                      continue;
                                  }
                                  
                                  
                
                             }
                            //IF THE BOOK IS NOT AVAILABLE
                            else if (!Lc.SearchByTitle(title)){
                                  System.out.println("The book is unavailable");
                                  break;
               
                             }    
                            }
                          
                   }
                        
                        //TO SEARCH BY AUTHOR'S NAME   
                       if(choice2==2){
                           
                           while(true){
                            System.out.print("Enter the author's name of the book: ");
                           String author = sc.nextLine();
                           
                           //IF THE BOOK AVAILABLE
                            if( Lc.SearchByAuthor(author)){
                                  System.out.println("The book is available , 1-check out 2-search for another book 0-Main Menu");
                                  int choice3 = sc.nextInt();
                                   sc.nextLine();
                                   
                                   //TO THE FINAL CHECKOUT
                                  if(choice3 == 1){
                                      Lc.Checkout(author);
                                    break ;
                                  }
                                  
                                  //TO SEARCH FOR ANOTHER BOOK
                                  else if(choice3 == 2){
                                    continue ;
                                  }
                                  
                                  //TO EXIT THESE OPTIONS AND GO TO THE MAIN OPTIONS
                                  else if(choice3 == 0){
                                    break;
                                  }
                                  
                                  else{
                                      System.out.println("option not available");
                                      continue;
                                  }
                
                             }
                            
                             //IF THE BOOK IS NOT AVAILABLE
                             else if (!Lc.SearchByAuthor(author)){
                                  System.out.println("The book is unavailable");
                                  break;
                                  
                             }    
                       }
                       
                   
               }
            }
           
            //TO RETURN BOOKS           
           else if(choice == 2){
               System.out.print("Enter the title of the book you want to return :");
               String ReturnedBook = sc.nextLine();
               
             if(ReturnedBook.equals(book1.getTitle())){
                 Lc.ReturnBooks(book1);
             }
             else if(ReturnedBook.equals(book2.getTitle())){
                 Lc.ReturnBooks(book2);
             }
             else if(ReturnedBook.equals(book3.getTitle())){
                 Lc.ReturnBooks(book3);
             }
             else if(ReturnedBook.equals(book4.getTitle())){
                 Lc.ReturnBooks(book4);
             }
             else if(ReturnedBook.equals(book5.getTitle())){
                 Lc.ReturnBooks(book5);
             }
             else{
                 System.out.println("This book doesn't belong to our library!");
             }
           }
           
           //TO EXIT THE LIBRARY 
           else if(choice == 0){
               System.out.println("Thanks!");
               break;
           }
           
           
         }

    }
}
