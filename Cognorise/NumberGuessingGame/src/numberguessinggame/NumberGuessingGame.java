/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

/**
 *
 * @author Malak Elsayed
 */   
import java.util.Scanner ;
import java.util.Random ;
public class NumberGuessingGame {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     
        Random random = new Random();
        int RandomNumber = random.nextInt(101);
        System.out.println(RandomNumber);
        int Attempts = 5 ;
        System.out.println("You Have 5 Attempts!");
        
        while(Attempts != 0){
            System.out.print("Guess a number :");
             int GuessedNumber  = sc.nextInt();
             
             
             if(GuessedNumber == RandomNumber){
                 System.out.println(RandomNumber + " You got it right !" );
                 break ;
             }
             
             else if(GuessedNumber > RandomNumber){
                 Attempts -- ;
                 
                  if(Attempts!=0){
                 System.out.println("Try guessing a smaller number , Attempts left:" + Attempts );
                  }
             }
             
             else if(GuessedNumber < RandomNumber){
                 Attempts -- ;
                 
                 if(Attempts!=0){
                 System.out.println("Try guessing a bigger number, Attempts left:" + Attempts );
                 }
                 
             }
             
             
        }
        
        if(Attempts == 0){
            System.out.println("You Lost! Attempts left:" + Attempts + "\nThe number is : " + RandomNumber );
            
        }
       
        
    }
    
}
