package tutorials.oop.examples;

public class MainOop {
    public static void main(String[] args) {
        Msi msi=new Msi();
        msi.setRam("16GB");
        msi.setCpu("2.54GHz");
        msi.setMainBoard("SDFSDfkm4545 mainboard");
        System.out.println(msi);
        msi.fullInformation(2022);
        msi.setRgb(ERgb.Blue.toString());
        System.out.println("************************");

        Asus asus=new Asus();
        asus.setCpu("32GB");
        asus.setRam("32GB");
        asus.setMainBoard("asdasdsa5445 main");
        System.out.println(asus);
        asus.fullInformation(2023);
    }
}
