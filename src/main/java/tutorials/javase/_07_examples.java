package tutorials.javase;


import javax.swing.*;

public class _07_examples {
    public static void main(String[] args) {
        // 1.soru
        // 1.dereceden 2 bilinmeyenli denklem
        // y=3x+4k;
        // x=5;
        // k=3
        /*int x = 5;
        int k = 3;
        int y = 3 * x + 4 * k;
        System.out.println(y);*/


        // 2.soru
        // 2.soru
        // Dereceyi Fahrenhayt
        // (derece*9/5)+32
        // 0 derece 32 fahrenhayttır
        /*double degree,fahrenhayt;
        degree=0;
        fahrenhayt=(degree*9/5)+32;
        System.out.println(degree+" derece: "+fahrenhayt+" fahrenhayttır.");*/

        // 3.soru iki sayıda dört işlem
        // x1=4,x2=2;
        // bölme/çıkarma/çarpma/toplama/bölümünden kalan(%)
        /*int x1=4,x2=2;
        System.out.println("toplam: "+(x1+x2));
        System.out.println("çıkarma: "+(x1-x2));
        System.out.println("çarpma: "+(x1*x2));
        System.out.println("bölme: "+(x1/x2));
        System.out.println("bölümünden kalan: "+(x1%x2));*/

        //cast:
        //1-) float long
        /*float f1=44.55f;
        long l1=14444515415451L;

        //2-)boxing:
        int primitive=14;
        Integer wrapper=primitive;

        //3-) String to Integer
        String kelime="44";
        int cast1=Integer.valueOf(kelime);  //
        int cast2=Integer.parseInt(kelime); // bu daha hızlı
        int sayi1=16+cast2;
        System.out.println(sayi1);

        //4-)   Integer to String
        int sayi2=44;
        String cast3=String.valueOf(sayi2);
        String cast4=Integer.toString(sayi2);*/


        //4.soru: Kullanıcıdan alınan değere göre VKI hesaplayan algoritma ?
        //kullanıcıdan alınan değerle anlatılacaktır.
        //vki = kilo / boy * boy;
        //JOptioanl pane: String veri döndürür.
        String kilo= JOptionPane.showInputDialog("Lütfen kilonunuzu giriniz");
        double kiloCast=Double.valueOf(kilo);
        System.out.println(kiloCast);

        String boy= JOptionPane.showInputDialog("Lütfen boyunuzu giriniz");
        double boyCast=Double.valueOf(boy);
        System.out.println(boyCast);

        double vki = (kiloCast / (boyCast * boyCast));
        System.out.println(vki);


    }
}

