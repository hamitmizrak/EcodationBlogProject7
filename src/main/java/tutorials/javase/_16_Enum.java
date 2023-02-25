package tutorials.javase;

public enum _16_Enum {
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR;
}

class MainEnum{
    public static void main(String[] args) {
        System.out.println(_16_Enum.CARSAMBA);

        String days= _16_Enum.CARSAMBA.toString();
        System.out.println(days);

        System.out.println(_16_Enum.values()[0]);

        System.out.println("++++++++++++++++++++++");

        for ( _16_Enum temp : _16_Enum.values()  ){
            System.out.println(temp);
        }

    }
}
