/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author timn8
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        int i = 0;
        String temp;
        String[] statements = {
            "I need a noun",
            "Now an adjective",
            "Another noun",
            "And a number",
            "Another adjective",
            "A plural noun",
            "Another one",
            "One more",
            "A verb (infinitive form)",
            "Same verb (past participle)"
        };
        String[] answers = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play MAD LIBS!");
        while(i < 10) {
            System.out.print(statements[i] + ": ");
            temp = scanner.nextLine();
            if(temp == null || temp.isEmpty()) {
                System.out.println("Please enter something");
                continue;
            }
            answers[i] = temp;
            i++;
        }
        
        System.out.println(
                answers[0] + ": the " +
                answers[1] + " frontier. These are the voyages of the starship " +
                answers[2] + ". Its " + 
                answers[3] + "-year mission: to explore strange " + 
                answers[4] + " " + answers[5] + ", to seek out " + 
                answers[4] + " " + answers[6] + " and " + 
                answers[4] + " " + answers[7] + ", to boldly " + 
                answers[8] + " where no one has " + answers[9] + " before.");
    }
}
