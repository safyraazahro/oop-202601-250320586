# Catatan Minggu 05: Abstraction


## Yang saya kerjakan
mempelajari konsep abstraction dengan mengubah class Aset menjadi abstract class. Saya juga mengisi method `bisaDipinjam()` sesuai aturan yang sudah ditentukan. Selain itu, saya mengimplementasikan interface `AturanDenda` pada class `DendaFlat` dan `DendaProgresif` untuk menghitung denda keterlambatan.

## Keputusan desain
Saya menggunakan abstract class pada Aset karena class tersebut menjadi induk dari beberapa jenis aset. Saya juga menggunakan interface `AturanDenda` agar perhitungan denda bisa memiliki aturan yang berbeda. Untuk denda progresif, saya memilih tambahan sebesar 10% dari denda flat untuk setiap hari keterlambatan agar jumlah denda semakin meningkat.


## Kendala
Kendala yang saya alami adalah ketika mengubah method hitungDenda() menjadi abstract, awalnya masih menggunakan kurung kurawal sehingga muncul tanda merah pada kode, lalu saya menggantinya dengan titik koma.

## Penggunaan AI
- Alat yang dipakai: gpt
- Bagian yang dibantu AI: Class `Aset`, `DendaFlat`, dan `DendaProgresif`.
- Prompt utama: Bagaimana cara mengisi method `bisaDipinjam()` sesuai aturan yang ditentukan?, Bagaimana cara mengubah method `hitungDenda()` menjadi abstract?, Bagaimana cara membuat rumus perhitungan denda progresif?
- Yang saya ubah atau tolak dari saran AI, dan alasannya:-
- Satu hal yang saya pahami lebih baik sekarang: mengetahui bahwa class Aset dapat dibuat menjadi abstract dan method-nya bisa diimplementasikan oleh class turunan.