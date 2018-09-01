package dao;

import java.sql.*;
import java.util.List;


public interface BaseMatkulDAO<MataKuliah> {

    MataKuliah save(MataKuliah param);

    MataKuliah update(MataKuliah param);

    String delete(MataKuliah param);

    MataKuliah findById(String kodematakuliah);

    List<MataKuliah> findAll();
}
