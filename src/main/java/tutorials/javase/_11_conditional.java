package tutorials.javase;

public class _11_conditional {
    //conditional
    //loop
    //break-return-continue
    //calendar
    //exception handling
    //debug

    //access modifier
    //metot

    public static void main(String[] args) {
        int number=4;
        /*if(number<0){
            System.out.println("Negatif sayıdır");
        }else{
            System.out.println("Pozitif sayıdır");
        }

        //ternary
        String number2= (number<0) ? "Negatif sayıdır" :"Pozitif sayıdır" ;
        System.out.println(number2.toUpperCase());*/

        //else if
        if(number==0){
            System.out.println("0");
        }else if(number==1){
            System.out.println("1");
        }else if(number==2){
            System.out.println("2");
        }else if(number==3){
            System.out.println("3");
        }else if(number==4){
            System.out.println("4");
        }else{
            System.out.println("0<=X<=4 dışındadır.");
        }

        //switch case
        switch (number){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("0<=X<=4 dışındadır.");
                break;
        }

        // ÖDEV
        // kullanıcıdan alınan password ve repassword eşitse eşit olduğunu değilse (equals)
        // eşit olmadığını ekranda göstersin.

        // ÖDEV
        // kullanıcıdan alınan bir değerin sayı mı? harf mi ? özel simge mi ?

        // Biz : sayı tahmin oyunu ?
        // kullanıcıdan aldığımız bir sayı(Scanner veya jOptionalPnane) ile bilgisayarın 1-10 arasında sayı üretsin (Random Object)
        // bilgisayarın ürettiği sayıyı tahmin etmeye çalışalım.

        // sayı tahmin sayımız 3 defa olmalıdır
        // Ekranda kaçıncı tahminde bulduğumuzu bize söylesin.
        // Eğer doğru tahmin edersek, bize soru sorsun oyunu tekrar oynamak istiyor musunuz ?
        // eğer cevabımız evetse oyuna tekrar oynatsın. eğer hayırsa şimdiye kadar bu oyunu kaç kere oynadığımızı bize söylesin.

        // Validation: Kullanıcı negatif sayı giremez,
        // Validation: Kullanıcı sadece sayı girebilir. Eğer özel simge veya harf girerse bizi uyarsın,
        // Validation: Kullanıcı sadece sayı sınırı olsun 1-10000 arasında sadece sayı girebilir.

    }
}
