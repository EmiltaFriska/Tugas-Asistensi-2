package tugasasis2;

public class PelajarClass {
    private int nip;
    private String nama;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;
    
public PelajarClass() {
    }

public PelajarClass(String nama, int nip, double nilaiUjian1, double nilaiUjian2, double nilaiTugas) {
        this.nip = nip;
        this.nama = nama;
        this.nilaiUjian1 = nilaiUjian1;
        this.nilaiUjian2 = nilaiUjian2;
        this.nilaiTugas = nilaiTugas;
    }        

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(double nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(double nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double NilaiAkhir() {
        double nilaiAkhir = ((getNilaiTugas() * 0.2) + (getNilaiUjian1() * 0.4) + (getNilaiUjian2() * 0.4));
        return (nilaiAkhir);
    }
    
    public String isLulus (){
        String status;
            if(NilaiAkhir() >= 60)
                status = "LULUS";
            else 
                status = "TIDAK LULUS";
            return status;    
    }
    public void Status (){
        System.out.println("DATA PELAJAR");
        System.out.println("");
        System.out.println("Nama \t\t : " +getNama());
        System.out.println("NIP \t\t : " +getNip());
        System.out.println("Nilai Ujian 1 \t : " +getNilaiUjian1());
        System.out.println("Nilai Ujian 2 \t : " +getNilaiUjian2());
        System.out.println("Nilai Tugas \t : " +getNilaiTugas());
        System.out.println("Nilai Akhir \t : " +NilaiAkhir());
        System.out.println("Status \t\t: " +isLulus());
    }
}
