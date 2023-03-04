package tutorials.javase;

import lombok.Data;

@Data
public class _24_GenericsIsNot {

    //field
    private long id;
    private String name;

    //constructor
    public _24_GenericsIsNot() {
    }
    public _24_GenericsIsNot(long id, String name) {
        this.id = id;
        this.name = name;
    }
}

class MainGenerics{
    public static void main(String[] args) {
        //1.YOL
       /*
       _24_GenericsIsNot isNot=new _24_GenericsIsNot();
        isNot.setId(1);
        isNot.setName("Ankara");
        System.out.println(isNot.getId()+" "+isNot.getName());
        */

        //2.YOL
        _24_GenericsIsNot isNot=new _24_GenericsIsNot(1,"Ankara" );
        System.out.println(isNot.getId()+" "+isNot.getName());
    }
}



