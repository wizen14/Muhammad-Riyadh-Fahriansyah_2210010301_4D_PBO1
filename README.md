# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data penjualan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Barang dan Kode penjualan, dan memberikan output berupa informasi detail dari barang tersebut seperti nama, harga, dan kategori barang berdasarkan harga (murah, sedang, mahal).

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.
## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Barang`, `BarangDetail`, dan `PenjualanBeraksi` adalah contoh dari class.

```bash
public class Barang {
    ...
}

public class BarangDetail extends Mahasiswa {
    ...
}

public class PenjualanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `barangs[i] = new BarangDetail(nama, harga);` adalah contoh pembuatan object.

```bash
barangs[i] = new BarangDetail(nama, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `harga` adalah contoh atribut.

```bash
private String nama;
private double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Barang` dan `BarangDetail`.

```bash
public Barang(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}

public BarangDetail(String nama, double harga) {
    super(nama, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(double harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` dan `getHarga` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.
```bash
private String nama;
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BarangDetail` mewarisi `Barang` dengan sintaks `extends`.

```bash
public class BarangDetail extends Barang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah Barang dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan Barang yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Barang` merupakan overloading method `displayInfo` dan `displayInfo` di `BarangDetail` merupakan override dari method `displayInfo` di `Barang`.

```bash
public String displayInfo(String kategori) {
    return displayInfo() + "\nKategori: " + kategori;
}

@Override
public String displayInfo() {
    return super.displayInfo() + "\nKategori: " + getKategori();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKategori`.

```bash
public String getKategori() {
    if(getHarga() < 50000) {
        return "Murah";
    } else if(getHarga() >= 50000 && getHarga() <= 100000) {
        return "Sedang";
    } else {
        return "Mahal";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < barangs.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Barang ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Barang:");
System.out.println(barang.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BarangDetail[] barangs = new BarangDetail[2];` adalah contoh penggunaan array.

```bash
BarangDetail[] barangs = new BarangDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Barang: Muhammad Riyadh Fahriansyah
Kode: 2210010301
