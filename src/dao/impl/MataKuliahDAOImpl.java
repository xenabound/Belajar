package dao.impl;

import connection.DatabaseConnection;
import entity.Matakuliah;
import entity.User;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MataKuliahDAOImpl  implements MataKuliah {

    private Connection connection = DatabaseConnection.getInstance().getConnection();

    @Override
    public Matakuliah getMahasiswaById() {
        return null;
    }

    @Override
    public User save(User param) {
        return null;
    }

    @Override
    public User update(User param) {
        return null;
    }

    @Override
    public Matakuliah save(Matakuliah param) {
        try {
            String sql = "insert into mata_kuliah (kode_matkul, nama_matkul, dosen, jumlah_sks) value (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            /*preparedStatement.setString(1, param.getUsername());*/
            /*preparedStatement.setString(2, param.getPassword());*/
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Data matakuliah berhasil disimpan");
            } else {
                System.out.println("Gagal simpan data");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Gagal memasukkan data dengan benar : " + e.getMessage());
        }

        return param;
    }

    @Override
    public Matakuliah update(Matakuliah param) {
        try {
            String sql = "update mata_kuliah set kode_matkul = ?, nama_matkul = ?, dosen = ?, jumlah_sks = ? where kode_matkul = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, param.getkodematkul());
            preparedStatement.setString(2, param.getNamamatkul());
            preparedStatement.setString(3,param.getDosen());
            preparedStatement.setInt(4, param.getJumlahsks());
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Data berhasil diupdate");
            } else {
                System.out.println("Gagal update data");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Gagal update data dengan error : " + e.getMessage());
        }

        return param;
    }

    @Override
    public int delete(Matakuliah param) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from mata_kuliah where kode_matkul = ?");
            preparedStatement.setString(1, param.getkodematkul());
            int result = preparedStatement.executeUpdate();
            if (result > 0){
                System.out.println("Data Berhasil dihapus");
            } else {
                System.out.println("Data Gagal dihapus");
            }

            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public Matakuliah findByKode(String kode_matkul) {
        Matakuliah result = null;
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * from mata_kuliah where kode_matkul = ?");
            preparedStatement.setString(1, kode_matkul);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                result = new Matakuliah(
                        resultSet.getString("kode_matkul"),
                        resultSet.getString("nama_matkul"),
                        resultSet.getString("dosen"));
                        resultSet.getInt("jumlah_sks");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<MataKuliah> findAll() {
        List<MataKuliah> mataKuliahs = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from mata_kuliah");
            while (resultSet.next()) {
                /*User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);*/

                mataKuliahs.add(new MataKuliahDAOImpl()); resultSet.getString("kode_matkul");
                        resultSet.getString("nama_matkul");
                        resultSet.getString("dosen");
                        resultSet.getInt("jumlah_sks");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mataKuliahs;
    }

    @Override
    public User getUserByUsername() {
        return null;
    }

    @Override
    public User getUserById() {
        return null;
    }
}
