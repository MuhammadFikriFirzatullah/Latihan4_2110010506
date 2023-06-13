package Penilaian;

public class NilaiAkhir extends Mahasiswa {
    private int uts;
    private int uas;
    private int tugas;

    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        this.nama = nama;
        this.npm = npm;
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    @Override
    public String getNama() {
        System.out.println();
        return super.getNama();
    }
    @Override
     public String getNpm() {
        System.out.println();
        return super.getNpm();
     }
     
     public int getUts() {
     return uts;
    }

    public int getUas() {
        return uas;
    }

    public int getTugas() {
        return tugas;
    }
     
     public double hitungNilaiAkhir() {
        double nilaiUts = uts * 0.3;
        double nilaiUas = uas * 0.3;
        double nilaiTugas = tugas * 0.4;

        return nilaiUts + nilaiUas + nilaiTugas;
    }
}

