package entity;

public class User {

    private String id;
    private String nama;
    private String jeniskelamin;
    private String alamat;

    public User(int i, String admin_update_again, String password_update_again) {
    }

    public User(int id) {
        this.id = id;
    }

    public User(String id, String nama, String jeniskelamin, String alamat) {
        this.id = id;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
    }

    public User(String id, String nama) {
        this.id = id;
        this.nama = nama;
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


}
