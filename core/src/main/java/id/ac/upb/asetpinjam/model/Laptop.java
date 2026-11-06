package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    @Override
    public long hitungDenda(int hariTerlambat) {
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
        }
        if (hariTerlambat == 0) {
            return 0L;
        }
        // Perhitungan denda untuk Laptop
        return 15000L * hariTerlambat;

    }

    // TODO minggu 3: field spesifikasi dan nomorInventaris.

    private final String spesifikasi;
    private final String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        
        if (spesifikasi == null || spesifikasi.isBlank()) {
            throw new IllegalArgumentException("Spesifikasi aset berisi laptop tidak boleh kosong");
        }

        if (nomorInventaris == null || nomorInventaris.isBlank()) {
            throw new IllegalArgumentException("Nomor inventaris aset berisi laptop tidak boleh kosong");
        }
        this.spesifikasi = spesifikasi;
        this.nomorInventaris = nomorInventaris;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    // TODO minggu 3: override getJenis(). Minggu 4: override hitungDenda(int).
    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }
    }

