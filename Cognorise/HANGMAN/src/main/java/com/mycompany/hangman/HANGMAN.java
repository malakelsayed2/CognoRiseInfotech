/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hangman;

/**
 *
 * @author Malak Elsayed
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner ;
import java.util.Random ;


public class HANGMAN {

 public static void main(String[] args) {
       String array[] = {"Elephant", "Computer", "Guitar", "Pyramid", "Astronaut", 
                  "Rainbow", "Butterfly", "Dragon", "Penguin", "Chocolate", 
                  "Bicycle", "Jungle", "Treasure", "Volcano", "Mystery", 
                  "Zebra", "Dolphin", "Mermaid", "Galaxy", "Library"};
       
       Random random = new Random();
      
       int RandomWordIndex = random.nextInt(array.length);
       String RandomWord = array[RandomWordIndex];
       int RandomWordLength = RandomWord.length();
       
       for (int i = 0; i < RandomWordLength; i++) {
            System.out.print("-");
       }
       
       ArrayList<Character> RightGuessedChar = new ArrayList<>(); 
       for (int i = 0; i < RandomWordLength; i++) {
           RightGuessedChar.add('-');
       } 
       System.out.println("\n");
        
       Scanner sc = new Scanner(System.in);
       HashSet<Character> UsedChar = new HashSet<>();  // To store guessed characters
       
       int WrongAttempts = 0;
       int CorrectAttempts = 0;
       
       while (true) {
           System.out.println("   _______");
           System.out.println("  |       |");
           
           PrintHangMan(WrongAttempts);
           if (WrongAttempts == 6) {
               System.out.println("The Word is: " + RandomWord);
               break;
           }
              
           int WrongCharCounter = 0;
          
           System.out.print("Guess a letter: ");
           char CharGuessed = Character.toLowerCase(sc.next().charAt(0));
           
           // Check if the letter has already been guessed
           if (UsedChar.contains(CharGuessed)) {
               System.out.println("You have already guessed this letter. Try a different one.");
               continue;
           } else {
               UsedChar.add(CharGuessed);
           }
                
           for (int i = 0; i < RandomWordLength; i++) {
               if (CharGuessed == Character.toLowerCase(RandomWord.charAt(i))) {
                   RightGuessedChar.set(i, CharGuessed);
                   CorrectAttempts++;
               } else {
                   WrongCharCounter++;
               }
           }
              
           if (WrongCharCounter == RandomWordLength) {
               System.out.println("Wrong letter! Try again.");
               WrongAttempts++;
           }
              
           for (int i = 0; i < RightGuessedChar.size(); i++) {
               System.out.print(RightGuessedChar.get(i));
           }
           System.out.println("");
              
           if (CorrectAttempts == RandomWordLength) {
               System.out.println("You Won! The word is: " + RandomWord);
               break;
           }
       }
   }
   
   public static void PrintHangMan(int WrongAttempts) {
       if (WrongAttempts >= 1) {
           System.out.println("  O");
       }
       if (WrongAttempts >= 2) {
           System.out.print("\\   ");
       }  
       if (WrongAttempts >= 3) {
           System.out.println("/");
       }
       if (WrongAttempts >= 4) {
           System.out.println("  |   ");
       }
       if (WrongAttempts >= 5) {
           System.out.print("/   ");
       }
       if (WrongAttempts >= 6) {
           System.out.println("\\");
           System.out.println("YOU LOST!");
       }
   }
}

