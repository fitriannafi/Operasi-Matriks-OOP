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
public class Campuran1 {
    void Penjumlahanpengurangan(){
       Scanner input = new Scanner (System.in);
       int i,j,m,n;
       int matriks1[][] = new int [5][5];
       int matriks2[][] = new int [5][5];
       int matriks3[][] = new int [5][5];
       int hasil[][] = new int [5][5];
       System.out.println();
       System.out.print("3. Matriks A + Matriks B - Matriks C");
       System.out.println();
       System.out.print("Masukkan jumlah baris matriks: ");
       m = input.nextInt();
       System.out.print("Masukkan jumlah kolom matriks: ");
       n = input.nextInt();
       System.out.println("Masukkan elemen matriks A: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            matriks1[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks B: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            matriks2[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks C: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            matriks3[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil Matriks A + Matriks B - Matriks C = ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
            hasil[i][j] = matriks1[i][j] + matriks2[i][j] - matriks3[i][j];
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
