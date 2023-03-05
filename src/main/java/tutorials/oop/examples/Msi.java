package tutorials.oop.examples;

import lombok.Data;

@Data
public class Msi extends Computer  implements IMainBoard{

    private String rgb;

    public Msi() {
    }

    public Msi(String mainBoard, String cpu, String ram, String rgb) {
        super(mainBoard, cpu, ram);
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Msi{" +
                "rgb='" + rgb + '\'' +
                "} " + super.toString();
    }

    @Override
    public void fullInformation(int year) {
        System.out.println("year: "+year);
    }

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
