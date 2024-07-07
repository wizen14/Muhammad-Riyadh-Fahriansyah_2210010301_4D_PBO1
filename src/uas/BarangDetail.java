package uas;

//inheritance
public class BarangDetail extends Barang {
    //overriding
    public BarangDetail(String nama, double harga) {
        super(nama, harga);
    }

    public String getKategori() {
        //seleksi if
        if(getHarga() < 50000) {
            return "Murah";
        } else if(getHarga() >= 50000 && getHarga() <= 100000) {
            return "Sedang";
        } else {
            return "Mahal";
        }
    }

    //polymorphism (overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nKategori: " + getKategori();
    }
}
