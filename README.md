# Sistem Pengelolaan Catering Service

Proyek aplikasi berbasis bahasa pemrograman Java yang dibangun menggunakan konsep Pemrograman Berorientasi Objek (PBO) untuk mengelola layanan transaksi catering secara terstruktur.

---
Nama: Daffa Rizqi Fadhillah

NIM: 2509116068

Kelas: B

---

## 1. Deskripsi Proyek
**Sistem Pengelolaan Catering Service** adalah program berbasis CLI (Command Line Interface) yang dirancang untuk mempermudah manajemen pemesanan makanan. Aplikasi ini berfungsi untuk mencatat identitas pelanggan, mengelola jenis paket makanan, hingga kalkulasi pembayaran akhir.

### Fungsi & Kegunaan Utama:
<img width="324" height="163" alt="Screenshot 2026-09-27 151137" src="https://github.com/user-attachments/assets/433b9c48-05e7-426d-93ce-f773786f5d7f" />


- **Manajemen Data (CRUD):**
  - **Create:** Menambahkan pesanan catering baru ke dalam sistem.
    
   <img width="452" height="665" alt="Screenshot 2026-09-27 151251" src="https://github.com/user-attachments/assets/850ee629-3b47-4304-bbd9-b106846eac88" />


  - **Read:** Menampilkan daftar seluruh pesanan yang tersimpan.
    
    <img width="444" height="502" alt="Screenshot 2026-09-27 151335" src="https://github.com/user-attachments/assets/09f40876-567f-4313-b45e-671c8b1484f4" />

  - **Update:** Mengubah jumlah porsi pesanan berdasarkan ID transaksi.
    
    <img width="362" height="261" alt="Screenshot 2026-09-27 151413" src="https://github.com/user-attachments/assets/b89389f5-62ca-468d-a1b9-b8baab26dbaf" />


  - **Delete:** Menghapus data pesanan dari daftar.
    
    <img width="365" height="240" alt="Screenshot 2026-09-27 151431" src="https://github.com/user-attachments/assets/5a717304-1bd6-4c7e-ac3a-cf9535abf8d0" />


- **Fleksibilitas Paket:** Mendukung paket Prasmanan dan Nasi Kotak dengan atribut kelengkapan layanan masing-masing.
- **Kalkulasi Biaya Otomatis:** Mengkalkulasi total tagihan berdasarkan jumlah porsi dan tarif paket yang dipilih.

---

## 2. Penerapan Konsep OOP
- **Inheritance (Pewarisan):** Superclass PaketCatering diturunkan ke Subclass PaketPrasmanan dan PaketNasiKotak.
- **Polymorphism:** Method Overriding pada tampilDetail() untuk menampilkan atribut spesifik tiap paket, serta Method Overloading pada kalkulasi harga.
- **Condition (Percabangan):** Penggunaan if-else dan switch-case dalam pemilihan menu interaktif.
- **Looping (Perulangan):** Penggunaan while loop untuk perulangan menu utama dan for loop untuk membaca data ArrayList.

---
