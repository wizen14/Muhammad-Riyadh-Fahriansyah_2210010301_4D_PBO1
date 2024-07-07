package uas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenjualanBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           // io sederhana 
        BarangDetail[] barangs = new BarangDetail[2];       // array
        
        //perulangan
        for (int i = 0; i < barangs.length; i++) {
            //error handling
            try{                                            
                System.out.print("Masukkan Nama Barang ke-" + (i + 1) + ": ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan Harga Barang ke-" + (i + 1) + ": ");
                double harga = scanner.nextDouble();
                scanner.nextLine();

                //objek
                barangs[i] = new BarangDetail(nama, harga);
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Harga harus berupa angka. Silakan coba lagi.");
                scanner.nextLine();
                i--;
            } catch (Exception e) {
                System.out.println("Error: Terjadi kesalahan. " + e.getMessage());
                scanner.nextLine(); 
                i--;
            }
        }

        //perulangan
        System.out.println("\nData Barang:");               
        for (BarangDetail barang : barangs) {               
            System.out.println(barang.displayInfo());
        }
    }
}

