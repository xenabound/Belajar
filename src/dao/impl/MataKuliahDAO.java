package dao.impl;

import dao.BaseDAO;
import entity.Matakuliah;

public interface MataKuliahDAO extends BaseDAO<MataKuliah> {
    Matakuliah getkodematkul();
    Matakuliah getnamamatkul();
    Matakuliah getdosen();
    Matakuliah getjumlahsks();
}
