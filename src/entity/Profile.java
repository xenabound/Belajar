package entity;

public class Profile extends User
{
    private int id;
    private String nama;
    private String jenisKelamin;
    private String alamat;

    public Profile(String id , String nama) {
        super(id, nama);
    }


    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Profile" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", alamat=' "+ alamat + '\'' +

                '}';
    }
}
