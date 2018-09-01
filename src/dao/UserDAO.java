package dao;

import entity.User;

public interface UserDAO extends BaseDAO<User> {

    User getMahasiswaById();

    User getUserByUsername();

    User getUserById();

}
