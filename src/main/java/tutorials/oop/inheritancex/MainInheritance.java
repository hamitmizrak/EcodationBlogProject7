package tutorials.oop.inheritancex;

public class MainInheritance {

    public static void main(String[] args) {

        Person person=new Person();
        person.setId(1);
        person.setUsername("person adı-1");
        person.setSurname("person soyadı-1");
        person.setCityName("cloud");
        System.out.println(person);

        System.out.println("*********************");
        //long id, String username, String surname, String cityName, String schoolNumber
        Student student=new Student(1,"Öğrenci adı-1","Öğrenci soyadı-1","İstanbul","4521515");
        student.govdeliMethod("Öğrenci");//polymorphism metot
        System.out.println(student);
        System.out.println("*********************");

        Teacher teacher=new Teacher();
        teacher.setId(1);
        teacher.setUsername("Öğretmen adı-1");
        teacher.setSurname("Öğretmen soyadı-1");
        teacher.setCityName("Ankara");
        student.govdeliMethod("Öğretmen"); //polymorphism metot
        System.out.println(teacher);
    }
}
