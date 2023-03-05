package tutorials.oop.examples;

public class Asus  extends Computer implements IMainBoard{


    @Override
    public String toString() {
        return "Asus{} " + super.toString();
    }

    //abstract
    @Override
    public void fullInformation(int year) {
        System.out.println("year: "+year);
    }

    //interface
    @Override
    public String mainName() {
        return null;
    }

    @Override
    public String mainTrade() {
        return null;
    }

    @Override
    public String mainPrice() {
        return null;
    }
}
