package Penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir nilaiAkhir1 = new NilaiAkhir("Muhammad Fikri Firzatullah", "2110010506", 80, 75, 90);

        System.out.println("Nama Mahasiswa: " + nilaiAkhir1.getNama());
        System.out.println("NPM Mahasiswa: " + nilaiAkhir1.getNpm());
        System.out.println("Nilai UTS: " + nilaiAkhir1.getUts());
        System.out.println("Nilai UAS: " + nilaiAkhir1.getUas());
        System.out.println("Nilai Tugas: " + nilaiAkhir1.getTugas());
        
        double nilaiAkhir = nilaiAkhir1.hitungNilaiAkhir();
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
