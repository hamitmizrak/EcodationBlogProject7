package tutorials.javase;

import lombok.Data;

import java.util.*;

@Data
public class _27_CollectionSet {

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


    //SET : HaLaT
    /*
    Set: bir interfacedir.
    */
    public static void main(String[] args) {
        //Set<Integer> numberSet=new TreeSet<>();
        //Set<Integer> numberSet=new LinkedHashSet<>();
        Set<Integer> numberSet=new HashSet<>();
        numberSet.add(1);
        numberSet.add(10);
        numberSet.add(4);
        numberSet.add(6);
        numberSet.add(7);
        numberSet.add(2);
        numberSet.add(5);
        numberSet.add(4);

        // ÖDEV: rastgele(1-9 arasında) 6 tane sayıyı List eklereyerek aşağıdaki bütün
        // attributesları yapalım ?

        //eleman sayısı
        System.out.println(numberSet.size());
        System.out.println(numberSet.isEmpty());
        System.out.println(numberSet.hashCode());
        System.out.println("Var mı ?"+numberSet.contains(5));
        System.out.println(numberSet.toString());
        System.out.println(numberSet.toArray());
        System.out.println("**********iterative********************");
       // numberSet.remove(0);
        //numberSet.clear(); //bütün listedeki verileri kaldırıyor.

        //elemanları göster


       /* //2- forEach: adı for
        for (Integer temp :numberSet) {
            System.out.println(temp+" ");
        }
        System.out.println("*************Iterator*****************");*/

        //3-  Iterator
        Iterator iterator=numberSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************Java 8 gelen forEach******************");

        /*//4 -Java 8 gelen forEach
        numberSet.stream().forEach((temp)->{
            System.out.println(temp);
        });

        //5 -Java 8 gelen forEach
        System.out.println("************Java 8 gelen forEach******************");
        numberSet.stream().forEach(System.out::println);

        //6 -Java 8 gelen forEach
        System.out.println("************Java 8 gelen forEach******************");
        numberSet.forEach(System.out::println);*/

    }
}





