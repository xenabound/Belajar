package entity;

public abstract class Matakuliah extends Matakuliah {
    private String kodematkul;
    private String namamatkul;
    private String dosen;
    private int jumlahsks;

    public Matakuliah(String kodematkul , String namamatkul) {
        super(kodematkul, namamatkul);
    }


    public void setNamamatkul(String namamatkul)
    {
        this.namamatkul = namamatkul;
    }

    public String getNamamatkul() {
        return namamatkul;
    }


    public String getDosen() {
        return dosen;
    }
    public void setDosen(String dosen) {
        this.dosen = dosen;
    }


    public int getJumlahsks() {
        return jumlahsks;
    }
    public void setJumlahsks(int jumlahsks) {
        this.jumlahsks = jumlahsks;
    }


    public abstract String toString();

    @Override
    public String toString() {
        return "Profile" +
                "kode_matkul='" + kodematkul + '\'' +
                ", nama_matkul='" + namamatkul + '\'' +
                ", dosen='" + dosen + '\'' +
                ", jumlah_sks=' "+ jumlahsks + '\'' +

                '}';
    }


    public abstract String toString();
}
