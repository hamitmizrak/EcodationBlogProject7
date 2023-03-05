package tutorials.oop.inheritancex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    //object field
    private long id;
    private String username;
    private String surname;
    private String cityName;

    public void govdeliMethod(String name){
        System.out.println("Gövdeli metot: "+name);
    }
}
