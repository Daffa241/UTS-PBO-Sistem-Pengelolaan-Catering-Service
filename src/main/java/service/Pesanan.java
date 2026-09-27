/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
public class Pesanan {
    protected Pelanggan pelanggan;
    protected PaketCatering paket;
    protected int jumlahPorsi;
    protected String tanggalAcara;

    public Pesanan(Pelanggan pelanggan, PaketCatering paket, int jumlahPorsi, String tanggalAcara) {
        this.pelanggan = pelanggan;
        this.paket = paket;
        this.jumlahPorsi = jumlahPorsi;
        this.tanggalAcara = tanggalAcara;
    }

    public void setJumlahPorsi(int jumlahPorsi) {
        this.jumlahPorsi = jumlahPorsi;
    }

    public void cetakStruk() {
        System.out.println("==========================================");
        System.out.println("         STRUK PEMESANAN CATERING         ");
        System.out.println("==========================================");
        System.out.println("Nama Pelanggan    : " + pelanggan.getNama());
        System.out.println("No. Telepon       : " + pelanggan.getNoTelp());
        System.out.println("Alamat Pengiriman : " + pelanggan.getAlamat());
        System.out.println("Tanggal Acara     : " + tanggalAcara);
        System.out.println("------------------------------------------");
        paket.tampilDetail();
        System.out.println("Jumlah Porsi      : " + jumlahPorsi + " porsi");
        System.out.println("------------------------------------------");
        System.out.println("TOTAL BIAYA       : Rp " + paket.hitungTotal(jumlahPorsi));
        System.out.println("==========================================");
    }
}
