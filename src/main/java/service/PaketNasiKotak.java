/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
public class PaketNasiKotak extends PaketCatering {
    protected String kemasan;

    public PaketNasiKotak(String namaPaket, double hargaPerPorsi, String kemasan) {
        super(namaPaket, hargaPerPorsi);
        this.kemasan = kemasan;
    }

    public void tampilDetail() {
        super.tampilDetail();
        System.out.println("Jenis Service       : Nasi Kotak");
        System.out.println("Tipe Kemasan        : " + kemasan);
    }
}