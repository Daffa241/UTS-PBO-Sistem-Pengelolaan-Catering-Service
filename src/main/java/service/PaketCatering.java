/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
public class PaketCatering {
    protected String namaPaket;
    protected double hargaPerPorsi;

    public PaketCatering(String namaPaket, double hargaPerPorsi) {
        this.namaPaket = namaPaket;
        this.hargaPerPorsi = hargaPerPorsi;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public double getHargaPerPorsi() {
        return hargaPerPorsi;
    }

    // Overloading Method: Hitung harga standar
    public double hitungTotal(int porsi) {
        return this.hargaPerPorsi * porsi;
    }

    // Overloading Method: Hitung harga dengan potongan diskon (%)
    public double hitungTotal(int porsi, double persenDiskon) {
        double total = this.hargaPerPorsi * porsi;
        return total - (total * (persenDiskon / 100));
    }

    public void tampilDetail() {
        System.out.println("Nama Paket          : " + namaPaket);
        System.out.println("Harga Per Porsi     : Rp " + hargaPerPorsi);
    }
}
