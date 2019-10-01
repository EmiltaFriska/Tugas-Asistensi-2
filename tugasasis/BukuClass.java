/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasis;

/**
 *
 * @author Personal
 */
public class BukuClass {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;

    public BukuClass() {
        this.namaPengarang = "Soetanto";
        this.judulBuku = "Matahari Terbit";
        this.tahunTerbit = 2011;
        this.cetakanKe = 10;
        this.hargaJual = 52000;
    }

    public BukuClass(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }    

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public void infoBuku (){
    System.out.println ("INFORMASI BUKU");    
    System.out.println ("Nama Pengarang : " +getNamaPengarang());
    System.out.println ("Judul Buku : " +getJudulBuku());
    System.out.println ("Tahun Terbit : " +getTahunTerbit());
    System.out.println ("Cetakan Ke : " +getCetakanKe());
    System.out.println ("Harga Jual : " +getHargaJual());
    }
}
