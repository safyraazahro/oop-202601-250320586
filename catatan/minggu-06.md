# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan

dokumentasi UML dan penerapan prinsip SOLID pada proyek Aset-Pinjam. membuat Class Diagram untuk menggambarkan hubungan antarclass, atribut, dan method yang ada dalam program. lalu membuat Sequence Diagram untuk menggambarkan proses pengajuan peminjaman, baik ketika berhasil maupun ketika terjadi jadwal bentrok. Selain itu, saya membuat dokumentasi penerapan prinsip SOLID pada kode program.

## Keputusan desain

Saya menggunakan Class Diagram untuk menunjukkan struktur dan hubungan antarclass. Pada Sequence Diagram, saya menggunakan percabangan `alt` karena terdapat dua kemungkinan hasil pengajuan, yaitu berhasil dan ditolak karena jadwal bentrok. Untuk prinsip SOLID, saya memilih OCP dan LSP karena penerapannya dapat dilihat pada interface `AturanDenda` serta pewarisan class `Aset` ke `Laptop`, `AlatLab`, dan `Ruang`.

## Kendala

Kendala yang saya alami adalah memahami hubungan antarclass dan menentukan arah panah pada Class Diagram. Saya juga sempat kesulitan membuat Sequence Diagram, terutama dalam menggunakan percabangan `alt` di draw.io. Saya mengatasinya dengan mempelajari kembali fungsi setiap simbol UML dan melihat contoh diagram sebagai panduan.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Memahami hubungan antarclass, pembuatan Class Diagram, Sequence Diagram, dan penjelasan prinsip SOLID.
- Prompt utama: berikan contoh gambar diagram
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan bentuk diagram dan nama class dengan kode Java yang ada di proyek agar hasilnya sesuai dengan implementasi program.
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih memahami perbedaan Class Diagram dan Sequence Diagram, serta bagaimana prinsip OCP dan LSP diterapkan dalam program Java.