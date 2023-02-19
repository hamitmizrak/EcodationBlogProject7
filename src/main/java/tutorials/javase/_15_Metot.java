package tutorials.javase;

public class _15_Metot {

    public static void voidliParametresiz() {
        System.out.println("voidli Parametresiz ");
    }

    public static void voidliParametreli(String name) {
        System.out.println("voidli Parametreli " + name);
    }

    public static String returnluParametresiz() {
        return "returnluParametresiz";
    }

    //number:parametre
    public static String returnluParametreli(double number) {
        return "returnluParametresiz: "+number;
    }


    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("Java");

        String data = returnluParametresiz();
        System.out.println(data);

        //55:arguman
        String data2 = returnluParametreli(55);
        System.out.println(data2);
    }

    //parametre
    //arguman

}
