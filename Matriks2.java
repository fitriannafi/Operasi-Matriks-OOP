/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Matriks2 {
    void Pengurangan(){
       Scanner input = new Scanner (System.in);
       int i,j,m,n;
       int matriks1[][] = new int [5][5];
       int matriks2[][] = new int [5][5];
       int hasil[][] = new int [5][5];
       System.out.println();
       System.out.print("2. Menghitung Pengurangan Matriks");
       System.out.println();
       System.out.print("Masukkan jumlah baris matriks: ");
       m = input.nextInt();
       System.out.print("Masukkan jumlah kolom matriks: ");
       n = input.nextInt();
       System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            matriks1[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            matriks2[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil penjumlahan matriks: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            hasil[i][j] = matriks1[i][j] - matriks2[i][j];
        System.out.print(hasil[i][j] + "\t");
        }
        System.out.println();
        } 
        if (m == n) {
        System.out.print("Matriks berbentuk segiempat");
        } else {
            System.out.print("Matriks berbentuk bukan segiempat");
        System.out.println();
        System.out.println();
        }
    }   
}
