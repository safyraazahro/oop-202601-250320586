# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: Apakah peminjaman pukul 09:00-11:00 dan 11:00-13:00 pada aset yang sama termasuk bentrok?
- Keputusan: Tidak bentrok, jika waktu selesai peminjaman pertama sama dengan waktu mulai peminjaman berikutnya.
- Alasan: Aset dapat langsung digunakan peminjam berikutnya setelah waktu peminjaman sebelumnya selesai.
- Dampak ke kode: Metode validasi bentrok pada proses peminjaman.
- Tes yang membuktikan: `BentrokBatasWaktuTest`

## A-02: Prhitungan keterlambatan
- Pertanyaan: Bagaimana denda dihitung bila terlambat 1 menit atau 25 jam?
- Keputusan: Keterlambatan sebagian hari dibulatkan ke atas. Terlambat 1 menit dihitung 1 hari, sedangkan 25 jam dihitung 2 hari.
- Alasan: Agar setiap keterlambatan tetap mendapatkan perhitungan denda secara adil dan konsisten.
- Dampak ke kode:  Konversi durasi keterlambatan sebelum memanggil hitungDenda().
- Tes yang membuktikan: `PembulatanHariTerlambat.`

## A-03: Peminjaman aset yang sama pada hari yang sama
- Pertanyaan: Bolehkah satu peminjam meminjam aset yang sama dua kali pada hari yang sama?
- Keputusan: Boleh selama bertumpang tindih.
- Alasan: Aset dapat digunakan kembali setelah peminjaman sebelumnya selesai.
- Dampak ke kode: Validasi jadwal jawaban.
- Tes yang membuktikan: `PeminjamanAsetSamaTest.`

## A-04: Kondisi aset memburuk tanpa aksi
- Pertanyaan: Siapa menanggung biaya bila kondisi aset saat kembali lebih buruk dan tidak ada saksi?
- Keputusan: Peminjam tidak langsung dikenai biaya jika tidak ada bukti yang menunjukan kerusakan terjadi selama masa peminjaman.
- Alasan: Agar penentuan tanggung jawab berdasarkan bukti dan tidak merugikan salah satu pihak.
- Dampak ke kode: Proses pemeriksaan kondisi aset saat pengebalian.
- Tes yang membuktikan: `PemeriksaanKondisiIsiAset.`

## A-05: Aset rusak sebelum serah terima
- Pertanyaan: Apa yang terjadi pada pengajuan yang sudah disetujui bila aset dinyatakan rusak sebelum serah terima?
- Keputusan: Peminjaman dibatalkan oleh petugas atau admin dan aset diubah statusnya menjadi RUSAK.
- Alasan: Aset yang rusak berat tidak boleh digunakan untuk peminjaman.
- Dampak ke kode: Proses pembatalan peminjaman dan perubahan status aset.
- Tes yang membuktikan: `AsetRusakSebelumSerahTerimsTest.`

## A-06: Pembatalan mendadak
- Pertanyaan: Apakah pembatalan mendadak (kurang dari 1 jam sebelum mulai) dikenai sanksi? Bolehkah DIAJUKAN langsung DIBATALKAN?
- Keputusan: Pembatalan kurang dari satu jam sebelum waktu mulai tidak dikenai sanksi. Pengajuan yang masih berstatus DIAJUKAN tidak dapat langsung dibatalkan karena tidak tersedia dalam aturan perpindahan status.
- Alasan: Mengikuti aturan perpindahan status yang sudah ditentukan dan menghindari pemberian sanksi yang belum memiliki ketentuan pasti.
- Dampak ke kode: Validasi perpindahan status peminjaman.
- Tes yang membuktikan: `PembatalanPeminjamanTest`.

## A-07: Jadwal dan kuota peminjaman
- Pertanyaan: Apakah peminjaman berstatus DITOLAK atau DIBATALKAN masih menempati jadwal? Apakah DIAJUKAN dihitung dalam kuota?
- Keputusan:  DITOLAK dan DIBATALKAN tidak menempati jadwal. DIAJUKAN tetap menempati jadwal sementara untuk mencegah pengajuan lain menggunakan waktu yang sama, tetapi tidak dihitung dalam kuota laptop.
- Alasan: Agar tidak terjadi bentrok jadwal dan perhitungan kuota tetap mengikuti aturan status aktif yang sudah ditentukan.
- Dampak ke kode: Validasi bentrok jadwal dan kuota laptop.
- Tes yang membuktikan: `JadwalDanKuotaPeminjamanTest`.




## Asumsi lain

## A-08: Rumus denda progresif
- Pertanyaan: Bagaimana cara menghitung denda progresif agar semakin besar ketika keterlambatan bertambah?
- Keputusan: Menggunakan denda flat ditambah tambahan sebesar 10% untuk setiap hari keterlambatan dari total denda flat.
- Alasan: Agar denda semakin meningkat sesuai jumlah hari keterlambatan dan tidak lebih murah dari denda flat.
- Dampak ke kode: Kelas `DendaProgresif`, metode `hitung()`.
- Tes yang membuktikan: `Minggu05AbstraksiTest`.
