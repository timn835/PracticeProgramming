/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author timn8
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Random random = new Random();
        float limit = 0.0f;
        float p;
        int count = 1;
        do {
            if(count == 8) {
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                return;
            }
            System.out.println("Clean your room!! (x" + count + ")");
            count++;
            limit += 0.1f;
            p = random.nextFloat();
        }while(p > limit);
        System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
    }
}
