package tutorials.javase;

import lombok.Data;

import java.util.*;

@Data
public class _28_CollectionMap {

    //Collection:
    // Eleman sayısı  belli değildir.
    // K-L-M
    // K = Küme(Set)
    // L = List
    // M = Map

    // 1 44 55 34 66 44
    // Küme                -    List
    // tekrarsız veriler        tekrarlı veriler
    // 1 44 55 34 66            1 44 55 34 66 44

    // Map : Key Value çalışan yapılardır.


    //Map : HaLaT
    /*
    Map: bir interfacedir.
    */
    public static void main(String[] args) {
        // Map<Integer> numberMap=new TreeMap<>();
        // Map<Integer> numberMap=new LinkedHashMap<>();
        // Map<Integer,Object> numberMap=new HashMap();
        Map<Integer,String> numberMap=new HashMap();
        numberMap.put(1,"Sivas");
        numberMap.put(2,"Diyarbakır");
        numberMap.put(3,"Çorum");
        numberMap.put(4,"Bursa");
        numberMap.put(5,"Kars");

        for (Integer keyData :  numberMap.keySet()) {
            System.out.println(keyData);
        }


        for (String valueData :  numberMap.values()) {
            System.out.println(valueData);
        }


        for (Integer keyData :  numberMap.keySet()) {
            System.out.println(keyData+" => "+numberMap.get(keyData));
        }

        System.out.println("***************************");

        Set<Integer> set=numberMap.keySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(numberMap.get(iterator.next()));
        }


    }
}





