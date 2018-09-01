package dao.impl;

import connection.DatabaseConnection;
import dao.UserDAO;
import entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDAOImpl implements UserDAO {

    private Connection connection = DatabaseConnection.getInstance().getConnection();

    @Override
    public User getMahasiswaById() {
        return null;
    }

    @Override
    public User save(User param) {
        try {
            String sql = "insert into mahasiswa (id, nama, jenis_kelamin, alamat) value (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            /*preparedStatement.setString(1, param.getUsername());*/
            /*preparedStatement.setString(2, param.getPassword());*/
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Data berhasil disimpan");
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
    public User update(User param) {
        try {
            String sql = "update mahasiswa set username = ?, password = ? where id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            /*preparedStatement.setString(1, param.getUsername());*/
            preparedStatement.setString(2, param.getPassword());
            preparedStatement.setInt(3, param.getId());
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
    public int delete(User param) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from mahasiswa where id = ?");
            preparedStatement.setInt(1, param.getId());
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
        User result = null;
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * from mahasiswa where id =  ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                result = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from mahasiswa");
            while (resultSet.next()) {
                /*User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);*/

                users.add(new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
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
