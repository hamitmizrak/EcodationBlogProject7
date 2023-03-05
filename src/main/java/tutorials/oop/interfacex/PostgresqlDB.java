package tutorials.oop.interfacex;

import java.io.Serializable;

public class PostgresqlDB extends DatabaseInfo implements ICommonProperty, Serializable {
    @Override
    public String create() {
        return null;
    }

    @Override
    public String delete(long id) {
        return null;
    }

    @Override
    public String update(long id) {
        return null;
    }

    @Override
    public String select(long id) {
        return null;
    }
}
