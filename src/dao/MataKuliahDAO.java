package dao;

import entity.User;

public interface MataKuliahDAO extends BaseMatkulDAO<MataKuliahDAO> {

    MataKuliahDAO getkodematkul();

    MataKuliahDAO getnamamatkul();

    MataKuliahDAO getdosen();


}
