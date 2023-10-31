package mhd.aidil.fahmi;

import java.util.Scanner;

public class MhdAidilFahmi {

   
    public static void main(String[] args) {
                double Nilai1;
                double Nilai2;
                double hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 =keyboard.nextInt();
//
       // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
       // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil = " + hasil);
//
         System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();    
        
        // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil = " + hasil);
//
      System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
//        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil = " + hasil);
        
        
    //Operasi Perbandingan
    boolean lebihBesar = Nilai1 > Nilai2;
    boolean lebihKecil = Nilai1 < Nilai2;
    boolean lebihBesarsamaDengan = Nilai1 >= Nilai2;
    boolean lebihKecilsamaDengan = Nilai1 <= Nilai2;
    boolean samaDengan = Nilai1 == Nilai2;
    
    System.out.println("Nilai1 lebih besar dari Nilai2: " + lebihBesar);
    System.out.println("Nilai1 lebih kecil dari Nilai2: " + lebihKecil);
    System.out.println("Nilai1 lebih besar sama dengan dari Nilai2: " + lebihBesarsamaDengan);
    System.out.println("Nilai1 lebih kecil sama dengan dari Nilai2: " + lebihKecilsamaDengan);
    System.out.println("Nilai1 sama dengan Nilai2: " + samaDengan);
    
    
    //Operasi Bitwise
        int a = 5;  // Representasi biner: 0101
        int b = 3;  // Representasi biner: 0011

        // AND Bitwise
        int resultAnd = a & b;  // Output: 1 (0001)
        System.out.println("AND Bitwise: " + resultAnd);

        // OR Bitwise
        int resultOr = a | b;   // Output: 7 (0111)
        System.out.println("OR Bitwise: " + resultOr);

        // XOR Bitwise
        int resultXor = a ^ b;  // Output: 6 (0110)
        System.out.println("XOR Bitwise: " + resultXor);

        // NOT Bitwise
        int resultNotA = ~a;     // Output: -6 (..., 11111111111111111111111111111010 in 32-bit representation)
        System.out.println("NOT Bitwise for a: " + resultNotA);

        // Left Shift
        int leftShifted = a << 1;  // Output: 10 (1010)
        System.out.println("Left Shifted by 1: " + leftShifted);

        // Right Shift
        int rightShifted = a >> 1;  // Output: 2 (0010)
        System.out.println("Right Shifted by 1: " + rightShifted);
    }
} 
