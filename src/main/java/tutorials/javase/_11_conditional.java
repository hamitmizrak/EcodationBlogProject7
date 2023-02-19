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

        // kullanıcıdan alınan password ve repassword eşitse eşit olduğunu değilse
        // eşit olmadığını ekranda göstersin.

        // kullanıcıdan alınan bir değerin sayı mı? harf mi ? özel simge mi ?

        // Ödev : sayı tahmin oyunu ?

    }
}
