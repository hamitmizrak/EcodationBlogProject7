package tutorials.javase;

/*
Kullanıcıdan alacağımız kendi ismizi String'e atayalım. ve adımlar aşağıda görmekteyiz;
1-) String değişkenini for döngüsüyle char dizisine atayalım.
2-) 3X3 char dizi matrixi oluşturalım.
3-) Bu ismin orta harfi  diagonal tam ortasına gelsin;
eğer isimizin tek rakamsa ortanca formülü: harf/2
eğer isimizin çift rakamsa ortanca formülü: harf/2+1

4-) Bu ismin ilk harfi diagonal üstüne gelsin (ipucu: dizi[0] veya kelime.charAt(0) )
5-) Bu ismin son harfi diagonal altına gelsin (ipucu: dizi[kelime.length-1] veya kelime.charAt(kelime.length-1) )
*/

import java.util.Scanner;

// Not: Javada metotlarda dizileri gösterirken üç noktayı kullanabiliriz.
// public void deneme(int[] dizi){}
// VEYA
// public void deneme(double... dizi){}
public class MatrixHomework {

    //Kullanıcıdan veri almak
    public String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String name = klavye.nextLine().toUpperCase();
        return name;
    }

    //String'i char diziye atadım.
    public char[] stringToChar() {
        String name = userData();
        char[] nameChar = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            nameChar[i] = name.charAt(i);
        }
        //System.out.println(nameChar[0]); //ilk eleman
        //System.out.println(nameChar[nameChar.length - 1]); //son eleman
        //System.out.println(nameChar[nameChar.length / 2]); //ortanca
        return nameChar;
    }

    // diagonal i==k i>k i<k
    public char[][] charProcess() {
        char[][] matrix = new char[3][3];
        char[] stringToChar = stringToChar();
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (i == k) {//diagonal ortanca tarafı
                    matrix[i][k] = stringToChar[stringToChar.length / 2];
                } else if (i > k) { //diagonal alt tarafı
                    matrix[i][k] = stringToChar[stringToChar.length - 1];
                } else if (i < k) {//diagonal üst tarafı
                    matrix[i][k] = stringToChar[0];
                }
            }
            System.out.println();
        }
        return matrix;
    }

    //matrix elemanlarını göstermek
    public void charProcessShowing(char[][] matrix) {
        // döngüyü göstermek
        for (int i = 0; i < matrix.length; i++) {//satır
            for (int k = 0; k < matrix[i].length; k++) {//sutun
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixHomework matrixHomework = new MatrixHomework();
        matrixHomework.charProcessShowing(matrixHomework.charProcess());
    }
}
