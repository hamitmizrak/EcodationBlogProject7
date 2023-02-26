package tutorials.javase;

import lombok.Getter;
import lombok.Setter;

public class _19_Country {

    @Getter @Setter
    private String countryName;

    public static class City{
        @Getter @Setter
        private String cityName;

        public static class Neighbourhood{
            @Getter @Setter
            private String neighbourName;
        }

    }
}

class MainClass{
    public static void main(String[] args) {
        _19_Country country=new _19_Country();
        country.setCountryName("Türkiye");

        _19_Country.City city=new _19_Country.City();
        city.setCityName("Bingöl");

        _19_Country.City.Neighbourhood neighbourhood=new _19_Country.City.Neighbourhood();
        neighbourhood.setNeighbourName("susam sokağı");

        System.out.println("Ülke: "+country.getCountryName()+" İl: "+city.getCityName()+" Mahalle:  "+neighbourhood);
    }
}

// File
// NumberGuessingGame
// Generics
// Collection
// OOP nedir ? Class
// Inheritance
// abstract
// interface
// JAVA 8 gelen özelliklerden











































