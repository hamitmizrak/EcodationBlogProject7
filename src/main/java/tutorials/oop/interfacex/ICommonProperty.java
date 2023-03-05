package tutorials.oop.interfacex;

public interface ICommonProperty {
    //database CRUD
    public  String create();
    public  String delete(long id);
    public  String update(long id);
    public  String select(long id);
}
