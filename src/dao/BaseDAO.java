package dao;

import java.sql.*;
import java.util.List;


public interface BaseDAO<User> {

    User save(User param);

    User update(User param);

    int delete(User param);

    User findById(int id);

    List<User> findAll();
}
