/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2_zooapp;

/**
 *
 * @author Izza
 */
public class Rpl2_ZooApp {

    public static void main(String[] args) {
        // Membuat objek menggunakan konsep Polymorphism
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);

        // Menampilkan informasi
        System.out.println("=== Data Hewan di Kebun Binatang ===");
        lion.showInfo();
        lion.makeSound();

        System.out.println();
        elephant.showInfo();
        elephant.makeSound();
    }
}
