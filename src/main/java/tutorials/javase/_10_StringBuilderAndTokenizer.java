package tutorials.javase;

public class _10_StringBuilderAndTokenizer {

    public static void main(String[] args) {
        //StringBuilder: bağlama, birleştirmek
        String name="Hamit";
        String surname="Mızrak";
        String lang="Java";
        String otherLang="C#";

        //1.yol
        System.out.println(name+surname+lang+otherLang);

        //2.yol
        System.out.println(name.concat(surname).concat(lang).concat(otherLang));

        //3.YOL: büyük database,socket,servisler etc.
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name).append(surname).append(lang).append(otherLang);
        String changeData=stringBuilder.toString();
        System.out.println(changeData);



    }
}
