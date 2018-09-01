package dao.impl.;

import entity.Matakuliah;
import entity.User;

import java.util.List;

public interface MataKuliah {
    Matakuliah getMahasiswaById();

    User save(User param);

    User update(User param);

    Matakuliah save(Matakuliah param);

    Matakuliah update(Matakuliah param);

    int delete(Matakuliah param);

    User findById(int id);

    Matakuliah findByKode(String kode_matkul);

    List<MataKuliah> findAll();

    User getUserByUsername();

    User getUserById();
}
