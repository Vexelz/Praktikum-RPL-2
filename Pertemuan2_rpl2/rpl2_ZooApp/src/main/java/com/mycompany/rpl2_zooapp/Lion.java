/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_zooapp;

/**
 *
 * @author Izza
 */
public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    // Polimorfisme: override method abstract
    @Override
    public void makeSound() {
        System.out.println("Aummm! (Singa mengaum)");
    }
}

