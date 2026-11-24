# Penerapan Prinsip SOLID

## 1. Open/Closed Principle (OCP)

Open/Closed Principle merupakan prinsip bahwa sebuah kode sebaiknya dapat dikembangkan tanpa harus mengubah kode yang sudah ada.

**Penerapan dalam proyek:**

Prinsip ini diterapkan melalui interface `AturanDenda` yang memiliki method `hitung()`. Interface tersebut diimplementasikan oleh class `DendaFlat` dan `DendaProgresif`.

Dengan adanya interface tersebut, kita dapat menambahkan jenis aturan denda baru tanpa harus mengubah interface `AturanDenda` maupun implementasi aturan denda yang sudah ada.

## 2. Liskov Substitution Principle (LSP)

Liskov Substitution Principle merupakan prinsip bahwa objek dari class turunan harus dapat menggantikan objek dari class induk tanpa merusak fungsi program.

**Penerapan dalam proyek:**

Prinsip ini diterapkan melalui class `Aset` sebagai class induk, yang memiliki beberapa class turunan yaitu `Laptop`, `AlatLab`, dan `Ruang`.

Ketiga class tersebut dapat digunakan sebagai objek `Aset` karena masing-masing merupakan turunan dari class `Aset` dan memiliki implementasi method `hitungDenda()` sendiri.