package entity;

public class MataKuliah {

    private String kodematkul;
    private String namamatkul;
    private String dosen;
    private Integer jumlahsks;

    public MataKuliah(String kode_matkul, String nama_matkul, String dosen) {
    }

    public MataKuliah(String kodematkul) {
        this.kodematkul = kodematkul;
    }

    public MataKuliah(String kodematkul, String namamatkul, String dosen, Integer jumlahsks) {
        this.kodematkul = kodematkul;
        this.namamatkul = namamatkul;
        this.dosen = dosen;
        this.jumlahsks = jumlahsks;
    }

    public MataKuliah(String kodematkul, String namamatkul, String dosen, Integer jumlahsks) {
        this.kodematkul = kodematkul;
        this.namamatkul = namamatkul;
        this.dosen = dosen;
        this.jumlahsks = jumlahsks;
    }

    public String getkodematkul() {
        return kodematkul;
    }

    public void setKodematkul(String kodematkul) {
        this.kodematkul = kodematkul;
    }

    public String getNamamatkul() {
        return namamatkul;
    }

    public void setNamamatkul(String namamatkul) {
        this.namamatkul = namamatkul;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public Integer getJumlahsks(){
        return jumlahsks;
    }

    public void setJumlahsks(Integer jumlahsks){
        this.jumlahsks = jumlahsks;
    }
}
