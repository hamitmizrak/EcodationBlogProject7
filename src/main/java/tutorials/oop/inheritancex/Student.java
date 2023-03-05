package tutorials.oop.inheritancex;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student extends  Person {

    private String schoolNumber;

    public Student(){
    }
    public Student(long id, String username, String surname, String cityName, String schoolNumber) {
        super(id, username, surname, cityName);
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolNumber='" + schoolNumber + '\'' +
                "} " + super.toString();
    }
}
