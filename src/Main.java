import connection.DatabaseConnection;
import entity.User;
import service.BasicCRUD;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        BasicCRUD crud = new BasicCRUD();
        crud.initData();

        Map<String, User> datas = crud.saveUsingKey("4", new User("Id baru", "nama Baru") );
        for (Map.Entry<String, User> map : datas.entrySet()){
            System.out.println("KEY : "+map.getKey() +" VALUE : "+map.getValue());
        }

        DatabaseConnection.getInstance().getConnection();
    }
}
