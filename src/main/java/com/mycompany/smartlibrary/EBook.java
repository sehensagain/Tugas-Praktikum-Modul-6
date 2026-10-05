package com.mycompany.smartlibrary;

public class EBook extends Koleksi {
    private int ukuranFileMB;
    
    public EBook(String judul, String pengarang, int tahunTerbit, int ukuranFileMB) {
        super(judul, pengarang, tahunTerbit);
        this.ukuranFileMB = ukuranFileMB;
    }
    
 
    public void tampilkanInfo() {
        System.out.printf("[E-Book]     Judul: %-15s | Pengarang: %-10s | Tahun: %d | Ukuran: %d MB%n", 
                          this.judul, this.pengarang, this.tahunTerbit, this.ukuranFileMB);
    }
  
    public void caraPinjam() {
        System.out.println("-> Info Pinjam: E-Book dipinjam dengan cara di-download melalui aplikasi/situs web.");
    }
}