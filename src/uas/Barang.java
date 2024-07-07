
package uas;

//class
public class Barang {
    //atribut dan enscapulation
    private String nama;
    private double harga;

    //constructor
    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    //mutattor (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    //mutattor (getter)
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    
    public String displayInfo() {
        return "Nama: " + getNama() + "\nHarga: " + getHarga();
    }

    //polymorphism (overloading)
    public String displayInfo(String kategori) {
        return displayInfo() + "\nKategori: " + kategori;
    }
}