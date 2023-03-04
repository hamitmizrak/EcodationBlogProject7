package tutorials.jav.examples;

import tutorials.javase._00_HamitMizrakException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    //Şimdilik kalan hak static yapacağım ancak bunu normalde Filen ile yapmalıyız.
    private static int COUNTER = 4;

    // Biz : sayı tahmin oyunu (bilgisayarın ürettiği sayıyı tahmin etmeye çalışalım.)

    // step-1:  kullanıcıdan aldığımız bir sayı(Scanner veya jOptionalPane) metotlar?
    // Validation: Kullanıcı negatif sayı giremez,
    // Validation: Kullanıcı sadece sayı girebilir. Eğer özel simge veya harf girerse bizi uyarsın,
    // Validation: Kullanıcı sadece sayı sınırı olsun 1-10000 arasında sadece sayı girebilir.
    public static int userNumber() throws _00_HamitMizrakException {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nTahmin için bir sayı giriniz");
        int number = 0;
        try {
            number = klavye.nextInt();
            if (number < 0) {
                System.out.println("Lütfen pozitif sayı giriniz");
            } else if (number >= 10000) {
                System.out.println("Lütfen 1<=X<=10000 dışında sayı vermeyiniz");
            }
        } catch (InputMismatchException inputMismatchException) {
            //throw  new HamitMizrakException("Lütfen dikkat Sadece sayı giriniz");
            System.out.println("Lütfen dikkat Sadece sayı giriniz: " + inputMismatchException);
            userNumber();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return number;
    }

    // step-2:  bilgisayar  1-10 arasında sayı üretsin bu tahmin edeceğimiz sayı olacak (Random Object) metot
    public static int computerNumber() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        return number;
    }

    public static void main() throws _00_HamitMizrakException {
        Scanner klavye=new Scanner(System.in);
        char conditional = 0;

        while(true){
            int computerNumber = computerNumber();
            System.out.println("Bilgisayar sayısı: "+computerNumber);
            int userData = userNumber();

            if (COUNTER > 0) {
                if (userData == computerNumber) {
                    System.out.println("Doğru bildiniz "+(4-COUNTER)+" kerede bildiniz");
                    System.out.println(" Tekrar oynamak ister misiniz E veya H");
                    conditional=klavye.nextLine().charAt(0);
                    if(conditional=='E'){
                        main();
                    }else{
                        System.out.println("Çıkış yapılıyor.");
                        System.exit(0);
                    }
                } else {
                    COUNTER--;
                    System.out.println("Kalan hakkınız: " + COUNTER);
                }
            } else {
                if (COUNTER == 0) {
                    System.out.println("Hakkınız kalmadı Tekrar oynamak ister misiniz E veya H");
                    conditional=klavye.nextLine().charAt(0);
                    if(conditional=='E'){

                    }else{
                        System.out.println("Çıkış yapılıyor.");
                        System.exit(0);
                    }

                }
            }
        }
    }

    public static void main(String[] args) throws _00_HamitMizrakException {
      main();
    }

// Step- 3:
// result:  sayı tahmin sayımız 4 defa olmalıdır.
// NOT: Her yanlış tahminde  "C:\\io\\numberguessing.txt"; metin belgesine yanlış  tahminleri yazsın. yazarken  false ==> new BufferedWriter(new FileWriter(URL, false)))
// NOT: tahmini yazarken hem okuma hem yazma işlemi var dikkat.

// Step- 4:
// result:  Ekranda kaçıncı tahminde bulduğumuzu bize söylesin. (kalan tahmini "C:\\io\\numberguessing.txt"; metin belgesine okuma işlemi yapsın)

// Step- 5:
// result:  Eğer doğru tahmin edersek, bize soru sorsun oyunu tekrar oynamak istiyor musunuz ?
// result:  eğer cevabımız evetse oyuna tekrar oynatsın. eğer hayırsa şimdiye kadar bu oyunu kaç kere oynadığımızı bize söylesin. (static değişkenle yapabiliriz).
}



