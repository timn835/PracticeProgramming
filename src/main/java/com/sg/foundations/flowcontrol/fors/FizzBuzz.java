/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author timn8
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid;
        int userNumber = 0;
        String userEntry;
        
        do {
            System.out.print("How many units of fizzing and buzzing do you need in your life? ");
            isValid = true;
            userEntry = scanner.nextLine();
            try {
                userNumber = Integer.parseInt(userEntry);
                int count = 0;
                int i = 0;
                boolean a;
                boolean b;
                while(count < userNumber) {
                    a = i != 0 && i % 3 == 0;
                    b = i != 0 && i % 5 == 0;
                    count++;
                    if(a && b) {
                        System.out.println("fizz buzz");
                    } else if (a) {
                        System.out.println("fizz");
                    } else if (b) {
                        System.out.println("buzz");
                    } else {
                        System.out.println(i);
                        count--;
                    }
                    i++;
                }
                System.out.println("TRADITION!!!!!");
                
            } catch(NumberFormatException e) {
                System.out.println("Oups! Please enter a valid integer value");
                isValid = false;
            }
        } while(!isValid);
    }
}
