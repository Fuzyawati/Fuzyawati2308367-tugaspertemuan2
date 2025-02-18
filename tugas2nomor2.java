/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fuzyawati2308367.tugas2nomor1;
import java.util.Scanner;
/**
 *
 * @author Desa Cibatu
 */
public class tugas2nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah uang dan kondisi cuaca
        System.out.print("Masukkan jumlah uang: ");
        int uang = scanner.nextInt();
        System.out.print("Apakah hari ini hujan? dijawab dengan (true (ya)/false (tidak): ");
        boolean hujan = scanner.nextBoolean();

        // Ekspresi logika untuk membeli gorengan
        if (uang > 5000 && !hujan) {
            System.out.println("Fuzy akan keluar membeli gorengan.");
        } else {
            System.out.println("Fuzy tidak membeli gorengan.");
        }

        scanner.close();
    }
}

