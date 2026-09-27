/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
public class PaketPrasmanan extends PaketCatering {
    protected String kelengkapan;

    public PaketPrasmanan(String namaPaket, double hargaPerPorsi, String kelengkapan) {
        super(namaPaket, hargaPerPorsi);
        this.kelengkapan = kelengkapan;
    }

    public void tampilDetail() {
        super.tampilDetail();
        System.out.println("Jenis Service       : Prasmanan");
        System.out.println("Kelengkapan         : " + kelengkapan);
    }
}
