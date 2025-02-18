/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fuzyawati2308367.tugas2nomor1;

import java.util.Scanner;

/**
 *
 * @author Desa Cibatu
 */
public class Tugas2nomor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            //Untuk inputan bilangan
            System.out.println("Input bilangan pertama: ");
            int x = scanner.nextInt();
            System.out.println("Input bilangan kedua: ");
            int y = scanner.nextInt();
            System.out.println("Input bilangan ketiga: ");
            int z = scanner.nextInt();
            
            //Mencetak hasil
            System.out.println("Hasil penjumlahan adalah " + (x + y + z));
            System.out.println("Hasil pengurangan adalah " + (x - y - z));
            System.out.println("Hasil perkalian adalah " + (x * y * z));
            System.out.println("Hasil pembagian adalah " + (x / y / z));
        }
    }
