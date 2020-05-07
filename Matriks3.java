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
public class Matriks3 {
    void Perkalian(){
        Scanner Input = new Scanner (System.in);
        int i,j,m,n,a,b,c,penjumlahan=0;
        int matriks1[][] = new int [5][5];
        int matriks2[][] = new int [5][5];
        int hasil[][] = new int [5][5];
        System.out.println();
        System.out.print("4. Menghitung Perkalian Matriks");
        System.out.println();
        System.out.print("Masukkan jumlah baris matriks A: ");
        m = Input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        n = Input.nextInt();
        System.out.print("Masukkan jumlah baris matriks B: ");
        a = Input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        b = Input.nextInt();
        
        if (n != a) {
        System.out.println("Matriks tidak dapat dikalikan, karena syarat nya jumlah kolom matriks A harus sama dengan jumlah baris matriks B. \n");
        } else {
        System.out.println("Masukkan elemen matriks A: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
          matriks1[i][j] = Input.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks B: ");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
            matriks2[i][j] = Input.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < b; j++) {
                for (c = 0; c < a; c++) {
                    penjumlahan = penjumlahan + matriks1[i][c] * matriks2[c][j];
            }
          hasil[i][j] = penjumlahan;
          penjumlahan = 0;
          }
        }
        System.out.println("Hasil perkalian matriks: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
          }
        }
    }
}
