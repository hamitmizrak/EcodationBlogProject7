package tutorials.javase;

import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class _10_StringBuilderAndTokenizer {

    public static void main(String[] args) {
        //StringBuilder: bağlama, birleştirmek
       /* String name = "Hamit";
        String surname = "Mızrak";
        String lang = "Java";
        String otherLang = "C#";

        //1.yol
        System.out.println(name + surname + lang + otherLang);

        //2.yol
        System.out.println(name.concat(surname).concat(lang).concat(otherLang));

        //3.YOL: büyük database,socket,servisler etc.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(surname).append(lang).append(otherLang);
        String changeData = stringBuilder.toString();
        System.out.println(changeData);*/

        //StringTokenizer:parçalamak 1.YOL PARÇALA
        String langData = "java+javase$ jsp_jsf# spingboot springMVC~ SpringData SpringRest StringSecurity";
        StringTokenizer stringTokenizer = new StringTokenizer(langData, "+$_~ ");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken().toUpperCase());
        }

        System.out.println("************************");
        //split 2.YOL PARÇALA
        String[] subArr = langData.split(" ");
        for(String temp : subArr){
            System.out.println(temp);
        }

        //Random
        System.out.println( Math.round(Math.random()*3+1));
        Random random=new Random();
        //Random
        int number=random.nextInt(3)+1;
        System.out.println(number);




    }
}
