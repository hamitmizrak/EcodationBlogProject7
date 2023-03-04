package tutorials.javase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Java 8 gelen özellikler
public class _29_Java8Stream {

    //static array
    public static String[] strArray(){
        String[] array={"malatya","ankara","izmir","van","bolu","malatya"};
        return array;
    }

    //static list
    public static List<String> strList(){
        List<String> list=new ArrayList<>();
        list.add("malatya");
        list.add("ankara");
        list.add("izmir");
        list.add("van");
        list.add("bolu");
        list.add("malatya");
        return list;
    }

    //diziyi ==> List'e çevirmek
    public static List<String> arrayToList(){
        String[] array=strArray();
        List<String> list=List.of(array);
        return list;
    }

    //forEach: tek satırda elamanları göstermek
    public static void streamForEach(){
        strList().stream().forEach((temp)->{
            System.out.println(temp);
        });
    }

    //Liste döndermek
    public static void streamCollect(){
     List<String> clone=   strList().stream().collect(Collectors.toList());
        clone.forEach((temp)->{
            System.out.println(temp);
        });
    }

    //Listeyi küçükten büyüğe sıralama
    //Listeyi büyükten küçüğe sıralama
    public static void streamSorted(){
        strList()
                .stream()
                //.sorted()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach((temp)->{
            System.out.println(temp);
        });
    }

    public static void main(String[] args) {
        //streamForEach();
        //streamCollect();
        streamSorted();
    }


}





