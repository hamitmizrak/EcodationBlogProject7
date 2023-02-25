package tutorials.javase;

import java.util.Arrays;

public class _17_Arrays {

    //Diziler
    //dizilerde eleman sayısını vermek zorundayız.
    //diziler saymaya sıfırdan başlar
    public static void main(String[] args) {
        /*int[] diziAdim = new int[9];
        diziAdim[0]=0;
        diziAdim[3]=3;
        diziAdim[4]=4;
        diziAdim[8]=9;
        diziAdim[7]=7;*/

        int[] diziAdim = {0,1,5,6,9,2,5,1,6,4};



        //iterative for
        for (int i = 0; i <diziAdim.length ; i++) {
            System.out.print(diziAdim[i]+" ");
        }

        System.out.println("\n*****************");

        //java.util.Arrays.sort(diziAdim);
        Arrays.sort(diziAdim);
        boolean isdata=  Arrays.equals(diziAdim,diziAdim);
        System.out.println(isdata);

        //forEach
        for (int  temp : diziAdim) {
            System.out.print(temp+" ");
        }
        System.out.println("\n"+diziAdim[3]);
        int data=diziAdim[3];

        System.out.println("\n*****CLONE************");

        int[] diziClone=  diziAdim.clone();
        for (int  temp : diziClone) {
            System.out.print(temp+" ");
        }

    }
}
