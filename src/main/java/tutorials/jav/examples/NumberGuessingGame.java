package tutorials.jav.examples;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Biz : sayı tahmin oyunu (bilgisayarın ürettiği sayıyı tahmin etmeye çalışalım.)

    // step-1:  kullanıcıdan aldığımız bir sayı(Scanner veya jOptionalPane) metotlar?
    // Validation: Kullanıcı negatif sayı giremez,
    // Validation: Kullanıcı sadece sayı girebilir. Eğer özel simge veya harf girerse bizi uyarsın,
    // Validation: Kullanıcı sadece sayı sınırı olsun 1-10000 arasında sadece sayı girebilir.
    private int userNumber() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nTahmin için bir sayı giriniz");
        int number = klavye.nextInt();
        if(number<0){
            System.out.println("Lütfen pozitif sayı giriniz");
        }else if(number>=10000){
            System.out.println("Lütfen 1<=X<=10000 dışında sayı vermeyiniz");
        }
        return number;
    }

    private static void userSpecialNumber(){
        char c1='@';
        if(Character.isDigit(c1)){
            System.out.println("Sayıdır");
        }else if(Character.isLetter(c1)){
            System.out.println("Harftir");
        }else{
            System.out.println("Özel karakter");
        }
    }

    // step-2:  bilgisayar  1-10 arasında sayı üretsin bu tahmin edeceğimiz sayı olacak (Random Object) metot
    private int computerNumber() {
        Random random = new Random();
        int number = random.nextInt(10)+1;
        return number;
    }

    public static void main(String[] args) {
        //while(true){}

        userSpecialNumber();
        /*NumberGuessingGame game=new NumberGuessingGame();
        for(;;){
            int computer= game.computerNumber();
            System.out.println("computer sayısı: "+computer);

           int user=  game.userNumber();
            System.out.println(user);
        }*/
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
