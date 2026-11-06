# Catatan Minggu 04: Polymorphism


## Yang saya kerjakan
 mengerjakan perhitungan denda pada kelas Aset, Ruang, Laptop, dan AlatLab dengan menerapkan polymorphism melalui method hitungDenda().  membuat dua method cari() pada KatalogAset, yaitu pencarian berdasarkan nama dan pencarian berdasarkan nama serta jenis aset. Setelah itu, menjalankan pengujian untuk memastikan hasilnya sesuai.

## Keputusan desain
Saya menggunakan method hitungDenda() yang dioverride pada setiap jenis aset agar perhitungan denda mengikuti aturan masing-masing. Tarif dasar denda diambil dari Varian.aktif().dendaPerHari, lalu dikalikan dengan jumlah hari terlambat dan pengali jenis aset. Untuk pencarian, saya menggunakan toLowerCase() agar pencarian nama tidak membedakan huruf besar dan kecil.

## Kendala
awalnya hasil perhitungan denda belum sesuai karena saya hanya mengalikan jumlah hari dengan pengali jenis aset dan belum memasukkan tarif dasar, lalu mengatasinya dengan memeriksa kembali aturan tugas dan menambahkan tarif dari varian aktif ke perhitungan denda.

## Penggunaan AI
- Alat yang dipakai: gpt
- Bagian yang dibantu AI:  Method hitungDenda() pada kelas Ruang, Laptop, dan AlatLab, serta method cari() pada KatalogAset.
- Prompt utama: “Kenapa hasil tes denda saya tidak sesuai?, bagaimana cara menghitung denda sesuai aturan tugas Minggu 4?, apa yang perlu diperbaiki pada method hitungDenda()
- Yang saya ubah atau tolak dari saran AI, dan alasannya:-
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih memahami bahwa polymorphism memungkinkan method dengan nama yang sama memiliki perhitungan berbeda pada setiap jenis aset.
