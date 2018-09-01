package dao;

import java.sql.*;
import java.util.List;

public interface BaseReport {
    BaseReport save(BaseReport param);

    BaseReport update(BaseReport param);

    String delete(BaseReport param);

    BaseReport findById(String id);

    List<BaseReport> findAll();
}
