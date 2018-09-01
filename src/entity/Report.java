package entity;

public class Report {
    private String id;
    private String nama;
    private String kodematkul;
    private String namamatkul;
    private String dosen;
    private int jumlahsks;

    public Report() {
    }

    public Report(String id) {
        this.id = id;
    }

    public Report(String id, String nama, String kodematkul, String namamatkul, String dosen, int jumlahsks) {
        this.id = id;
        this.nama = nama;
        this.kodematkul = kodematkul;
        this.namamatkul = namamatkul;
        this.dosen = dosen;
        this.jumlahsks = jumlahsks;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDosen() {return dosen;}
    public void setDosen(String dosen) {this.dosen = dosen;}

    public String getKodematkul() {return kodematkul;}
    public void setKodematkul(String kodematkul) {this.kodematkul = kodematkul;}

    public String getNamamatkul() {return namamatkul;}
    public void setNamamatkul(String namamatkul) {this.namamatkul = namamatkul;}

    public int getJumlahsks() {return jumlahsks;}
    public void setJumlahsks(int jumlahsks){this.jumlahsks = jumlahsks;}
}
