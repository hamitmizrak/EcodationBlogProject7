package tutorials.javase;


public class _07_examples {
    public static void main(String[] args) {
        // 1.soru
        // 1.dereceden 2 bilinmeyenli denklem
        // y=3x+4k;
        // x=5;
        // k=3
        int x = 5;
        int k = 3;
        int y = 3 * x + 4 * k;
        System.out.println(y);


        // 2.soru
        // 2.soru
        // Dereceyi Fahrenhayt
        // (derece*9/5)+32
        // 0 derece 32 fahrenhayttır
        double degree,fahrenhayt;
        degree=0;
        fahrenhayt=(degree*9/5)+32;
        System.out.println(degree+" derece: "+fahrenhayt+" fahrenhayttır.");

        // 3.soru iki sayıda dört işlem
        // x1=4,x2=2;
        // bölme/çıkarma/çarpma/toplama/bölümünden kalan(%)
        int x1=4,x2=2;
        System.out.println("toplam: "+(x1+x2));
        System.out.println("çıkarma: "+(x1-x2));
        System.out.println("çarpma: "+(x1*x2));
        System.out.println("bölme: "+(x1/x2));
        System.out.println("bölümünden kalan: "+(x1%x2));

        //4.soru: Kullanıcıdan alınan değere göre VKI hesaplayan algoritma ?
        //kullanıcıdan alınan değerle anlatılacaktır.


    }
}

