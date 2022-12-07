/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics;
import java.util.Scanner;
/**
 *
 * @author timn8
 */
public class FollowAlong {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float fOp1 = 0;
        float fOp2 = 0;
        String sOp1;
        String sOp2;
        boolean isValid;
        
        

        do {
            System.out.println("Please enter first input");
            isValid = true;
            sOp1 = scanner.nextLine();
            try {
                fOp1 = Float.parseFloat(sOp1);
            }
            catch(NumberFormatException e) {
                System.out.println("Could not parse your input as decimal, try again");
                isValid = false;
            }

        } while(!isValid);
        do {
            System.out.println("Please enter second input");
            isValid = true;
            sOp2 = scanner.nextLine();
            try {
                fOp2 = Float.parseFloat(sOp2);
            }
            catch(NumberFormatException e) {
                System.out.println("Could not parse your input as integer, try again");
                isValid = false;
            }
            
        } while(!isValid);
               
        System.out.println("Your result is: " + (fOp1 + fOp2));

        
    }
}
