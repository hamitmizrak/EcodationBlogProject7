package tutorials.javase;

public class _09_String {

    public static void main(String[] args) {
      //String
        String kelime="java44 Öğreniyorum java ";
        System.out.println(kelime);
        System.out.println(kelime.length());
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.toLowerCase());
        System.out.println(kelime.trim().startsWith("j"));
        System.out.println(kelime.endsWith(" "));

        System.out.println(kelime.charAt(0));
        System.out.println(kelime.indexOf("java"));
        System.out.println(kelime.lastIndexOf("java"));

        System.out.println(kelime.substring(4));
        System.out.println(kelime.substring(0,6));

        System.out.println(kelime.concat(".INC"));
        System.out.println(kelime.contains("java44"));

        System.out.println(kelime.equals("deneme"));

        // Ödev: Kullanıcıdan aldığınız isim ve soyismin; (isimi: scanner ve soyismi: jOptionalPane)
        // bu kelimenin harf sayısı ? [ ipucu: length() ]
        // bu kelimenin bütün karakteri büyük yapalım ? [ ipucu: toUpperCase()]
        // bu kelimenin bütün karakteri küçük yapalım ? [ ipucu: toLowerCase()]
        // bu kelimenin başında ve sonunda boşlukları alalım ? [ ipucu: trim()]
        // bu kelimenin j ile başlıyoru mu ?   [ ipucu: startsWith("j")]
        // bu kelimenin a ile biter mi ?   [ ipucu:  endsWith("a")]
        // bu kelimenin ilk harfi ? [ ipucu: charAt(0)]
        // bu kelimenin içinde baştan Altan geçiyor mu ? [ ipucu: indexOf("java")]
        // bu kelimenin içinde sondan Berkan geçiyor mu ? [ ipucu: lastIndexOf("java")]
        // bu kelimenin 4.harften sonra gösterilsin ? [ ipucu: substring(4)]
        // bu kelimenin sonuna INC ekleyelim  ? [ ipucu: concat(".INC")]
        // bu kelimenin içerisinde java44 geçiyor mu ? [ ipucu: contains("java44")]
        // bu kelimenin "deneme" ile aynı mı ?  [ipucu: ipucu: equals("deneme");]

        //equals ile comparateTo arasındaki fark nedir ? ==> Berkan
        //split

        //StringBuilder: bağlama, birleştirmek


    }
}
