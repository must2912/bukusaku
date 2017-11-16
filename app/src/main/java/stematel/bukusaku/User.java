package stematel.bukusaku;

/**
 * Created by tofa-pc on 11/15/2017.
 */

public class User {
    private String username, nama, kelas, keterangan;
    private int id, poin;

    public User(String username, String nama, String kelas, String keterangan , int id, int poin) {
        this.id = id;
        this.username = username;
        this.nama = nama;
        this.kelas = kelas;
        this.poin = poin;
        this.keterangan = keterangan;
    }

    public int getID() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public int getPoin() {
        return poin;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
