package tutorials.oop.abstractx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
abstract public class Person {
    //object field
    private long id;
    private String username;
    private String surname;
    private String cityName;

    public void govdeliMethod(String name){
        System.out.println("Gövdeli metot: "+name);
    }

    abstract public void govdesizMethod(String name);
}
