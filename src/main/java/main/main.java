/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.ArrayList;
import java.util.Scanner;
import service.PaketCatering;
import service.PaketNasiKotak;
import service.PaketPrasmanan;
import service.Pelanggan;
import service.Pesanan;

/**
 *
 * @author ASUS
 */

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
        boolean berjalan = true;
        
        while (berjalan) {
            System.out.println("\n==========================================");
            System.out.println("     SISTEM PENGELOLAAN CATERING SERVICE   ");
            System.out.println("==========================================");
            System.out.println("1. Tambah Pesanan Baru (Create)");
            System.out.println("2. Lihat Semua Pesanan (Read)");
            System.out.println("3. Ubah Jumlah Porsi Pesanan (Update)");
            System.out.println("4. Hapus Pesanan (Delete)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihanMenu = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihanMenu) {
                case 1: // CREATE
                    System.out.println("\n--- Tambah Pesanan Baru ---");
                    System.out.print("Masukkan Nama Pelanggan    : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Telepon     : ");
                    String noTelp = scanner.nextLine();
                    System.out.print("Masukkan Alamat Pengiriman : ");
                    String alamat = scanner.nextLine();

                    Pelanggan pelanggan = new Pelanggan(nama, noTelp, alamat);

                    System.out.println("\n--- Pilih Jenis Paket Catering ---");
                    System.out.println("1. Paket Prasmanan Luxury (Rp 50.000 / porsi)");
                    System.out.println("2. Paket Nasi Kotak Hemat (Rp 25.000 / porsi)");
                    System.out.print("Pilihan Anda (1/2): ");
                    int jenisPaket = scanner.nextInt();
                    scanner.nextLine();

                    PaketCatering paketPilihan;
                    if (jenisPaket == 1) {
                        paketPilihan = new PaketPrasmanan("Prasmanan Luxury", 50000, "Termasuk Meja, Cover, & Peralatan Makan");
                    } else {
                        paketPilihan = new PaketNasiKotak("Nasi Kotak Hemat", 25000, "Box Eco-Friendly");
                    }

                    System.out.print("Masukkan Jumlah Porsi      : ");
                    int porsi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Tanggal Acara     : ");
                    String tglAcara = scanner.nextLine();

                    Pesanan pesananBaru = new Pesanan(pelanggan, paketPilihan, porsi, tglAcara);
                    daftarPesanan.add(pesananBaru);
                    System.out.println("\n>> Pesanan berhasil ditambahkan!");
                    pesananBaru.cetakStruk();
                    break;

                case 2: // READ
                    System.out.println("\n--- Daftar Seluruh Pesanan ---");
                    if (daftarPesanan.isEmpty()) {
                        System.out.println("Belum ada data pesanan.");
                    } else {
                        for (int i = 0; i < daftarPesanan.size(); i++) {
                            System.out.println("\nID Pesanan: " + (i + 1));
                            daftarPesanan.get(i).cetakStruk();
                        }
                    }
                    break;

                case 3: // UPDATE
                    System.out.println("\n--- Ubah Data Pesanan ---");
                    if (daftarPesanan.isEmpty()) {
                        System.out.println("Belum ada data pesanan untuk diubah.");
                    } else {
                        System.out.print("Masukkan ID Pesanan yang ingin diubah (1-" + daftarPesanan.size() + "): ");
                        int idUpdate = scanner.nextInt() - 1;

                        if (idUpdate >= 0 && idUpdate < daftarPesanan.size()) {
                            System.out.print("Masukkan Jumlah Porsi Baru: ");
                            int porsiBaru = scanner.nextInt();
                            scanner.nextLine();

                            daftarPesanan.get(idUpdate).setJumlahPorsi(porsiBaru);
                            System.out.println(">> Jumlah porsi berhasil diperbarui!");
                        } else {
                            System.out.println("ID Pesanan tidak ditemukan!");
                        }
                    }
                    break;

                case 4: // DELETE
                    System.out.println("\n--- Hapus Pesanan ---");
                    if (daftarPesanan.isEmpty()) {
                        System.out.println("Belum ada data pesanan untuk dihapus.");
                    } else {
                        System.out.print("Masukkan ID Pesanan yang ingin dihapus (1-" + daftarPesanan.size() + "): ");
                        int idHapus = scanner.nextInt() - 1;

                        if (idHapus >= 0 && idHapus < daftarPesanan.size()) {
                            daftarPesanan.remove(idHapus);
                            System.out.println(">> Pesanan berhasil dihapus!");
                        } else {
                            System.out.println("ID Pesanan tidak ditemukan!");
                        }
                    }
                    break;

                case 5: // EXIT
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        scanner.close();
    }
}
  

