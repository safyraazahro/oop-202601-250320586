# Catatan Minggu 3: Pewarisan dan Hierarki

## Yang saya kerjakan
melengkapi pengerjaan class Laptop dan AlatLab sebagai turunan dari class Aset, dan memperbaiki powershell yang error

## Keputusan desain
menggunakan pewarisan supaya Laptop dan AlatLab bisa memakai bagian umum dari class Aset, juga menggunakan IllegalArgumentException untuk menolak data yang kosong atau tidak sesuai

## Kendala 
sempat mengalami kendala saat menjalankan tes di PowerShelll, code yang digunakan: Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass  cara ini agar skrip pengujian bisa dijalankan lalu .\scripts\uji.ps1 -Minggu 3 

## Penggunaan AI
- Alat yang dipakai: gpt
- Bagian yang dibantu AI: memahami eror pada powershell
- Prompt utama: bantu memahami bagian code yang menyebabkan tes minggu 3 gagal dan cara memperbaikinya
- Yang saya ubah atau tolak dari saran AI, dan alasannya:-
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih paham bahwa pesan tes membantu menunjukkan bagian kode yang perlu diperiksa dan diperbaiki
