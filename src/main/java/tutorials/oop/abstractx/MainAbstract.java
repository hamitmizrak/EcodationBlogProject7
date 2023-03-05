package tutorials.oop.abstractx;

public class MainAbstract {

    public static void main(String[] args) {

        Person abstractPerson=new Teacher(); //polymorphism metot
        abstractPerson.setId(1);
        abstractPerson.setUsername("abstractPerson adı-1");
        abstractPerson.setSurname("abstractPerson soyadı-1");
        abstractPerson.setCityName("abstractcloud");
        System.out.println(abstractPerson);

        System.out.println("*********************");
        //long id, String username, String surname, String cityName, String schoolNumber
        Student student=new Student(1,"Öğrenci adı-1","Öğrenci soyadı-1","İstanbul","4521515");
        student.govdeliMethod("Öğrenci");//polymorphism metot
        student.govdesizMethod("Öğrenci Gövdesiz method");
        System.out.println(student);
        System.out.println("*********************");

        Teacher teacher=new Teacher();
        teacher.setId(1);
        teacher.setUsername("Öğretmen adı-1");
        teacher.setSurname("Öğretmen soyadı-1");
        teacher.setCityName("Ankara");
        student.govdeliMethod("Öğretmen"); //polymorphism metot
        student.govdesizMethod("Öğretmen Gövdesiz method");
        System.out.println(teacher);
    }
}
