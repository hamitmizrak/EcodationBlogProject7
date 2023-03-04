package tutorials.javase;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class _26_CollectionList{

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


    //LIST : LAV
    /*
    List: bir interfacedir.
    */
    public static void main(String[] args) {
        List<Integer> numberList=new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(4);
        numberList.add(6);
        numberList.add(7);
        numberList.add(2);
        numberList.add(5);
        numberList.add(4);

        //eleman sayısı
        System.out.println(numberList.size());
        System.out.println(numberList.isEmpty());
        System.out.println(numberList.hashCode());
        System.out.println(numberList.get(numberList.size()-1));
        System.out.println("Var mı ?"+numberList.contains(5));
        System.out.println("indexOf : "+numberList.indexOf(4));
        System.out.println("lastIndexOf : "+numberList.lastIndexOf(4));
        System.out.println(numberList.toString());
        System.out.println(numberList.toArray());
        System.out.println(numberList.subList(0,2));
        System.out.println("**********iterative********************");

        //elemanları göster
        //1- iterative for
        for (int i = 0; i <numberList.size() ; i++) {
            System.out.println(numberList.get(i)+" ");
        }
        System.out.println("***********forEach name*******************");
        numberList.remove(0);

        //2- forEach: adı for
        for (Integer temp :numberList) {
            System.out.println(temp+" ");
        }
        System.out.println("*************Iterator*****************");

        //3-  Iterator
        Iterator iterator=numberList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************Java 8 gelen forEach******************");

        //4 -Java 8 gelen forEach
        numberList.stream().forEach((temp)->{
            System.out.println(temp);
        });

        //5 -Java 8 gelen forEach
        System.out.println("************Java 8 gelen forEach******************");
        numberList.stream().forEach(System.out::println);

        //6 -Java 8 gelen forEach
        System.out.println("************Java 8 gelen forEach******************");
        numberList.forEach(System.out::println);



    }

}





