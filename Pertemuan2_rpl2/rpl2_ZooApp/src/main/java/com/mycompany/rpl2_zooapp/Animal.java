/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_zooapp;

/**
 *
 * @author Izza
 */
public abstract class Animal {
    // Enkapsulasi: atribut dibuat private
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter & Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Method abstract (Abstraction)
    public abstract void makeSound();

    // Method umum
    public void showInfo() {
        System.out.println("Nama: " + name + ", Umur: " + age + " tahun");
    }
}

