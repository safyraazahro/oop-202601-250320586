package id.ac.upb.asetpinjam.model;

/** Minggu 3: alat laboratorium. Laboratorium tidak boleh kosong; risiko tidak boleh null. */
public class AlatLab extends Aset {
    @Override
    public long hitungDenda(int hariTerlambat) {
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
        }
        if (hariTerlambat == 0) {
            return 0;
        }
        // Perhitungan denda untuk AlatLab
        return 30000L * hariTerlambat;
    }




    // TODO minggu 3: field laboratorium dan tingkatRisiko.
    private final String laboratorium;
    private final TingkatRisiko tingkatRisiko;
    
    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);
       
        if (laboratorium == null || laboratorium.isBlank()) {
            throw new IllegalArgumentException("Laboratorium aset berisi alat laboratorium tidak boleh kosong");
        }
        if (tingkatRisiko == null) {
            throw new IllegalArgumentException("Tingkat risiko aset berisi alat laboratorium tidak boleh null");
        }
        this.laboratorium = laboratorium;
        this.tingkatRisiko = tingkatRisiko;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public TingkatRisiko getTingkatRisiko() {
        return tingkatRisiko;
       
    }

    // TODO minggu 3: override getJenis(). Minggu 4: override hitungDenda(int).
    @Override
    public JenisAset getJenis() {
        return JenisAset.ALAT_LAB;
    }

}
