package tutorials.javase;

import lombok.Data;

@Data
public class _25_Generics <T>{

    //field
    private long id;
    private T name;

    //constructor
    public _25_Generics() {
    }
    public _25_Generics(long id, T name) {
        this.id = id;
        this.name = name;
    }

    public void isnotGenericsMethod(String name){
        System.out.println(name);
    }

    //generics method
    public <K> void genericsMethod(K name){
        System.out.println(name);
    }

}

class MainGenericsData{
    public static void main(String[] args) {
        _25_Generics generics=new _25_Generics(1,true );
        System.out.println(generics.getId()+" "+generics.getName());

        generics.isnotGenericsMethod("Merhabalar");
        generics.genericsMethod('@');
    }
}



