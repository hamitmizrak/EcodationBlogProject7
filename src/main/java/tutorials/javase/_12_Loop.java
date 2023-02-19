package tutorials.javase;

public class _12_Loop {
    //conditional
    //loop
    //break-return-continue
    //calendar
    //exception handling
    //debug

    //access modifier
    //metot

    public static void main(String[] args) {


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


        //1-10 arasında sayıları toplayan algoritma yazınız ?
        System.out.println("++++++FOR++++++++++");
        int sum=0;
        for (int i=1; i<=10; i++){
            //sum=sum+i;
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("++++++WHILE++++++++++");
        int sum1=0;
        int k=1;
        while(k<=10){
            sum1+=k;
            k++;
        }
        System.out.println(sum1);

        System.out.println("++++++DO-WHILE++++++++++");
        int sum2=0;
        int m=1;
        do{
            sum2+=m;
            m++;
        }while(m<=10);
        System.out.println(sum2);
    }
}
