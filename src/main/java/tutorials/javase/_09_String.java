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
    }
}
